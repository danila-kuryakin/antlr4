lexer grammar Task9;

Str         :   Num H Liter
{getText().substring(getText().indexOf("H") + 1).length() == Integer.parseInt(getText().substring(0, getText().indexOf("H")))}?
{System.out.println(getText().substring(getText().indexOf("H") + 1));};

fragment
Num         :   [0-9]+ {Integer.parseInt(getText()) >= 0 && Integer.parseInt(getText()) < 255}?;
fragment
H           :   'H';
fragment
Liter       :   [a-zA-Z0-9]+;
Other       :   . -> skip;