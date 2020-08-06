lexer grammar Q4;

Expr    :   'e'(([a-d]'x')|([sd]'i'));
//WD      :   [ \n\t]+ ;
Other   :   . -> skip;
