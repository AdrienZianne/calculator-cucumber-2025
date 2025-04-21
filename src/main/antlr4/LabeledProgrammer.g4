grammar LabeledProgrammer;

operation : '(' operation ')'                #OperationPrio
		  | operation AND operation          #OperationAnd
		  | operation OR operation           #OperationOr
		  | NOT operation                    #OperationNot
		  | operation 'nand' operation       #OperationNand
		  | operation 'nor' operation        #OperationNor
		  | operation 'impl' operation       #OperationImpl
		  | operation 'equiv' operation      #OperationEquiv
		  | operation LSHIFT INT             #OperationLshift
		  | operation RSHIFT INT             #OperationRshift
		  | 'conv' '(' operation ',' INT ')' #OperationConv
		  | number                           #OperationNumber
		  ;

number : BOOL                            #NumberBool
	   | BINARY_LITERAL                  #NumberBinary
	   | OCTAL_LITERAL                   #NumberOctal
	   | INT                 #NumberDecimal
	   | HEXA_LITERAL                    #NumberHexa
       | (INT | ALPHABET | BOTH) '_' INT #NumberDefault
	   ;

BOOL : 'T' | 't' | 'F' | 'f' ; // match bool

AND : 'and' | '&' | '&&' ; // match and
OR : 'or' | '|' | '||'; // match or
NOT : 'not' | '-' ; // match or
LSHIFT : 'ls' | '<' | '<<' ; // match left shift
RSHIFT : 'rs' | '>' | '>>' ; // match right shift

BINARY_LITERAL : '0b' (INT | ALPHABET | BOTH) ;
OCTAL_LITERAL : '0o' (INT | ALPHABET | BOTH) ;
HEXA_LITERAL : '0x' (INT | ALPHABET | BOTH) ;

INT : [0-9]+ ; // match integers
ALPHABET : [a-vA-V]+ ; // match alphabet
BOTH : (INT | ALPHABET)+ ; // match both

NEWLINE :'\r'? '\n' ; // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ; // toss out whitespace
