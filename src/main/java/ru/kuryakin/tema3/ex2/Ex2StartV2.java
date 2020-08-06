package ru.kuryakin.tema3.ex2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.Scanner;

public class Ex2StartV2 {
    public static void main(String[] args){
        Token token;
        Ex2 lexer;
        Scanner in;
        String s = "";
        byte a[] = new byte[100];
        int newLine = 0;
        while (true) {
            try {
            System.in.read(a);
            s=new String (a);
                lexer = new Ex2(CharStreams.fromString(s));
                while (true) {
                    token = lexer.nextToken();
                    if (token.getText().equals("<EOF>"))
                        break;
                    System.out.print(token.getText());
                    if (lexer.getRuleNames()[token.getType() - 1].equals("NewLine"))
                        System.out.println("Line " + newLine++);
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
