package ru.kuryakin.lab3.task2.c;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task2cStart {
    public static void main(String[] args) {
        Token token;
        Task2c lexer;
        String str = "";

        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task2c(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>"){
                    break;
                }
                if (lexer.getRuleNames()[token.getType() - 1].equals("Indif")){
                    int outLength  = 0;
                    for (int i = 0; i < token.getText().length()/4; i++) {
                        System.out.println(token.getText().substring(outLength, outLength + 4));
                        outLength += 4;
                    }
                    System.out.println(token.getText().substring(outLength));
                }
            }
        }
    }
}
