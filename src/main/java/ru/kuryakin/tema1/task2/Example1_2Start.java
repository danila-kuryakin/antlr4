package ru.kuryakin.tema1.task2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

import java.util.Scanner;

public class Example1_2Start {
    public static void main(String[] args) {
        Token token;
        Example1_2 lexer;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Example1_2(CharStreams.fromString(str));
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
