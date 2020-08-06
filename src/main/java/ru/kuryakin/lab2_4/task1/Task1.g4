grammar Task1;

start       :   list '\n';

list        :   exp                     #L
            |   list ',' exp            #leftL;


exp          :   Hex                    #hex
            |   Hex '(' list  ')'       #reiteration;

Hex         :   [0-9a-fA-F]+;
WS          :   [ \t\r]+ -> skip;