grammar Task9;

start           :   procedure '\n'
                |   start start '\n';

procedure       :   Procedure Name '(' variables ')';

variables       :   variable
                |   variables ';' variable;

variable        :   names ':' Type                      #withoutVar
                |   Var names ':' Type                  #withVar;

names           :   Name
                |   names ',' Name;

Type            :   'char'
                |   'boolean'
                |   'integer'
                |   'real';

Var             :   'var';
Procedure       :   'procedure';
Name            :   [a-zA-Z][a-zA-Z0-9_]*;
WS              :   [ \t\r]+ -> skip;