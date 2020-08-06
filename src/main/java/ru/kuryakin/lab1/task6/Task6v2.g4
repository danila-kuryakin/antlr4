
grammar Task6v2;

init
    : list+?;

list
    : TEXT  {System.out.printf("%s\n", $TEXT.text);}
    ;

WS
    : [ \t\r\n]+ -> skip ;

COMMENT
    : '/*'.*?'**/' -> skip;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip;

TEXT: ~[ \n\t\r/*]+;