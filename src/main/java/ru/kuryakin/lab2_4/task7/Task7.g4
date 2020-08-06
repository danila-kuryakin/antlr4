grammar Task7;

start       :   list '\n'       #end
            |   start list '\n'      #intermediate;
list        :   element
            |   list element;

element     :   'N'numFrame=Number      #frame
            |   'G'numFunction=Number   #function
            |   'X'singX = Sing? numX=Number          #xCoord
            |   'Y'singY = Sing? numY=Number          #yCoord;

Sing        :   [-+];
Number      :   [0-9]+;
WS          :   [ \t\r]+ -> skip;