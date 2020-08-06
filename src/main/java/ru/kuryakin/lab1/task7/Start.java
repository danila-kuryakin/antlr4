package ru.kuryakin.lab1.task7;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Start {
    public static void main(String[] args) {
        Token token;
        Task7 lexer;
//        String string = "(*16#abcdff55555*) 8#1546 \n" +
//                " 15#fF(*7(*66(*556*)77*) 2#10*)001*)00";
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
                System.out.printf("Token name: %s, text: %s, lengh: %s\n",
                        lexer.getRuleNames()[token.getType() - 1], token.getText(), token.getText().length());
            }
        }
    }
}
