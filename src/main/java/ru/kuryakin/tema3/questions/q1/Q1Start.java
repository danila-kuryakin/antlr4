package ru.kuryakin.tema3.questions.q1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class Q1Start {
    public static void main(String[] args) {
        Token token;
        Q1 lexer;
        Scanner in;
        String s = "";
        while (true) {
            in = new Scanner(System.in);
            s = in.nextLine();
            if (s.equals("stop"))
                break;

            lexer = new Q1(CharStreams.fromString(s));
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
