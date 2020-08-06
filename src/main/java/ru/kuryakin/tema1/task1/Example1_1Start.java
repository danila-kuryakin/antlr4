package ru.kuryakin.tema1.task1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Example1_1Start {
    public static void main(String[] args) {
        Example1_1 lexer;
        Token token;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Example1_1(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText().equals("<EOF>"))
                    break;
                System.out.printf("Token name: %s, text: %s, length: %s\n",
                        lexer.getRuleNames()[token.getType() - 1], token.getText(), token.getText().length());
            }
        }
    }
}
