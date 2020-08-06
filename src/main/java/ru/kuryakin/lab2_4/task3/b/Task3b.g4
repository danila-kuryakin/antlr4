grammar Task3b;

init    :   list
        ;

list    :   ext
        |   list  ext
        ;

ext : '('coord
    ',' coord
    ')'                     # addCoord
    ;

coord
    :   Value
    ;

WS
    :   [ \t\r\n]+ -> channel(HIDDEN);

Value
    :   '-'?[0-9]+;
