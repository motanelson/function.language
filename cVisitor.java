// Generated from c.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(cParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(cParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(cParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(cParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(cParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(cParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(cParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(cParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(cParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(cParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(cParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(cParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(cParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(cParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(cParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(cParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(cParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(cParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(cParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(cParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(cParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(cParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(cParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(cParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(cParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(cParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(cParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(cParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(cParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(cParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(cParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(cParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(cParser.ArgumentExpressionListContext ctx);
}