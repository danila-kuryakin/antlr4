grammar List3;

start   :   list1;
list1   :
        |   list;

list    :   Num |
            Num ',' list;

Num     :   [0-9]+;
WS      :   [ \t\r\n]+ -> skip;