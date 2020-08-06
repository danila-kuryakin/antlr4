lexer grammar Task2a;

Indif   :   [a-zA-Z]+ {getText().length() <= 4}?;
Other   :   . -> skip;