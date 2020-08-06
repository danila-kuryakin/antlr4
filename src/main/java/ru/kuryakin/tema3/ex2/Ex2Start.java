package ru.kuryakin.tema3.ex2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;
import ru.kuryakin.tema3.ex1.Ex1;

import java.util.Scanner;

public class Ex2Start {
    static Token token;
    static Ex2 lexer;
    public static void main(String[] args) {
        Scanner in;
        String str = "";
        int newLine = 0;
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex2(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText().equals("<EOF>"))
                    break;
                System.out.print(token.getText());
                if (lexer.getRuleNames()[token.getType() - 1].equals("NewLine"))
                    System.out.println("Line " + newLine++);
            }
            System.out.println();
        }
    }
}
