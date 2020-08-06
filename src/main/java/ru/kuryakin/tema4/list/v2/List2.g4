grammar List2;

start   :   list1;
list1   :
        |   list;

list    :   Num |
            Num ',' list;

Num     :   [0-9]+;
Enter   :   '\n' -> skip;