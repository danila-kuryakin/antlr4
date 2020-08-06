lexer grammar Task9;

StrComment
    : ';'.+?'\n'{System.out.printf("\n");} -> skip;

Comment
    :   'COMMENT $'.+?'$' -> skip;

TEXT: .;

