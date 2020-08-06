package ru.kuryakin.tema4.date.v4;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

public class StartV4 {
    public static void main( String[] args)
    {
        Listener listener;
        ParseTreeWalker walker;
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            Date_v4Lexer lexer = new Date_v4Lexer(CharStreams.fromString(str));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Date_v4Parser parser = new Date_v4Parser(tokens);
            Date_v4Parser.StartContext tree = parser.start();

            listener = new Listener();
            walker = new ParseTreeWalker();
            walker.walk(listener, tree);
        }
    }
}
