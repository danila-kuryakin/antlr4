grammar Task5;

start       :   list
            |   start list ;

list        :   interval Text ;
interval    :   begine=time end=time;
time        :   hour=Num {Integer.parseInt($hour.getText()) >= 0 && Integer.parseInt($hour.getText()) < 24}?
                ':'minute=Num {Integer.parseInt($minute.getText()) >= 0 && Integer.parseInt($minute.getText()) < 60}?;

Num         :   [0-9]+;
WS          :   [ \t\r\n]+ -> skip;
Text        :   [a-zA-Z ]+;