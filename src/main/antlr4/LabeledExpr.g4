grammar LabeledExpr; // rename to distinguish from Expr.g4


expr: equation EOF
    | sumInfix EOF
    | sumPrefix EOF
    | sumPostfix EOF;  // We expect only one root expression, without this, writting stuff like '(3+1)(' is accepted



equation : sumInfix '=' sumInfix            #EquationInfix
     | sumPostfix '=' sumPostfix            #EquationPostfix
     | sumPrefix '=' sumPrefix              #EquationPrefix
     ;



/* POSTFIX NOTATION */

sumPostfix : productPostfix                #SumPostfixProd
           | postfixBinaryArgs '+'         #SumPostfixSum
           | postfixBinaryArgs '-'         #SumPostfixDiff
           | postfixBinaryArgs 'root'      #SumPostfixRoot
           | postfixBinaryArgs MOD         #SumPostfixMod
		   | unknown                       #SumPostfixUnknown
           ;

productPostfix  : postfixBinaryArgs EXPONENT   #ProductPostfixExp
                | postfixBinaryArgs '*'        #ProductPostfixMult
                | postfixBinaryArgs '/'        #ProductPostfixDiv
                | unaryPostfix                 #ProductPostfixTrigo
                ;

unaryPostfix : trigoPostfix                 #UnaryPostfixTrigo
             | postfixUnaryArgs 'log'       #UnaryPostfixLog
             | postfixUnaryArgs 'sqrt'      #UnaryPostfixSqrt
             | postfixUnaryArgs '-'         #UnaryPostfixNegation
             | postfixUnaryArgs 'abs'       #UnaryPostfixAbsolute
             ;

trigoPostfix : postfixUnaryArgs 'sin'       #TrigoPostfixSin
             | postfixUnaryArgs 'cos'       #TrigoPostfixCos
             | postfixUnaryArgs 'tan'       #TrigoPostfixTan
             | postfixUnaryArgs 'sinh'      #TrigoPostfixSinh
             | postfixUnaryArgs 'cosh'      #TrigoPostfixCosh
             | postfixUnaryArgs 'tanh'      #TrigoPostfixTanh
             | postfixUnaryArgs 'asin'      #TrigoPostfixASin
             | postfixUnaryArgs 'acos'      #TrigoPostfixACos
             | postfixUnaryArgs 'atan'      #TrigoPostfixATan
             | postfixUnaryArgs 'degToRad'  #TrigoPostfixDegToRad
             | postfixUnaryArgs 'radToDeg'  #TrigoPostfixRadToDeg
             ;

atomPostfix : sumPostfix                #AtomPostfixSum
            | unknown                   #AtomPostfixNumber
            ;

postfixBinaryArgs :  '(' atomPostfix ','?  atomPostfix (','? atomPostfix)* ')';
postfixUnaryArgs  : '(' atomPostfix ')';

/* PREFIX NOTATION */
sumPrefix : productPrefix                            #SumPrefixProd
           | '+' prefixBinaryArgs                    #SumPrefixSum
           | '-' prefixBinaryArgs                    #SumPrefixDiff
           | 'root' prefixBinaryArgs                 #SumPrefixRoot
           | MOD prefixBinaryArgs                    #SumPrefixMod
		   | unknown                                 #SumPrefixUnknown
           ;

productPrefix   : EXPONENT prefixBinaryArgs          #ProductPrefixExp
                | '*' prefixBinaryArgs               #ProductPrefixMult
                | '/' prefixBinaryArgs               #ProductPrefixDiv
                | unaryPrefix                        #ProductPrefixUnary
                ;

unaryPrefix : trigoPrefix                    #UnaryPrefixTrigo
             | 'log'  prefixUnaryArgs        #UnaryPrefixLog
             | 'sqrt' prefixUnaryArgs        #UnaryPrefixSqrt
             | '-'    prefixUnaryArgs        #UnaryPrefixNegation
             | 'abs'  prefixUnaryArgs        #UnaryPrefixAbsolute
             ;

trigoPrefix  : 'sin' prefixUnaryArgs          #TrigoPrefixSin
             | 'cos' prefixUnaryArgs          #TrigoPrefixCos
             | 'tan' prefixUnaryArgs          #TrigoPrefixTan
             | 'sinh' prefixUnaryArgs         #TrigoPrefixSinh
             | 'cosh' prefixUnaryArgs         #TrigoPrefixCosh
             | 'tanh' prefixUnaryArgs         #TrigoPrefixTanh
             | 'asin' prefixUnaryArgs         #TrigoPrefixASin
             | 'acos' prefixUnaryArgs         #TrigoPrefixACos
             | 'atan' prefixUnaryArgs         #TrigoPrefixATan
             | 'degToRad' prefixUnaryArgs     #TrigoPrefixDegToRad
             | 'radToDeg' prefixUnaryArgs     #TrigoPrefixRadToDeg
             ;

atomPrefix  : sumPrefix         #AtomPrefixSum
            | unknown           #AtomPrefixNumber
            ;


prefixBinaryArgs :  '(' atomPrefix ','?  atomPrefix (','? atomPrefix)* ')';
prefixUnaryArgs  :  '(' atomPrefix ')';


/* INFIX NOTATION */
sumInfix : productInfix                             #SumInfixProd
    | sumInfix '+' productInfix                     #SumInfixAdd
    | sumInfix '-' productInfix                     #SumInfixDiff
    | sumInfix MOD  sumInfix                        #SumInfixMod
    | unknown                                       #SumInfixUnknown
    ;


productInfix : expoInfix                            #ProductInfixAtom
    | productInfix EXPONENT expoInfix               #ProductInfixExpo
    | productInfix '*' expoInfix                    #ProductInfixMult
    | productInfix '/' expoInfix                    #ProductInfixDiv
    | 'root' '(' sumInfix + ',' + sumInfix ')'      #ProductInfixRoot
    ;


expoInfix : atomInfix                               #ExpoInfixAtom
    | expoInfix EXPONENT atomInfix                  #ExpoInfixExpo
    ;



atomInfix: unaryInfix           #AtomInfixUnary
    | unknown                   #AtomInfixNumber
    | '(' sumInfix ')'          #AtomInfixSum
    ;

unaryInfix: trigoInfix                                   #UnaryInfixTrigo
          | 'log' '(' sumInfix ')'                       #UnaryInfixLog
          | 'sqrt' '(' sumInfix ')'                      #UnaryInfixSqrt
          | (('|' sumInfix '|')
                | ('abs' '(' sumInfix ')' ) )           #UnaryInfixAbsolute
          | '-' productInfix                             #UnaryInfixNegation
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

// The next rules are written like this to prevent any recursion problem.

// Checks to see if the number is an unknown value at first or not
unknown : complexNumber? UNKNOWN EXPONENT complexNumber             #UnknownUnknownExponentNumber
        | complexNumber? UNKNOWN                                    #UnknownUnknownNumber
        | complexNumber                                             #UnknownNumber
        ;

// Checks to see if the number is imaginary at first or not
complexNumber   : number? 'i'    #ComplexImaginaryNumber
                | number         #ComplexRealNumber
                ;




// Add other number kinds, such as floats/doubles
number: rational                            #NumberRational // Placed first in order to *override* the infix division !
      | INT                                 #NumberInt
      | FLOAT                               #NumberReal
      | constant                            #NumberContant
      | infinity                            #NumberInfinity
      | random                              #NumberRandom
      | number ENOTATION                    #NumberENotation
      | '-' unknown                         #NumberNegation // In case someone wants the negative value of a number
      ;



random : 'rand_int' '(' INT ')'                         #RandomInt
       | 'rand_real' '(' ')'                            #RandomReal
       | 'rand_ratio' '(' INT ',' INT ')'               #RandomRatio
       | 'rand_cmplx' '(' ')'                           #RandomComplex
       ;

constant: ('pi' | 'PI' | 'Pi' | 'pI' | 'π') #ConstantPi
        | ('E' | 'e')                       #ConstantEuler
        ;

infinity: '+'? 'inf'                        #InfinityPositive
        | '-' 'inf'                         #InfinityNegative
        ;

rational: INT '/' INT
        ;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
UNKNOWN :   'x' ;
EXPONENT :  '^' | '**';
MOD :   '%'|'mod';
BOOL :   'true'|'false' ;                      // match booleans
ID  :   [a-zA-Z]+ ;                   // match identifiers
INT :   [0-9]+ ;                      // match integers
ENOTATION : ('E'|'e') '-'? INT;
FLOAT :   [0-9]+ '.' [0-9]* ;         // match real
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
