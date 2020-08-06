grammar Task11;

start           :   function '\n'
                |   start function '\n';

function       :   Void Name '(' variables ')';

variables       :   variable
                |   variables ',' variable;

variable        :   Type Name               #withoutReference
                |   Type '*' Name           #withReference;

Type            :   'char'
                |   'short'
                |   'long'
                |   'float'
                |   'double';

Void            :   'void';
Name            :   [a-zA-Z][a-zA-Z0-9_]*;
WS              :   [ \t\r]+ -> skip;