lexer grammar Task12;

LongConst   :   [-+]?[0-9]+'L';
Const       :   [-+]?[0-9]+;

Num         :   [0-9]+;
Indif       :   [a-zA-Z]+;

Other       :   ~[0-9a-zA-Z]+;


