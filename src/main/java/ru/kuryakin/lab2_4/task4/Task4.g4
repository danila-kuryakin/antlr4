
grammar Task4;

init: (list'\n')+;

list
    :   '{' value '}'
    ;

value
    :                               # skip
    |   Num                         # count1
    |   value ',' Num               # count2
    ;

Num :   '-'?[0-9]+;

WS
    :   [ \t\r\n]+ -> channel(HIDDEN);
