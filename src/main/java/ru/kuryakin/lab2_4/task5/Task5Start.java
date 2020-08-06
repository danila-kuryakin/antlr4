package ru.kuryakin.lab2_4.task5;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class Task5Start {
    public static void main( String[] args)
    {
        Listener listener;
        CommonTokenStream tokens;
        Task5Parser parser;
        Task5Parser.StartContext tree;
        ParseTreeWalker walker;
        String str = "";
        Task5Lexer lexer = new Task5Lexer(CharStreams.fromString(str));
        tokens = new CommonTokenStream(lexer);
        parser = new Task5Parser(tokens);
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
            System.out.printf("%d:%d\n", listener.getMaxDelta().toHours(), listener.getMaxDelta().toMinutes()%60);
        }
    }
}
