grammar Task12;

start       :   list;

list        :   path
            |   list ':' path;

path        :   nameDir
            |   path nameDir;

nameDir     :  '/'Name;

Name        :   ([a-zA-Z0-9]|'-'|'.'|'\'|'','|'_'|'='|'+'|'?')+;
WS          :   [ \t\r\n]+ -> skip;