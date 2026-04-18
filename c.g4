grammar c;

// ==========================
// Entrada
// ==========================
compilationUnit
    : externalDeclaration* EOF
    ;

externalDeclaration
    : functionDefinition
    | declaration
    ;

// ==========================
// Tipos
// ==========================
typeSpecifier
    : 'int'
    | 'float'
    | 'char'
    | 'void'
    | 'double'
    | 'long'
    | 'short'
    ;

// ==========================
// Declarações
// ==========================
declaration
    : typeSpecifier initDeclaratorList ';'
    ;

initDeclaratorList
    : initDeclarator (',' initDeclarator)*
    ;

initDeclarator
    : declarator ('=' initializer)?
    ;

initializer
    : assignmentExpression
    ;

// ==========================
// Declarators (suporte a ponteiros e arrays)
// ==========================
declarator
    : pointer? directDeclarator
    ;

pointer
    : '*' pointer?
    ;

directDeclarator
    : Identifier
    | '(' declarator ')'
    | directDeclarator '[' Constant? ']'
    | directDeclarator '(' parameterList? ')'
    ;

// ==========================
// Funções
// ==========================
functionDefinition
    : typeSpecifier declarator compoundStatement
    ;

parameterList
    : parameter (',' parameter)*
    | 'void'
    ;

parameter
    : typeSpecifier declarator
    ;

// ==========================
// Statements
// ==========================
compoundStatement
    : '{' blockItem* '}'
    ;

blockItem
    : declaration
    | statement
    ;

statement
    : expressionStatement
    | compoundStatement
    | selectionStatement
    | iterationStatement
    | jumpStatement
    ;

expressionStatement
    : expression? ';'
    ;

selectionStatement
    : 'if' '(' expression ')' statement ('else' statement)?
    ;

iterationStatement
    : 'while' '(' expression ')' statement
    | 'for' '(' (declaration | expression?) ';' expression? ';' expression? ')' statement
    ;

jumpStatement
    : 'return' expression? ';'
    ;

// ==========================
// Expressões (com precedência correta)
// ==========================
expression
    : assignmentExpression (',' assignmentExpression)*
    ;

assignmentExpression
    : unaryExpression assignmentOperator assignmentExpression
    | logicalOrExpression
    ;

assignmentOperator
    : '=' | '+=' | '-=' | '*=' | '/='
    ;

logicalOrExpression
    : logicalAndExpression ('||' logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression ('&&' equalityExpression)*
    ;

equalityExpression
    : relationalExpression (('==' | '!=') relationalExpression)*
    ;

relationalExpression
    : additiveExpression (('<' | '>' | '<=' | '>=') additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression (('*' | '/' | '%') unaryExpression)*
    ;

unaryExpression
    : postfixExpression
    | ('++' | '--') unaryExpression
    | ('+' | '-' | '!') unaryExpression
    ;

postfixExpression
    : primaryExpression
      (   '[' expression ']'
        | '(' argumentExpressionList? ')'
        | '++'
        | '--'
      )*
    ;

primaryExpression
    : Identifier
    | Constant
    | StringLiteral
    | '(' expression ')'
    ;

argumentExpressionList
    : assignmentExpression (',' assignmentExpression)*
    ;

// ==========================
// Tokens
// ==========================
Identifier
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

Constant
    : IntegerConstant
    | FloatingConstant
    | CharacterConstant
    ;

IntegerConstant
    : [0-9]+
    ;

FloatingConstant
    : [0-9]+ '.' [0-9]* (('e'|'E') ('+'|'-')? [0-9]+)?
    ;

CharacterConstant
    : '\'' (~['\\\r\n] | '\\' .) '\''
    ;

StringLiteral
    : '"' (~["\\\r\n] | '\\' .)* '"'
    ;

DOT : '.' ;

// ==========================
// Comentários
// ==========================
LineComment
    : '//' ~[\r\n]* -> skip
    ;

BlockComment
    : '/*' .*? '*/' -> skip
    ;

Whitespace
    : [ \t\r\n]+ -> skip
    ;