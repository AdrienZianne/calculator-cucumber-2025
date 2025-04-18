grammar LabeledExpr; // rename to distinguish from Expr.g4


expr: (sumInfix
    | sumPrefix
    | sumPostfix) EOF;  // We expect only one root expression, without this, writting stuff like '(3+1)(' is accepted

/* POSTFIX NOTATION */

sumPostfix : productPostfix                                     #SumPostfixProd
           | '('atomPostfix (','? atomPostfix)* ')' '+'         #SumPostfixSum
           | '('atomPostfix (','? atomPostfix)* ')' '-'         #SumPostfixDiff
           ;

productPostfix  : '(' atomPostfix (','? atomPostfix)* ')' '*'   #ProductPostfixMult
                | '(' atomPostfix (','? atomPostfix)* ')' '/'   #ProductPostfixDiv
                ;

atomPostfix : sumPostfix                #AtomPostfixSum
            | complexNumber           #AtomPostfixInt
            ;

/* PREFIX NOTATION */
sumPrefix : productPrefix                               #SumPrefixProd
           | '+' '('atomPrefix (','? atomPrefix)* ')'   #SumPrefixSum
           | '-' '('atomPrefix (','? atomPrefix)* ')'   #SumPrefixDiff
           ;

productPrefix  : '*' '(' atomPrefix (','? atomPrefix)* ')'      #ProductPrefixMult
                | '/' '(' atomPrefix (','? atomPrefix)* ')'     #ProductPrefixDiv
                ;

atomPrefix  : sumPrefix         #AtomPrefixSum
            | complexNumber   #AtomPrefixInt
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

atomInfix: complexNumber               #AtomInfixInt
    | '-' sumInfix              #AtomInfixNeg
    | '(' sumInfix ')'          #AtomInfixSum
    ;

/* NUMBER and TOKENS */

// Checks to see if the number is imaginary at first or not
complexNumber   : number? 'i'    #ComplexImaginaryNumber
                | number         #ComplexRealNumber
                ;

// Add other number kinds, such as floats/doubles
number: rational                            #NumberRational // Placed first in order to *override* the infix division !
      | INT                                 #NumberInt
      | FLOAT                               #NumberReal
      | '-' number                          #NumberNegation
      ;


rational: INT '/' INT
        ;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;                   // match identifiers
INT :   [0-9]+ ;                      // match integers
FLOAT :   [0-9]+ '.' [0-9]* ;         // match real
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
