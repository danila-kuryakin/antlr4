grammar LiteralU;

init
    :   ID
    ;
ID : RusLiteral+
     {
     if ( Character.isUpperCase(getText().charAt(0)) ) setType(TOKEN_REF);
     else setType(RULE_REF);
     }
   ;

fragment RusLiteral
    :   '\u0410'..'\u042F'  // А-Я
    |   '\u0430'..'\u044F'  // a-я
    |   '\u0401'            // Ё
    |   '\u0451'            // ё
    ;