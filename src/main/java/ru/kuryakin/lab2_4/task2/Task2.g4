grammar Task2;

init    :   list
        |   init ';' list
        ;

list
    :   '(' {{System.out.printf("(");}} ext ')' {System.out.printf(")");}
    ;

ext :   coord   {System.out.printf(", 0, 0");}
    |   coord   {System.out.printf(", ");}
    ',' coord   {System.out.printf(", 0");}
    |   coord   {System.out.printf(", ");}
    ',' coord   {System.out.printf(", ");}
    ',' coord
    ;

coord
    :           {System.out.printf("0");}
    |   Value   {System.out.printf("%s", $Value.text);}
    ;

WS
    :   [ \t\r\n]+ -> channel(HIDDEN);

Value
    :
    |   ('-'?[0-9]*)?;
