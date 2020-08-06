package ru.kuryakin.lab3.task2.b;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task2bStart {
    public static void main(String[] args) {
        Token token;
        Task2b lexer;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task2b(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>"){
                    break;
                }
                if (lexer.getRuleNames()[token.getType() - 1].equals("Indif") && token.getText().length() <= 4)
                    System.out.println(token.getText());
            }
        }
    }
}
