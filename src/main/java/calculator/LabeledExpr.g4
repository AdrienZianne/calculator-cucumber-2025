grammar LabeledExpr; // rename to distinguish from Expr.g4


expr: sum_infix?
    | sum_prefix?
    | sum_postfix?
    ;

/* POSTFIX NOTATION */

sum_postfix : product_postfix
           | '('args_postfix ')' '+'
           | '('args_postfix ')' '-'
           ;

product_postfix  : '(' args_postfix (','? args_postfix)* ')' '*'
                | '(' args_postfix (','? args_postfix)* ')' '/'
                ;

args_postfix :  INT (','? args_postfix)*
            | sum_postfix
            | INT
            ;

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
sum_infix : product_infix
    | sum_infix '+' product_infix
    | sum_infix '-' product_infix
    ;

product_infix: atom_infix
    | product_infix '*' atom_infix
    | product_infix '/' atom_infix
    ;

atom_infix: INT
    | '-' INT
    | '(' sum_infix ')'
    ;


MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace