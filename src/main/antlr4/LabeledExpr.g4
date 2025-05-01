grammar LabeledExpr; // rename to distinguish from Expr.g4


expr: ( setting
    | sumInfix
    | sumPrefix
    | sumPostfix) EOF;  // We expect only one root expression, without this, writting stuff like '(3+1)(' is accepted



setting : 'seed' '(' INT ')'                             #SettingSetSeed
        | ('seed' '(' ')' | 'reset_seed' '(' ')' )       #SettingResetSeed
        | 'seed'                                         #SettingGetSeed
        | 'realPre' '(' INT ')'                          #SettingSetRealPrecision
        | 'realPre'                                      #SettingGetRealPrecision
        | 'scNot' '(' INT ',' INT ')'                            #SettingSetScNotInt
        | 'scNot' '(' BOOL ')'                           #SettingSetScNotBool
        | 'scNot'                                        #SettingGetScNot   // get the current scientific notation precision
        | 'useDeg' '(' BOOL ')'                          #SettingSetUseDeg
        | 'useDeg'                                       #SettingGetUseDeg
        | 'displayReal' '(' BOOL ')'                          #SettingSetDisplayReal
        | 'displayReal'                                       #SettingGetDisplayReal
        ;


/* POSTFIX NOTATION */

sumPostfix : productPostfix                                     #SumPostfixProd
           | '('atomPostfix (','? atomPostfix)* ')' '+'         #SumPostfixSum
           | '('atomPostfix (','? atomPostfix)* ')' '-'         #SumPostfixDiff
           | '('atomPostfix (','? atomPostfix)* ')' 'root'      #SumPostfixRoot
           ;

productPostfix  : '(' atomPostfix (','? atomPostfix)* ')' '^'   #ProductPostfixExp
                | '(' atomPostfix (','? atomPostfix)* ')' '*'   #ProductPostfixMult
                | '(' atomPostfix (','? atomPostfix)* ')' '/'   #ProductPostfixDiv
                | unaryPostfix                                  #ProductPostfixTrigo
                ;

unaryPostfix : trigoPostfix                 #UnaryPostfixTrigo
             | '(' atomPostfix ')' 'log'    #UnaryPostfixLog
             | '(' atomPostfix ')' 'sqrt'    #UnaryPostfixSqrt
             ;

trigoPostfix : '(' atomPostfix ')' 'sin'       #TrigoPostfixSin
             | '(' atomPostfix ')' 'cos'       #TrigoPostfixCos
             | '(' atomPostfix ')' 'tan'       #TrigoPostfixTan
             | '(' atomPostfix ')' 'sinh'      #TrigoPostfixSinh
             | '(' atomPostfix ')' 'cosh'      #TrigoPostfixCosh
             | '(' atomPostfix ')' 'tanh'      #TrigoPostfixTanh
             | '(' atomPostfix ')' 'asin'      #TrigoPostfixASin
             | '(' atomPostfix ')' 'acos'      #TrigoPostfixACos
             | '(' atomPostfix ')' 'atan'      #TrigoPostfixATan
             | '(' atomPostfix ')' 'degToRad'  #TrigoPostfixDegToRad
             | '(' atomPostfix ')' 'radToDeg'  #TrigoPostfixRadToDeg
             ;

atomPostfix : sumPostfix                #AtomPostfixSum
            | complexNumber           #AtomPostfixInt
            ;



/* PREFIX NOTATION */
sumPrefix : productPrefix                                   #SumPrefixProd
           | '+' '('atomPrefix (','? atomPrefix)* ')'       #SumPrefixSum
           | '-' '('atomPrefix (','? atomPrefix)* ')'       #SumPrefixDiff
           | 'root' '('atomPrefix (','? atomPrefix)* ')'    #SumPrefixRoot
           ;

productPrefix   : '^' '(' atomPrefix (','? atomPrefix)* ')'      #ProductPrefixExp
                | '*' '(' atomPrefix (','? atomPrefix)* ')'      #ProductPrefixMult
                | '/' '(' atomPrefix (','? atomPrefix)* ')'      #ProductPrefixDiv
                | unaryPrefix                                    #ProductPrefixUnary
                ;

unaryPrefix : trigoPrefix                    #UnaryPrefixTrigo
             | 'log' '(' atomPrefix ')'      #UnaryPrefixLog
             | 'sqrt' '(' atomPrefix ')'     #UnaryPrefixSqrt
             ;

trigoPrefix  : 'sin' '(' atomPrefix ')'       #TrigoPrefixSin
             | 'cos' '(' atomPrefix ')'       #TrigoPrefixCos
             | 'tan' '(' atomPrefix ')'       #TrigoPrefixTan
             | 'sinh' '(' atomPrefix ')'      #TrigoPrefixSinh
             | 'cosh' '(' atomPrefix ')'      #TrigoPrefixCosh
             | 'tanh' '(' atomPrefix ')'      #TrigoPrefixTanh
             | 'asin' '(' atomPrefix ')'      #TrigoPrefixASin
             | 'acos' '(' atomPrefix ')'      #TrigoPrefixACos
             | 'atan' '(' atomPrefix ')'      #TrigoPrefixATan
             | 'degToRad' '(' atomPrefix ')'  #TrigoPrefixDegToRad
             | 'radToDeg' '(' atomPrefix ')'  #TrigoPrefixRadToDeg
             ;

atomPrefix  : sumPrefix         #AtomPrefixSum
            | complexNumber   #AtomPrefixInt
            ;

/* INFIX NOTATION */
sumInfix : productInfix                             #SumInfixProd
    | sumInfix '+' productInfix                     #SumInfixAdd
    | sumInfix '-' productInfix                     #SumInfixDiff
    | 'root' '(' sumInfix + ',' + sumInfix ')'      #SumInfixRoot
    ;

productInfix: atomInfix             #ProductInfixAtom
    | productInfix '^' atomInfix    #ProductInfixExpo
    | productInfix '*' atomInfix    #ProductInfixMult
    | productInfix '/' atomInfix    #ProductInfixDiv
    ;

atomInfix: unaryInfix           #AtomInfixUnary
    | complexNumber             #AtomInfixComplex
    | '(' sumInfix ')'          #AtomInfixSum
    ;

unaryInfix: trigoInfix                                   #UnaryInfixTrigo
          | 'log' + '(' + sumInfix +  ')'                #UnaryInfixLog
          | 'sqrt' + '(' + sumInfix +  ')'               #UnaryInfixSqrt
          | '-' productInfix   #UnaryInfixNegation
          ;

trigoInfix   : 'sin' '(' sumInfix ')'       #TrigoInfixSin
             | 'cos' '(' sumInfix ')'       #TrigoInfixCos
             | 'tan' '(' sumInfix ')'       #TrigoInfixTan
             | 'sinh' '(' sumInfix ')'      #TrigoInfixSinh
             | 'cosh' '(' sumInfix ')'      #TrigoInfixCosh
             | 'tanh' '(' sumInfix ')'      #TrigoInfixTanh
             | 'asin' '(' sumInfix ')'      #TrigoInfixASin
             | 'acos' '(' sumInfix ')'      #TrigoInfixACos
             | 'atan' '(' sumInfix ')'      #TrigoInfixATan
             | 'degToRad' '(' sumInfix ')'  #TrigoInfixDegToRad
             | 'radToDeg' '(' sumInfix ')'  #TrigoInfixRadToDeg
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
      | constant                            #NumberContant
      | random                              #NumberRandom
      | number ENOTATION                    #NumberENotation
      | '-' complexNumber                   #NumberNegation // In case someone wants the negative value of a number
      ;

random : 'rand_int' '(' INT ')'                         #RandomInt
       | 'rand_real' '(' ')'                            #RandomReal
       | 'rand_ratio' '(' INT ',' INT ')'               #RandomRatio
       | 'rand_cmplx' '(' ')'                           #RandomComplex
       ;

constant: ('pi' | 'PI' | 'Pi' | 'pI' | 'π') #ConstantPi
        | ('E' | 'e')                       #ConstantEuler
        ;

rational: INT '/' INT
        ;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
BOOL :   'true'|'false' ;                      // match booleans
ID  :   [a-zA-Z]+ ;                   // match identifiers
INT :   [0-9]+ ;                      // match integers
ENOTATION : ('E'|'e') '-'? INT;
FLOAT :   [0-9]+ '.' [0-9]* ;         // match real
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
