package ru.kuryakin.tema4.date.v3.b;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class StartV3b {
    public static void main( String[] args)
    {
        ListenerB listener;
        ParseTreeWalker walker;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            Date_v3bLexer lexer = new Date_v3bLexer(CharStreams.fromString(str));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Date_v3bParser parser = new Date_v3bParser(tokens);
            Date_v3bParser.StartContext tree = parser.start();

            listener = new ListenerB();
            walker = new ParseTreeWalker();
            walker.walk(listener, tree);
        }
    }
}
