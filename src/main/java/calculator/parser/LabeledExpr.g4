grammar LabeledExpr; // rename to distinguish from Expr.g4


expr: sumInfix?     #ExprInfix
    | sumPrefix?    #ExprPrefix
    | sumPostfix?   #ExprPostfix
    ;

/* POSTFIX NOTATION */

sumPostfix : productPostfix
           | '('argsPostfix ')' '+'
           | '('argsPostfix ')' '-'
           ;

productPostfix  : '(' argsPostfix (','? argsPostfix)* ')' '*'
                | '(' argsPostfix (','? argsPostfix)* ')' '/'
                ;

argsPostfix :  INT (','? argsPostfix)*
            | sumPostfix
            | INT
            ;

/* PREFIX NOTATION */
sumPrefix : productPrefix
           | '+' '('argsPrefix ')'
           | '-' '('argsPrefix ')'
           ;

productPrefix  : '*' '(' argsPrefix (','? argsPrefix)* ')'
                | '/' '(' argsPrefix (','? argsPrefix)* ')'
                ;

argsPrefix :  INT (','? argsPrefix)*
            | sumPrefix
            | INT
            ;

/* INFIX NOTATION */
sumInfix : productInfix             #SumInfixProd
    | sumInfix '+' productInfix     #SumInfixAdd
    | sumInfix '-' productInfix     #SumInfixDiff
    ;

productInfix: atomInfix             #ProductInfixAtom
    | productInfix '*' atomInfix    #ProductInfixMult
    | productInfix '/' atomInfix    #ProductInfixDiv
    ;

atomInfix: INT          #AtomInfixInt
    | '-' INT           #AtomInfixNegation
    | '(' sumInfix ')'  #AtomInfixSum
    ;



MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
