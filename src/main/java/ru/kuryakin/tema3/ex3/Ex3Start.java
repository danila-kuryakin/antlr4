package ru.kuryakin.tema3.ex3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;
import ru.kuryakin.tema3.ex2.Ex2;

import java.util.Scanner;

public class Ex3Start {
    public static void main(String[] args) {
        Token token;
        Ex3 lexer;
        Scanner in;
        String str = "";
        int count = 0;
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex3(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText().equals("<EOF>"))
                    break;
                if (lexer.getRuleNames()[token.getType() - 1].equals("Int")) {
                    count++;
                    System.out.printf("Count: %s, text: %s\n", count, token.getText());
                }
            }
        }
    }
}
