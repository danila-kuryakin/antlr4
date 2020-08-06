package ru.kuryakin.lab2_4.task2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ru.kuryakin.ConsoelRead;

public class Main {
    public static void main( String[] args)
    {
        Task2Lexer lexer;
        CommonTokenStream tokens;
        Task2Parser parser;
        String str = "";
        lexer = new Task2Lexer(CharStreams.fromString(str));
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer.setInputStream(CharStreams.fromString(str));
            tokens = new CommonTokenStream(lexer);
            parser = new Task2Parser(tokens);
            parser.init();
        }
    }
}
