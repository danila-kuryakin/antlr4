package ru.kuryakin.lab3.task1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task1Start {
    public static void main(String[] args) {
        Token token;
        Task1 lexer;
        String str = "";
        String textToken = "";
        int tokenTupe = -1;
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task1(CharStreams.fromString(str));
            token = lexer.nextToken();
            if (token.getText() != "<EOF>") {
                textToken = token.getText();
                tokenTupe = token.getType() - 1;
            }
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>"){
                    break;
                }
                if (lexer.getRuleNames()[token.getType() - 1].equals("StrEnd")){
                    if (!lexer.getRuleNames()[tokenTupe].equals("WS")){
                        System.out.printf(textToken);
                    }
                    System.out.printf(token.getText());
                } else {
                    System.out.printf(textToken);
                    textToken = token.getText();
                    tokenTupe = token.getType() - 1;
                }
            }
        }
    }
}
