lexer grammar Q3;

Expr    :   '...'?[a-z]+'?';
WD      :   [ \n\t]+ -> skip;
Other   :   .;
