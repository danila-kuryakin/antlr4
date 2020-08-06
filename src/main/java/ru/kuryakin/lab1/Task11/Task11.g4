lexer grammar Task11;

BConst   :   'B#16#'[0-9a-fA-F][0-9a-fA-F];
WConst   :   'W#16#'[0-9a-fA-F]+ {getText().length()<=9}?;
DWConst  :   'DW#16#'[0-9a-fA-F]+ {getText().length()<=14}?;

Num         :   [0-9]+;
Indif       :   [a-zA-Z]+;

Other       :   ~[0-9a-zA-Z]+;


