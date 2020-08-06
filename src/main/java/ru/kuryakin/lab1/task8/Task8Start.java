package ru.kuryakin.lab1.task8;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task8Start {
    public static void main(String[] args) {
        Token token;
        Task8 lexer;
//        String str = "val:=128 const:=val val:=58sise\n" +
//                "val:=size89 .=x 6465.46dfd";
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task8(CharStreams.fromString(str));
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
