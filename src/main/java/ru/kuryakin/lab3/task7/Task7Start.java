package ru.kuryakin.lab3.task7;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task7Start {
    public static void main(String[] args) {
        Token token;
        Task7 lexer;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task7(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
            }
            System.out.println();
        }
    }
}
