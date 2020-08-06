lexer grammar Task7;

R1              :   ([a-d][xhl])    {System.out.printf("Регистр общего назначения: %s\n", getText());};
R2              :   ([sd]'i')       {System.out.printf("Индексный регистр: %s\n", getText());};
R3              :   ([bs]'p')       {System.out.printf("Указательный регистр: %s\n", getText());};
R4              :   ([cdes]'s')     {System.out.printf("Сегментный регистр: %s\n", getText());};

Other           :   . -> skip;