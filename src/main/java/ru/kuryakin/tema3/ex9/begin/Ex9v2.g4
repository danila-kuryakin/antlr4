lexer grammar Ex9v2;

Operation   :   'read';
Ientifier   :   [a-z]+ {getText().lastIndexOf("read") == -1}?;
Other       :   .;