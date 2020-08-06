package ru.kuryakin.lab2_4.task11;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class Task11Start {
    public static void main( String[] args)
    {
        Listener listener;
        CommonTokenStream tokens;
        Task11Parser parser;
        Task11Parser.StartContext tree;
        ParseTreeWalker walker;
        String str = "";

        Task11Lexer lexer = new Task11Lexer(CharStreams.fromString(str));
        tokens = new CommonTokenStream(lexer);
        parser = new Task11Parser(tokens);
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
