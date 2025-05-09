grammar LabeledSettings;

setting : QUIT         #SettingsQuit
        | HELP         #SettingsHelp
        | LISTOPTIONS  #SettingsListOptions
        | INFO info    #SettingsInfoOptions
        | CLEAR        #SettingsClear
        | option       #SettingsOption
		| 'reset_seed' #SettingsResetSeed
		| history      #SettingsHistory
        ;

info : MODE                       #InfoMode
     | 'real_precision'           #InfoRealPrecision
     | 'real_rounding_mode'       #InfoRoundingMode
     | 'use_real_notation'        #InfoUseRealNotation
     | 'use_scientific_notation'  #InfoUseScientificNotation
     | 'sc_notation_max_left'     #InfoScNotationMaxLeft
     | 'sc_notation_max_right'    #InfoScNotationMaxRight
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

history : LOGS          #HistoryLogs
		| FAVOS         #HistoryFavos
		| ADDFAVO INT? #HistoryAddFavo
		| DELFAVO INT? #HistoryDelFavo
		| USELOG  INT? #HistoryUseLog
		| USEFAVO INT? #HistoryUseFavo
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

LOGS : 'll' | 'logs' ; // match logs
FAVOS : 'lf' | 'favos' ; // match favos
ADDFAVO : 'af' | 'add_favo' ; // match add favo
DELFAVO : 'df' | 'del_favo' ; // match del favo
USELOG : 'ul' | 'use_log' ; // match use log
USEFAVO : 'uf' | 'use_favo' ; // match use favo

NEWLINE : '\r'? '\n' ; // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ; // toss out whitespace
