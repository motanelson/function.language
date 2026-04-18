import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
         if (args.length == 0) {
            System.out.println("Uso: java JSInterpreter <ficheiro.js>");
            return;
        }

        String code = new String(Files.readAllBytes(Paths.get(args[0])));

        CharStream input = CharStreams.fromString(code);
        cLexer lexer = new cLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cParser parser = new cParser(tokens);

        ParseTree tree = parser.compilationUnit();

        EvalVisitor visitor = new EvalVisitor();
        Object result = visitor.visit(tree);

        //System.out.println("Resultado: " + result);
    }
}
