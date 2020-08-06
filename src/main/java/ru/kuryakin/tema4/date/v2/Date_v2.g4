grammar Date_v2;

start : date;
date : Month Number',' Number;

Number  : [0-9]+;
Mouth   :   'jan' |
            'feb' |
            'mar' |
            'apr' |
            'may' |
            'jun' |
            'jul' |
            'aug' |
            'sep' |
            'oct' |
            'nov' |
            'dec';
WS      :   [ \t\r\n]+ -> skip;