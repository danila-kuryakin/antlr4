package ru.kuryakin.tema4.date.v1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ru.kuryakin.ConsoelRead;

public class StartV1 {
    public static void main( String[] args)
    {
        String str = "";
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            DateV1Lexer lexer = new DateV1Lexer(CharStreams.fromString(str));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DateV1Parser parser = new DateV1Parser(tokens);
            parser.start();
        }
    }
}
