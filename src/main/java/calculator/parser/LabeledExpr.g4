grammar LabeledExpr; // rename to distinguish from Expr.g4


expr: sumInfix?
    | sumPrefix?
    | sumPostfix?
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
sumInfix : productInfix
    | sumInfix '+' productInfix
    | sumInfix '-' productInfix
    ;

productInfix: atomInfix
    | productInfix '*' atomInfix
    | productInfix '/' atomInfix
    ;

atomInfix: INT
    | '-' INT
    | '(' sumInfix ')'
    ;


MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace