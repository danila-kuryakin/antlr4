package ru.kuryakin.lab2_4.task10;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class Task10Start {
    public static void main( String[] args)
    {
        Listener listener;
        CommonTokenStream tokens;
        Task10Parser parser;
        Task10Parser.StartContext tree;
        ParseTreeWalker walker;
        String str = "";

        Task10Lexer lexer = new Task10Lexer(CharStreams.fromString(str));
        tokens = new CommonTokenStream(lexer);
        parser = new Task10Parser(tokens);
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
