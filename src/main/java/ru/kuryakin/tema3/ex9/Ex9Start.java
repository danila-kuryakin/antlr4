package ru.kuryakin.tema3.ex9;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Ex9Start {
    public static void main(String[] args) {
        Token token;
        Ex9 lexer;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex9(CharStreams.fromString(str));
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
