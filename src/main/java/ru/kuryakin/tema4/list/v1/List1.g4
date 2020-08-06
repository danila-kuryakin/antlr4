grammar List1;

start   :   list1;
list1   :
        |   list;

list    :   Num |
            Num ',' list;

Num     :   [0-9]+;