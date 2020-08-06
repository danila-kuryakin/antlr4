package ru.kuryakin.lab3.task5;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import ru.kuryakin.ConsoelRead;

public class Task5Start {
    public static void main(String[] args) {
        Token token;
        Task5 lexer;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Task5(CharStreams.fromString(str));
            while (true) {
                token = lexer.nextToken();
                if (token.getText() == "<EOF>") {
                    break;
                }
                if (lexer.getRuleNames()[token.getType() - 1].equals("Bin")) {
                    if (token.getText().indexOf("x") == -1) {
                        if ((token.getText().substring(0, token.getText().length() - 1).length() % 4) == 0) {
                            if (token.getText().substring(0, 1).equals("1"))
                                System.out.print("-");
                            System.out.println(binToDec(token.getText().substring(1, token.getText().length() - 1)));
                        } else
                            System.out.println(binToDec(token.getText().substring(0, token.getText().length() - 1)));
                    } else {
                        if ((token.getText().substring(0, token.getText().length() - 2).length() % 4) == 0) {
                            if (token.getText().substring(0, 1).equals("1"))
                                System.out.print("-");
                            System.out.println(binToDec(token.getText().substring(1, token.getText().length() - 2)));
                        } else
                            System.out.println(binToDec(token.getText().substring(0, token.getText().length() - 2)));
                    }
                } else if (lexer.getRuleNames()[token.getType() - 1].equals("Oct")) {
                    if (token.getText().indexOf("x") == -1)
                        System.out.println(octToDec(token.getText().substring(0, token.getText().length() - 1)));
                    else
                        System.out.println(octToDec(token.getText().substring(0, token.getText().length() - 2)));
                } else if (lexer.getRuleNames()[token.getType() - 1].equals("Hex")) {
                    if (token.getText().indexOf("b") == -1 && token.getText().indexOf("h") == -1)
                        System.out.println(hexToDec(token.getText()));
                    else
                        System.out.println(hexToDec(token.getText().substring(0, token.getText().length() - 1)));
                }
            }
        }
    }

    public static int binToDec(String bin) {
        return Integer.parseInt(bin, 2);
    }

    public static int hexToDec(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static int octToDec(String oct) {
        return Integer.parseInt(oct, 8);
    }
}
