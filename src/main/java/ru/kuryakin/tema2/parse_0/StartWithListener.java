package ru.kuryakin.tema2.parse_0;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class StartWithListener {
    public static void main( String[] args)
    {
        Parse0Lexer lexer;
        CommonTokenStream tokens;
        Parse0Parser parser;
        Listener listener;
        ParseTreeWalker walker;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer = new Parse0Lexer(CharStreams.fromString(str));
            tokens = new CommonTokenStream(lexer);
            parser = new Parse0Parser(tokens);
            Parse0Parser.StartContext tree = parser.start();
            System.out.println(tree.toStringTree(parser));

            listener = new Listener();
            walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            System.out.println("Sum " + listener.getTotal());
        }
    }
}
