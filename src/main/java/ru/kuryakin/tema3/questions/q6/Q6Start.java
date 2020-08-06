package ru.kuryakin.tema3.questions.q6;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class Q6Start {
    public static void main(String[] args) {
        Token token, tokenNext;
        Q6 lexer;
        Scanner in;
        String s = "";
        while (true) {
            in = new Scanner(System.in);
            s = in.nextLine();
            if (s.equals("stop"))
                break;

            lexer = new Q6(CharStreams.fromString(s));
            token = lexer.nextToken();
            while (true) {
                tokenNext = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
//                System.out.printf("Token name: %s, text: %s, lengh: %s\n",
//                        lexer.getRuleNames()[token.getType() - 1], token.getText(), token.getText().length());
                if (lexer.getRuleNames()[token.getType() - 1].equals("Expr") && tokenNext.getText() == "<EOF>"){
                    System.out.print("\"End string tab and spase\"");
                    break;
                } else System.out.print(token.getText());
                token = tokenNext;
            }
            System.out.println();
        }
    }
}
