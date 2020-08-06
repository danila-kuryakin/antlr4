lexer grammar Task7;

WS          :   [ \t\r\n]+;
CommentNew     :   '(*' -> skip, pushMode(COM);
Other       :   .;

mode COM;
CommentStart     : '(*' -> skip, pushMode(COM);
CommentClose  :   '*)' -> skip, popMode;
Text        :   . -> skip;