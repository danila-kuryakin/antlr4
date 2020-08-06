package ru.kuryakin.lab1.Task12;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task12Start {
    public static void main(String[] args) {
        Token token;
        Task12 lexer;
//        String str = "abcd -1234567L \n" +
//                    " 0777 1000100L #0003 ";
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task12(CharStreams.fromString(str));
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
