package ru.kuryakin.tema3.ex8;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Ex8Start {
    public static void main(String[] args) {
        Token token;
        Ex8 lexer;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex8(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                if (lexer.getRuleNames()[token.getType() - 1].equals("Revers"))
                    System.out.print(new StringBuffer(token.getText().substring(1)).reverse().toString());
                else System.out.print(token.getText());
            }
            System.out.println();

        }
    }
}
