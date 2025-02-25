grammar LabeledExpr; // rename to distinguish from Expr.g4


expr: sum?
    | sum_prefix?;



/* PREFIX NOTATION */
sum_prefix : product_prefix
           | '+' '('args_prefix ')'
           | '-' '('args_prefix ')'
           ;


product_prefix  : '*' '(' args_prefix (','? args_prefix)* ')'
                | '/' '(' args_prefix (','? args_prefix)* ')'
                ;


args_prefix :  INT (','? args_prefix)*
            | sum_prefix
            | INT
            ;







/* INFIX NOTATION */
sum : product
    | sum '+' product
    | sum '-' product
    ;

product: atom               # Simple
    | product '*' atom      # Mult
    | product '/' atom      # Div
    ;


atom: INT
    | '-' INT
    | '(' sum ')'
    ;



MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace