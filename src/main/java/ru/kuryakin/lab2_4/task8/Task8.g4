grammar Task8;

//db 10, 3 dup (1, 4, 18 dup (1, 10 dup (5))), 5, "None", 2 dup ('Letters', 7)

start           :   dir
                |   start dir;

dir             :   'db' list;

list            :   value
                |   list ',' value;

value           :   None                            #none
                |   Number                          #number
                |   '\'' Letters '\''               #litters
                |   n=Number 'dup' '(' list ')'     #dup;

None            :   '"None"';
Number          :   [0-9]+;
Letters         :   [a-zA-Z0-9_]+;
WS              :   [ \t\r\n]+ -> skip;