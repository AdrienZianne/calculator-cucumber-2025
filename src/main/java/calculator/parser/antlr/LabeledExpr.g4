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
                | trigoPostfix                                  #ProductPostfixTrigo
                ;

trigoPostfix : '(' atomPostfix ')' 'sin'   #TrigoPostfixSin
             | '(' atomPostfix ')' 'cos'   #TrigoPostfixCos
             | '(' atomPostfix ')' 'tan'   #TrigoPostfixTan
             | '(' atomPostfix ')' 'sinh'  #TrigoPostfixSinh
             | '(' atomPostfix ')' 'cosh'  #TrigoPostfixCosh
             | '(' atomPostfix ')' 'tanh'  #TrigoPostfixTanh
             | '(' atomPostfix ')' 'asin'  #TrigoPostfixASin
             | '(' atomPostfix ')' 'acos'  #TrigoPostfixACos
             | '(' atomPostfix ')' 'atan'  #TrigoPostfixATan
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
                | trigoPrefix                                   #ProductPrefixTrigo
                ;

trigoPrefix  : 'sin' '(' atomPrefix ')'   #TrigoPrefixSin
             | 'cos' '(' atomPrefix ')'   #TrigoPrefixCos
             | 'tan' '(' atomPrefix ')'   #TrigoPrefixTan
             | 'sinh' '(' atomPrefix ')'  #TrigoPrefixSinh
             | 'cosh' '(' atomPrefix ')'  #TrigoPrefixCosh
             | 'tanh' '(' atomPrefix ')'  #TrigoPrefixTanh
             | 'asin' '(' atomPrefix ')'  #TrigoPrefixASin
             | 'acos' '(' atomPrefix ')'  #TrigoPrefixACos
             | 'atan' '(' atomPrefix ')'  #TrigoPrefixATan
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

atomInfix: trigoInfix           #AtomInfixTrig
    | complexNumber             #AtomInfixComplex
    | '-' sumInfix              #AtomInfixNeg
    | '(' sumInfix ')'          #AtomInfixSum
    ;

trigoInfix   : 'sin' '(' sumInfix ')'   #TrigoInfixSin
             | 'cos' '(' sumInfix ')'   #TrigoInfixCos
             | 'tan' '(' sumInfix ')'   #TrigoInfixTan
             | 'sinh' '(' sumInfix ')'  #TrigoInfixSinh
             | 'cosh' '(' sumInfix ')'  #TrigoInfixCosh
             | 'tanh' '(' sumInfix ')'  #TrigoInfixTanh
             | 'asin' '(' sumInfix ')'  #TrigoInfixASin
             | 'acos' '(' sumInfix ')'  #TrigoInfixACos
             | 'atan' '(' sumInfix ')'  #TrigoInfixATan
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
      | '-' number                          #NumberNegation // In case someone wants the negative value of a number
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
