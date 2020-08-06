package ru.kuryakin.tema3.questions.q8;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class Q8Start {
    public static void main(String[] args) {
        Token token;
        Q8 lexer;
        Scanner in;
        String s = "";
        while (true) {
            in = new Scanner(System.in);
            s = in.nextLine();
            if (s.equals("stop"))
                break;

            lexer = new Q8(CharStreams.fromString(s));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                if (lexer.getRuleNames()[token.getType() - 1].equals("Expr") &&
                        token.getCharPositionInLine() == 0) System.out.print(token.getText());
            }
            System.out.println();
        }
    }
}
