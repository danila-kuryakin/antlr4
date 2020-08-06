package ru.kuryakin.lab3.task2.a;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task2aStart {
    public static void main(String[] args) {
        Token token;
        Task2a lexer;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task2a(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>"){
                    break;
                }

                System.out.println(token.getText());
            }
        }
    }
}
