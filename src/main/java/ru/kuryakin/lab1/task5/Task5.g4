lexer grammar Task5;

Float       :   Num'.'Num;

Num         :   [0-9]+;
Indif       :   [a-zA-Z]+;

Other       :   ~[0-9a-zA-Z]+;

