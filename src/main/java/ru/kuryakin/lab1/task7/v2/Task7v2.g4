lexer grammar Task7v2;

@members {
static Token token;
static Task7v2 lexer;
public static void main(String[] args) {
    String string = "(*16#abcdff55555 8#1546*) \n" +
        " 16#fdcbaa(*777*) 2#10(**)001*00";
    lexer = new Task7v2(CharStreams.fromString(string));
    while (true){
        token = lexer.nextToken();
        if (token.getText() == "<EOF>")
            break;
        System.out.printf("Token name: %s, text: %s, lengh: %s\n",
            lexer.getRuleNames()[token.getType()-1], token.getText(), token.getText().length());
    }
}
}
//WS
//    : [ \t\r\n]+ -> skip ;

COMMENT_OPEN
    : '(*' -> more, pushMode(COMMENT);

//TEXT: .+;

mode COMMENT;

COMMENT_TEXT
    :   .*? ;

CLOSE
    :   '*)' -> popMode;