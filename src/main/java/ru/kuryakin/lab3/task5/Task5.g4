lexer grammar Task5;

Dec     :   [+-]?[0-9]+;
Oct     :   [0-7]+ 'x'? 'q';
Bin     :   [0-1]+ 'x'? 'b';
Hex     :   [0-9a-fA-F]+('b'|'h')?;

Other           :   .;