package ru.kuryakin.lab3.task4;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task4Start {
    public static void main(String[] args) {
        Token token;
        Task4 lexer;
        String str = "";
        int count = 0;
        int iterStart, iterEnd, delta;
        for (int i = 0; i < 12; i++) {
            System.out.print("\t|");
        }
        System.out.println();
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task4(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>"){
                    break;
                }
                if (lexer.getRuleNames()[token.getType() - 1].equals("Space")) {
                    iterStart = count;
                    iterEnd = (((iterStart + token.getText().length()) / 4) * 4);
                    delta = iterStart + token.getText().length() - iterEnd;
                    for (int i = iterStart; i < iterEnd; i += 4) {
                        System.out.print("\t");
                        count+= 4;
                    }
                    if (delta == 1 && (iterEnd-iterStart) == 0){
                        System.out.print(" ");
                        count++;
                    } else {
                        for (int i = 0; i < delta; i++) {
                            System.out.print("+");
                            count++;
                        }
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
