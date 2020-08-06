package ru.kuryakin.lab1.task9;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task9Start {
    public static void main(String[] args) {
        Token token;
        Task9 lexer;
//        String str = "str str;4444465465\n" +
//                "fgdfhffjCOMMENT \$hgjh\$\n" +
//                "COMMENT \$fdfgh5465\$str3\n" +
//                "fcvg*bhj /*Hello**/World";
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task9(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                System.out.printf("Token name: %s, text: %s, lengh: %s\n",
                        lexer.getRuleNames()[token.getType() - 1], token.getText(), token.getText().length());
            }
        }
    }
}
