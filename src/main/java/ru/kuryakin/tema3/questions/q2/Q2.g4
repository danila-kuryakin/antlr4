lexer grammar Q2;

Expr    :   'a'[a-z]*'yz' {getText().length() <=10}?;
WD      :   [ \n\t]+ -> skip;
Other   :   .;
