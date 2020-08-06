package ru.kuryakin.lab2_4.task7;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class Task7Start {
    public static void main( String[] args)
    {
        Listener listener;
        CommonTokenStream tokens;
        Task7Parser parser;
        Task7Parser.StartContext tree;
        ParseTreeWalker walker;
        String str = "";

        int x1 = 0, y1 = 0, x2, y2;

        Task7Lexer lexer = new Task7Lexer(CharStreams.fromString(str));
        tokens = new CommonTokenStream(lexer);
        parser = new Task7Parser(tokens);
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer.setInputStream(CharStreams.fromString(str));
            tokens = new CommonTokenStream(lexer);
            parser.setTokenStream(tokens);
            tree = parser.start();

            listener = new Listener(x1,y1);
            walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            x2 = listener.getX();
            y2 = listener.getY();
            if (listener.getMethod() == 1){
                System.out.printf("(%d, %d) -> (%d, %d)\n", x1, y1, x2, y2);
            }
            x1 = x2;
            y1 = y2;
        }
    }
}
