grammar LabeledProgrammer;

operation : number                         #OperationNumber
		  | '(' operation ')'                #OperationPrio
		  | operation AND number           #OperationAnd
		  | operation OR number            #OperationOr
		  | NOT number                     #OperationNot
		  | operation 'nand' number          #OperationNand
		  | operation 'nor' number           #OperationNor
		  | operation 'impl' number          #OperationImpl
		  | operation 'equiv' number         #OperationEquiv
		  | operation '<<' INT               #OperationLshift
		  | operation '>>' INT               #OperationRshift
		  | 'conv' '(' operation ',' INT ')' #OperationConv
		  ;

number : VALUE '_' INT #NumberDefault
	   | BOOL          #NumberBool
	   | '0b' VALUE    #NumberBinary
	   | '0o' VALUE    #NumberOctal
	   | '0x' VALUE    #NumberHexa
	   ;

AND : 'and' | '&' ; // match and
OR : 'or' | '|' ; // match or
NOT : 'not' | '-' ; // match or
INT :   [0-9]+ ; // match integers
VALUE :   [0-9a-vA-V]+ ; // match value
BOOL :   'T' | 't' | 'F' | 'f' ; // match bool
NEWLINE :'\r'? '\n' ; // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace
