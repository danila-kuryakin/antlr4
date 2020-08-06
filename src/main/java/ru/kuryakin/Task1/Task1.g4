grammar Task1;

long_num
 : {$NUM.getText().length() == 4}? NUM {System.out.println($NUM.getText());}
 ;

NUM
 : '0'..'9'
 ;
