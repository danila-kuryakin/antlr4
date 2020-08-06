lexer grammar Task8b;

//Comparison  :   '.'(([GL][TE])|'EQ'|'NE')'.' {System.out.println(getText());};
GT          :   '.GT.'                          {System.out.print(">");};
GE          :   '.GE.'                          {System.out.print(">=");};
LT          :   '.LT.'                          {System.out.print("<");};
LE          :   '.LE.'                          {System.out.print("<=");};
EQ          :   '.EQ.'                          {System.out.print("==");};
NE          :   '.NE.'                          {System.out.print("<>");};
Const       :   ([+-]?([0-9]+)?'.'([0-9]+)?) {System.out.print(getText());};

Other       :   . -> skip;