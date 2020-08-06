grammar Task13;

start           :   command
                |   start command;

command         :   Mov listEnd;

listEnd         :   SegmentReg ',' Number   #segment
                |   list ',' Number         #endNumber
                |   list                    #onlyList;

list            :   Reg
                |   list ',' Reg;

Mov             :   'mov';
Reg             :   [a-d]'x'|[sd]'i'|[bs]'p';   // ax, bx, cx, dx, si, di, bp, sp
SegmentReg      :   [de]'s';
Number          :   [-+]?[0-9]+;
WS              :   [ \t\r\n]+ -> skip;