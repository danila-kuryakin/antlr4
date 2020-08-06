lexer grammar Ex7;

Hex     :   ('0'H+[Hh]?) | (D H*[Hh]);
Ident   :   L(L|D)*;
Decimal :   D+;
Comment :   '/*'.+?'*/' -> skip;
Other   :   .;

fragment
D   :   [0-9];
fragment
H   :   [0-9A-Fa-f] ;
fragment
L   :   [_A-Za-z];