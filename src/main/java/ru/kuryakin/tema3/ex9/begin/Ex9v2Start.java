package ru.kuryakin.tema3.ex9.begin;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class Ex9v2Start {
    public static void main(String[] args) {
        Token token;
        Ex9v2 lexer;
        Scanner in;
        String s = "";
        while (true){
            in = new Scanner(System.in);
            s = in.nextLine();
            if (s.equals("stop"))
                break;

            lexer = new Ex9v2(CharStreams.fromString(s));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                if (lexer.getRuleNames()[token.getType() - 1].equals("Other"))
                    System.out.print(token.getText());
                else
                    System.out.printf("%s: %s", lexer.getRuleNames()[token.getType() - 1], token.getText());
            }
            System.out.println();
        }
    }
}
