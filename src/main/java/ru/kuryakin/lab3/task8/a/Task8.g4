lexer grammar Task8;

Comparison  :   '.'(([GL][TE])|'EQ'|'NE')'.' {System.out.println(getText());};
Const       :   ([+-]?([0-9]+)?'.'([0-9]+)?) {System.out.println(getText());};

Other       :   . -> skip;