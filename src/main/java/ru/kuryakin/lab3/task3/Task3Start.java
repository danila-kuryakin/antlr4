package ru.kuryakin.lab3.task3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task3Start {
    public static void main(String[] args) {
        Token token;
        Task3 lexer;
        String str = "";
        int count = 0;
        int iter;
        for (int i = 0; i < 12; i++) {
            System.out.print("\t|");
        }
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task3(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>"){
                    break;
                }
                if (lexer.getRuleNames()[token.getType() - 1].equals("Tab")) {
                    iter = count;
                    for (int i = iter; i < ((iter / 4) * 4) + 4; i++) {
                        System.out.print(" ");
                        count++;
                    }
                } else {
                    System.out.print(token.getText());
                    count += token.getText().length();
                    if (lexer.getRuleNames()[token.getType() - 1].equals("Enter")) {
                        count = 0;
                    }
                }
            }
        }
    }
}
