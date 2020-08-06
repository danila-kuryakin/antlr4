package ru.kuryakin.tema3.ex5;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Ex5Start {
    public static void main(String[] args) {
        Token token;
        Ex5 lexer;
        int i = 0;
        int masLen = 40;
        int[] len = new int[masLen];
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Ex5(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>")
                    break;
                len[i] += token.getText().length();
                i++;
                if (i >= masLen) {
                    System.out.println("Max value " + masLen);
                    for (int j = 0; j < masLen; j++)
                        System.out.printf("%d: %d\n", j, len[j]);
                    return;
                }
            }
            for (int j = 0; j < masLen; j++)
                if (len[j]>0)
                    System.out.printf("%d: %d\n", j, len[j]);
            System.out.println();

        }
    }
}
