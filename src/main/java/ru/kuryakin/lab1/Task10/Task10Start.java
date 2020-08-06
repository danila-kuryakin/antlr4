package ru.kuryakin.lab1.Task10;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task10Start {
    public static void main(String[] args) {
        Token token;
        Task10 lexer;
//        String str = "#abcd L#-1234567 \n" +
//                " 0777 2#1000100 #0003 ";
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task10(CharStreams.fromString(str));
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
