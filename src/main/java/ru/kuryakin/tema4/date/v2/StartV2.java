package ru.kuryakin.tema4.date.v2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ru.kuryakin.ConsoelRead;

public class StartV2 {
    public static void main( String[] args)
    {
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            Date_v2Lexer lexer = new Date_v2Lexer(CharStreams.fromString(str));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Date_v2Parser parser = new Date_v2Parser(tokens);
            parser.start();
        }
    }
}
