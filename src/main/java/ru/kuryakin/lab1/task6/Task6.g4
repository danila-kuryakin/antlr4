lexer grammar Task6;

COMMENT
    : '/*'.*?'**/' -> skip;

TEXT: .;

