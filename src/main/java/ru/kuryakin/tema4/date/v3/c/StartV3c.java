package ru.kuryakin.tema4.date.v3.c;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class StartV3c {
    public static void main( String[] args)
    {
        ListenerC listener;
        ParseTreeWalker walker;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            Date_v3cLexer lexer = new Date_v3cLexer(CharStreams.fromString(str));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Date_v3cParser parser = new Date_v3cParser(tokens);
            Date_v3cParser.StartContext tree = parser.start();

            listener = new ListenerC();
            walker = new ParseTreeWalker();
            walker.walk(listener, tree);
        }
    }
}
