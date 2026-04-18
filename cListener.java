// Generated from c.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cParser}.
 */
public interface cListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(cParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(cParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(cParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(cParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(cParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(cParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(cParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(cParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(cParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(cParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(cParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(cParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(cParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(cParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(cParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(cParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(cParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(cParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(cParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(cParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(cParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(cParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(cParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(cParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(cParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(cParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(cParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(cParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(cParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(cParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(cParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(cParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(cParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(cParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(cParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(cParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(cParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(cParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(cParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(cParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(cParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(cParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(cParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(cParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(cParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(cParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(cParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(cParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(cParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(cParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(cParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(cParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(cParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(cParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(cParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(cParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(cParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(cParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(cParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(cParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(cParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(cParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(cParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(cParser.ArgumentExpressionListContext ctx);
}