package ru.kuryakin.tema3.ex11;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class Ex11Start {
    public static void main(String[] args) {
        Token token;
        Ex11 lexer;
        Scanner in;
        String s = "";
        while (true){
            in = new Scanner(System.in);
            s = in.nextLine();
            if (s.equals("stop"))
                break;

            lexer = new Ex11(CharStreams.fromString(s));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                if (lexer.getRuleNames()[token.getType() - 1].equals("Other"))
                    System.out.print(token.getText());
                else
                    System.out.printf("(%s: %s)", lexer.getRuleNames()[token.getType() - 1], token.getText());
            }
            System.out.println();
        }
    }
}
