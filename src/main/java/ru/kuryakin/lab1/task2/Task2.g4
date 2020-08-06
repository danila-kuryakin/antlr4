lexer grammar Task2;

Hex :   ([01]?[0-9a-fA-F]+|[2(x?h)]);

Num         :   [0-9]+;
Indif       :   [a-zA-Z]+;

Other       :   ~[0-9a-zA-Z]+;