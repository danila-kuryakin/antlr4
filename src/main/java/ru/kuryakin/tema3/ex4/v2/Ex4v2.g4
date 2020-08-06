lexer grammar Ex4v2;

@header {
import ru.kuryakin.ConsoelRead;
}

@members {
    public static void main(String[] args) {
        Token token;
        Ex4v2 lexer;
        Scanner in;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex4v2(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText().equals("<EOF>"))
                    break;
            }
        }
    }
}

Liter   :   ([a-zA-Z]+ | [0-9]+) {System.out.println(getText());};
Other   :   . -> skip;