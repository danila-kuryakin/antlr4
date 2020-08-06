package ru.kuryakin.tema3.ex1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

import java.util.Scanner;

public class Ex1Start {
    public static void main(String[] args) {
        Token token;
        Ex1 lexer;
        Scanner in;
        String s = "";
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex1(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText().equals("<EOF>"))
                    break;
                if (lexer.getRuleNames()[token.getType() - 1].equals("BOL") &&
                        token.getCharPositionInLine() == 0) lexer.skip();
                else
                    System.out.print(token.getText());
            }
            System.out.println();
        }
    }
}
