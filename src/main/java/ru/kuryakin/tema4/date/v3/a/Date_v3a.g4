grammar Date_v3a;

start : date;
date : month=Mouth day=Number',' year=Number;

Number  :   [0-9]+;
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
Other   :   . -> skip;