lexer grammar Task6;

Reg             :   [a-d]'x'|[sd]'i'|[bs]'p'|[de]'s';   // ax, bx, cx, dx, si, di, bp, sp, ds и es
S               :   '['|']';
Indif           :   [a-zA-Z0-9]+;
Number          :   [+-]?[0-9]+;
Sing            :   [+-];

Other           :   . -> skip;