package ru.kuryakin.lab1.task6;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task6Start {
    public static void main(String[] args) {
        Token token;
        Task6 lexer;
//        "//4444465465\n" +
//        "fgdfhffj/*hgjh**/\n" +
//        "/*fdfgh5465**/\n" +
//        "fcvg/*bhj Hello**/World";
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task6(CharStreams.fromString(str));
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
