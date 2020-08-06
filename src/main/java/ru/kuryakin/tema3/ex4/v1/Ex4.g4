lexer grammar Ex4;

Liter   :   [a-zA-Z]+ | [0-9]+;
Other   :   . -> skip;