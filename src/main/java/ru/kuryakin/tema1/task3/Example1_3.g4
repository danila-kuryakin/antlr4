/*
Распознание, наряду с десятичными числами, двоичные числа в нотации ассемблера a86. Пример: 0101xb.
*/
lexer grammar Example1_3;

Bin     :   ([0-1]+'xb');

Num     :   [0-9]+;
Indif   :   [a-zA-Z]+;
WS          :   [ \t\r\n]+ -> skip;
Liter   :   .;
