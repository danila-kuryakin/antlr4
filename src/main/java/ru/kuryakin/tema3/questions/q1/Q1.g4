lexer grammar Q1;

Expr    :   'x'+('yz'|'zy')+;
WD      :   [ \n\t]+ -> skip;
Other   :   .;
