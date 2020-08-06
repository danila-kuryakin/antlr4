package ru.kuryakin.tema3.ex12;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Ex12Start {
    public static void main(String[] args) {
        Token token;
        Ex12 lexer;
        int state;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex12(CharStreams.fromString(str));
            state = 0;
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                if (lexer.getRuleNames()[token.getType() - 1].equals("State"))
                    state = Integer.valueOf(token.getText());
                if (lexer.getRuleNames()[token.getType() - 1].equals("Magic"))
                    switch (state){
                        case 1:
                            System.out.print("<first>");
                            break;
                        case 2:
                            System.out.print("<second>");
                            break;
                        case 3:
                            System.out.print("<third>");
                            break;
                    }
                if (lexer.getRuleNames()[token.getType() - 1].equals("Other"))
                    System.out.print(token.getText());
            }
            System.out.println();
        }
    }
}
