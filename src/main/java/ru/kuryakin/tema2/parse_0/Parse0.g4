grammar Parse0;

start       :   list EOF                #OutVal;

list        :   Num                     #AddNum
            |   list Delimiter Num        #AddVal;


Delimiter   :   [;,];
Num         :   [0-9]+;
WS          :   [ \t\r\n]+ -> skip;