lexer grammar Ex12;

State   :   [1-3] {getCharPositionInLine() == 1}?;
Magic   :   'magic';
Other   :   .;