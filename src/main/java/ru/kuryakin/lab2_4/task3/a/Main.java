package ru.kuryakin.lab2_4.task3.a;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ru.kuryakin.ConsoelRead;

public class Main {
    public static void main( String[] args)
    {
        Task3aLexer lexer;
        CommonTokenStream tokens;
        Task3aParser parser;
        String str = "";
        lexer = new Task3aLexer(CharStreams.fromString(str));
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer.setInputStream(CharStreams.fromString(str));
            tokens = new CommonTokenStream(lexer);
            parser = new Task3aParser(tokens);
            parser.init();
        }
    }
}
