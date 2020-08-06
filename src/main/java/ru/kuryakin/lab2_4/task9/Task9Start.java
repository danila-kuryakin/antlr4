package ru.kuryakin.lab2_4.task9;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class Task9Start {
    public static void main( String[] args)
    {
        Listener listener;
        CommonTokenStream tokens;
        Task9Parser parser;
        Task9Parser.StartContext tree;
        ParseTreeWalker walker;
        String str = "";

        Task9Lexer lexer = new Task9Lexer(CharStreams.fromString(str));
        tokens = new CommonTokenStream(lexer);
        parser = new Task9Parser(tokens);
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer.setInputStream(CharStreams.fromString(str));
            tokens = new CommonTokenStream(lexer);
            parser.setTokenStream(tokens);
            tree = parser.start();

            listener = new Listener();
            walker = new ParseTreeWalker();
            walker.walk(listener, tree);
        }
    }
}
