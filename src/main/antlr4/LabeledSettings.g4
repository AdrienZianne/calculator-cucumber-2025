grammar LabeledSettings;

setting : QUIT         #SettingsQuit
        | HELP         #SettingsHelp
        | LISTOPTIONS  #SettingsListOptions
        | INFO info    #SettingsInfoOptions
        | CLEAR        #SettingsClear
        | option       #SettingsOption
		| 'reset_seed' #SettingsResetSeed
        ;

info : MODE                       #InfoMode
     | 'real_precision'           #InfoRealPrecision
     | 'real_rounding_mode'       #InfoRoundingMode
     | 'use_real_notation'        #InfoUseRealNotation
     | 'use_scientific_notation'  #InfoUseScientificNotation
     | 'sc_notation_max_left'     #InfoScNotationMaxLeft
     | 'sc_notation_max_right'    #InfoScNotationMaxRight
     | 'use_complex_domain'       #InfoUseComplexDomain
     | 'use_degrees'              #InfoUseDegrees
     | 'seed'                     #InfoSeed
     | 'base_notation_convention' #InfoBaseNotationConvention
     | 'logical_symbol'           #InfoLogicalSymbol
     ;

option : MODE '=' modes                        #OptionMode
       | 'real_precision' '=' UINT             #OptionRealPrecision
       | 'real_rounding_mode' '=' roundingmode #OptionRoundingMode
       | 'use_real_notation' '=' BOOL          #OptionUseRealNotation
       | 'use_scientific_notation' '=' BOOL    #OptionUseScientificNotation
       | 'sc_notation_max_left' '=' UINT       #OptionScNotationMaxLeft
       | 'sc_notation_max_right' '=' UINT      #OptionScNotationMaxRight
       | 'use_complex_domain' '=' BOOL         #OptionUseComplexDomain
       | 'use_degrees' '=' BOOL                #OptionUseDegrees
       | 'seed' '=' INT                        #OptionSeed
       | 'base_notation_convention' '=' BOOL   #OptionBaseNotationConvention
       | 'logical_symbol' '=' BOOL             #OptionLogicalSymbol
       ;

modes : ARITHMETIC #ModeArithmetic
      | PROGRAMMER #ModeProgrammer
      ;

roundingmode : 'ceiling'     #RoundingModeCeiling
             | 'down'        #RoundingModeDown
             | 'floor'       #RoundingModeFloor
             | 'half_down'   #RoundingModeHalfDown
             | 'half_even'   #RoundingModeHalfEven
             | 'half_up'     #RoundingModeHalfUp
             | 'unnecessary' #RoundingModeUnnecessary
             | 'up'          #RoundingModeUp
             ;

QUIT : 'q' | 'quit' | 'e' | 'exit' ; // match quit
HELP : 'h' | 'help' | '?' ; // match help
LISTOPTIONS : 'l' | 'list' | 'lo' | 'list' 'options' | 'o' | 'options' ; // match list options
INFO : 'i' | 'info' ; // match info
CLEAR : 'c' | 'clear' ; // match clear
MODE : 'm' | 'mode' ; // match mode

INT : '-'? UINT ; // match integers
UINT : [0-9]+ ; // match integers
BOOL : 'true' | 'false' ; // match boolean
ARITHMETIC : 'a' | 'arithmetic' ; // match mode arithmetic
PROGRAMMER : 'p' | 'programmer' ; // match mode programmer

NEWLINE : '\r'? '\n' ; // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ; // toss out whitespace
