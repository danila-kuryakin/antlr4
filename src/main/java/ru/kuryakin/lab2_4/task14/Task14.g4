grammar Task14;

start           :   array
                |   start array;

array        :   Type Name '[' arrauSize=Number? ']' assign?';'       #withoutReference
             |   Type '*' Name assign';'                #withReference;

assign          :   '=' '{' value '}';

value           :   Number
                |   value ',' Number;

Comment         :   '//'.+?;
Type            :   'int';
Number          :   [0-9];
Name            :   [a-zA-Z][a-zA-Z0-9_]*;
WS              :   [ \t\r\n]+ -> skip;
