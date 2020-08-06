lexer grammar Task1;

Hex :   '0'[xX](Num|[a-fA-F]+)+;

Num         :   [0-9]+;
Indif       :   [a-zA-Z]+;

Other       :   ~[0-9a-zA-Z]+;