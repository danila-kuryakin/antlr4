package ru.kuryakin.tema3.ex6;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Ex6Start {
    public static void main(String[] args) {
        Token token;
        Ex6 lexer;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex6(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                for (int i = 0; i < token.getText().length(); i++) {
                    System.out.format("%" + (i + 1) + "s\n", token.getText().charAt(i));
                }
            }
            System.out.println();

        }
    }
}
