package ru.kuryakin.tema3.questions.q2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class Q2Start {
    public static void main(String[] args) {
        Token token;
        Q2 lexer;
        Scanner in;
        String s = "";
        while (true) {
            in = new Scanner(System.in);
            s = in.nextLine();
            if (s.equals("stop"))
                break;

            lexer = new Q2(CharStreams.fromString(s));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                System.out.printf("Token name: %s, text: %s, lengh: %s\n",
                        lexer.getRuleNames()[token.getType() - 1], token.getText(), token.getText().length());
                if (lexer.getRuleNames()[token.getType() - 1].equals("Expr")/* && token.getText().length() <= 10*/) {
                    System.out.println(token.getText());
                }
            }
        }
    }
}
