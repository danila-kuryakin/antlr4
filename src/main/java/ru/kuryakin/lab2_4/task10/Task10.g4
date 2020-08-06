grammar Task10;

start           :   command
                |   start command;

command         :   Push                #null
                |   Push listEnd        #withList;

listEnd         :   list ',' Number         #endNumber
                |   list                #onlyList;

list            :   Reg
                |   list ',' Reg;

Push            :   'push';
Reg             :   [a-d]'x'|[sd]'i'|[bs]'p'|[de]'s';   // ax, bx, cx, dx, si, di, bp, sp, ds и es
Number          :   [-+]?[0-9]+;
WS              :   [ \t\r\n]+ -> skip;