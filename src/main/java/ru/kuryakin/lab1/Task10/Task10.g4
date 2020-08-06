lexer grammar Task10;

LongConst   :   ('L#'[0-9]+ {getText().length() <= 10}?) |
                ('L#'[-+] [0-9]+ {getText().length() <= 11}?);
Const       :   ([0-9]+ {getText().length() <= 4}?) |
                ([-+] [0-9]+ {getText().length() <= 5}?);

Num         :   [0-9]+;
Indif       :   [a-zA-Z]+;

Other       :   ~[0-9a-zA-Z]+;


