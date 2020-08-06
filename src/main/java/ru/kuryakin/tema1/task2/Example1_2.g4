/*
Добавленно распознование целых чисел со знаком.
*/
lexer grammar Example1_2;

Num         :   [+-]?[0-9]+;
Indif       :   [a-zA-Z]+;
WS          :   [ \t\r\n]+ -> skip;
Liter       :   .;
