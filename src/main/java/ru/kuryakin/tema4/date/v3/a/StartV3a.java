package ru.kuryakin.tema4.date.v3.a;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class StartV3a {
    public static void main( String[] args)
    {
        ListenerA listener;
        ParseTreeWalker walker;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            Date_v3aLexer lexer = new Date_v3aLexer(CharStreams.fromString(str));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Date_v3aParser parser = new Date_v3aParser(tokens);
            Date_v3aParser.StartContext tree = parser.start();

            listener = new ListenerA();
            walker = new ParseTreeWalker();
            walker.walk(listener, tree);
        }
    }
}
