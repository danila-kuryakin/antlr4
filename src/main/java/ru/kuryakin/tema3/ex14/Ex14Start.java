package ru.kuryakin.tema3.ex14;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class Ex14Start {
    public static void main(String[] args) {
        Token token;
        Ex14 lexer;
        Scanner in;
        String s = "";
        int he, she;
        while (true){
            in = new Scanner(System.in);
            s = in.nextLine();
            if (s.equals("stop"))
                break;

            lexer = new Ex14(CharStreams.fromString(s));
            he = 0;
            she = 0;
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                if (lexer.getRuleNames()[token.getType() - 1].equals("He"))
                    he++;
                if (lexer.getRuleNames()[token.getType() - 1].equals("She"))
                    she++;
            }
            System.out.printf("He: %s, She: %s\n", he, she);
        }
    }
}
