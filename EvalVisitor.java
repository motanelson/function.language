import java.util.*;

public class EvalVisitor extends cBaseVisitor<Object> {

    // memória global
    private Map<String, Object> memory = new HashMap<>();

    // stack de funções
    private Map<String, cParser.FunctionDefinitionContext> functions = new HashMap<>();

    // ==========================
    // Entrada
    // ==========================
    @Override
    public Object visitCompilationUnit(cParser.CompilationUnitContext ctx) {
        // guardar funções
        for (var child : ctx.externalDeclaration()) {
            if (child.functionDefinition() != null) {
                var f = child.functionDefinition();
                String name = f.declarator().getText().split("\\(")[0];
                functions.put(name, f);
            }
        }

        // executar main()
        if (!functions.containsKey("main")) {
            throw new RuntimeException("Função main não encontrada");
        }

        return callFunction("main", new ArrayList<>());
    }

    // ==========================
    // Funções
    // ==========================
    private Object callFunction(String name, List<Object> args) {
        var func = functions.get(name);

        Map<String, Object> local = new HashMap<>(memory);

        // parâmetros
        if (func.declarator().directDeclarator().parameterList() != null) {
            var params = func.declarator().directDeclarator().parameterList().parameter();
            for (int i = 0; i < params.size(); i++) {
                String pName = params.get(i).declarator().getText();
                local.put(pName, args.get(i));
            }
        }

        Map<String, Object> old = memory;
        memory = local;

        Object result = visit(func.compoundStatement());

        memory = old;
        return result;
    }

    // ==========================
    // Bloco
    // ==========================
    @Override
    public Object visitCompoundStatement(cParser.CompoundStatementContext ctx) {
        for (var item : ctx.blockItem()) {
            Object r = visit(item);
            if (r instanceof ReturnValue) {
                return ((ReturnValue) r).value;
            }
        }
        return null;
    }

    // ==========================
    // Declaração
    // ==========================
    @Override
    public Object visitDeclaration(cParser.DeclarationContext ctx) {
        for (var init : ctx.initDeclaratorList().initDeclarator()) {
            String name = init.declarator().getText();

            Object value = 0;
            if (init.initializer() != null) {
                value = visit(init.initializer());
            }

            memory.put(name, value);
        }
        return null;
    }

    // ==========================
    // Return
    // ==========================
    @Override
    public Object visitJumpStatement(cParser.JumpStatementContext ctx) {
        Object val = null;
        if (ctx.expression() != null) {
            val = visit(ctx.expression());
        }
        return new ReturnValue(val);
    }

    // ==========================
    // If
    // ==========================
    @Override
    public Object visitSelectionStatement(cParser.SelectionStatementContext ctx) {
        boolean cond = toBool(visit(ctx.expression()));

        if (cond) return visit(ctx.statement(0));
        else if (ctx.statement().size() > 1) return visit(ctx.statement(1));

        return null;
    }

    // ==========================
    // While
    // ==========================
    @Override
    public Object visitIterationStatement(cParser.IterationStatementContext ctx) {

        // WHILE
        if (ctx.getChild(0).getText().equals("while")) {
            while (toBool(visit(ctx.expression(0)))) {
                Object r = visit(ctx.statement());
                if (r instanceof ReturnValue) return r;
            }
        }

        // FOR (simplificado)
        else {
            if (ctx.expression(0) != null)
                visit(ctx.expression(0)); // init

            while (ctx.expression(1) == null || toBool(visit(ctx.expression(1)))) {

                 Object r = visit(ctx.statement());
                 if (r instanceof ReturnValue) return r;

                 if (ctx.expression(2) != null)
                    visit(ctx.expression(2)); // increment
            }
        }

        return null;
    }

    // ==========================
    // Expressões
    // ==========================
    @Override
    public Object visitAssignmentExpression(cParser.AssignmentExpressionContext ctx) {
        if (ctx.assignmentOperator() != null) {
            String name = ctx.unaryExpression().getText();
            Object value = visit(ctx.assignmentExpression());
            memory.put(name, value);
            return value;
        }
        return visit(ctx.logicalOrExpression());
    }

    @Override
    public Object visitPrimaryExpression(cParser.PrimaryExpressionContext ctx) {

        if (ctx.StringLiteral() != null) {
            String text = ctx.StringLiteral().getText();
            return text.substring(1, text.length() - 1); // remove ""
        }

        if (ctx.Identifier() != null) {
            String name = ctx.Identifier().getText();
            if (!memory.containsKey(name))
                throw new RuntimeException("Variável não definida: " + name);
            return memory.get(name);
        }

        if (ctx.Constant() != null) {
            return Integer.parseInt(ctx.Constant().getText());
        }

        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }

        return null;
    }

    @Override
    public Object visitAdditiveExpression(cParser.AdditiveExpressionContext ctx) {
        Object result = visit(ctx.multiplicativeExpression(0));

        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            Object right = visit(ctx.multiplicativeExpression(i));

            if (ctx.getChild(2 * i - 1).getText().equals("+"))
                result = toInt(result) + toInt(right);
            else
                result = toInt(result) - toInt(right);
        }

        return result;
    }

    @Override
    public Object visitMultiplicativeExpression(cParser.MultiplicativeExpressionContext ctx) {
        Object result = visit(ctx.unaryExpression(0));

        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            Object right = visit(ctx.unaryExpression(i));

            String op = ctx.getChild(2 * i - 1).getText();

            switch (op) {
                case "*": result = toInt(result) * toInt(right); break;
                case "/": result = toInt(result) / toInt(right); break;
                case "%": result = toInt(result) % toInt(right); break;
            }
        }

        return result;
    }
@Override
    public Object visitPostfixExpression(cParser.PostfixExpressionContext ctx) {

        // chamada de função
        if (ctx.getChildCount() >= 3 && ctx.getChild(1).getText().equals("(")) {

            String funcName = ctx.primaryExpression().getText();

            List<Object> args = new ArrayList<>();

            if (!ctx.argumentExpressionList().isEmpty()) {
                var argList = ctx.argumentExpressionList(0);

                for (var expr : argList.assignmentExpression()) {
                    args.add(visit(expr));
                }
            }
                
            

            // ==========================
            // BUILTIN: printf
            // ==========================
            if (funcName.equals("printf")) {
                return builtinPrintf(args);
            }

            // chamada normal
            return callFunction(funcName, args);
        }

        return visitChildren(ctx);
    }
    private Object builtinPrintf(List<Object> args) {

        if (args.isEmpty()) return 0;

        Object first = args.get(0);

        // se for string literal
        if (first instanceof String) {
            String format = (String) first;

            // substituir %d pelos argumentos
            for (int i = 1; i < args.size(); i++) {
                format = format.replaceFirst("%d", args.get(i).toString());
            }

            System.out.print(format);
        } else {
            // fallback simples
            for (Object arg : args) {
                System.out.print(arg + " ");
            }
        }

        return 0;
    }
    // ==========================
    // Utils
    // ==========================
    private int toInt(Object o) {
        return ((Number) o).intValue();
    }

    private boolean toBool(Object o) {
        return toInt(o) != 0;
    }

    static class ReturnValue {
        Object value;
        ReturnValue(Object v) { value = v; }
    }
}
