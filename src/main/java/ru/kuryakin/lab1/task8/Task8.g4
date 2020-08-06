lexer grammar Task8;

Assign        :   [a-zA-Z][0-9a-zA-Z]+':='([0-9]+|([a-zA-Z][0-9a-zA-Z]+));

Num         :   [0-9]+;
Indif       :   [a-zA-Z]+;

Other       :   ~[0-9a-zA-Z];

