grammar Date_v4;

start   :   between;
between :   date '-' date;
date    :   month day=Number',' year=Number;


month  locals[int state = 0]
        :   Jan {$state = 1;}|
            Feb {$state = 2;} |
            Mar {$state = 3;} |
            Apr {$state = 4;} |
            May {$state = 5;} |
            Jun {$state = 6;} |
            Jul {$state = 7;} |
            Aug {$state = 8;} |
            Sep {$state = 9;} |
            Oct {$state = 10;} |
            Nov {$state = 11;} |
            Dec {$state = 12;} ;

Number  :   [0-9]+;
Jan     :   'jan';
Feb     :   'feb';
Mar     :   'mar';
Apr     :   'apr';
May     :   'may';
Jun     :   'jun';
Jul     :   'jul';
Aug     :   'aug';
Sep     :   'sep';
Oct     :   'oct';
Nov     :   'nov';
Dec     :   'dec';
WS      :   [ \t\r\n]+ -> skip;