lexer grammar Task4;

Hex         :   ('16#'[0-9a-fA-F]+);
Oct         :   ('8#'[0-7]+);
Bin         :   ('2#'[0-1]+);

Num         :   [0-9]+;
Indif       :   [a-zA-Z]+;

Other       :   ~[0-9a-zA-Z]+;


