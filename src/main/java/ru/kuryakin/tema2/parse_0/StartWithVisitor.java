package ru.kuryakin.tema2.parse_0;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ru.kuryakin.ConsoelRead;

public class StartWithVisitor {
    public static void main( String[] args)
    {
        Parse0Lexer lexer;
        CommonTokenStream tokens;
        Parse0Parser parser;
        Visitor visitor;
        int result;
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

            visitor = new Visitor();
            result = visitor.visit(tree);
            System.out.println("Sum " + result);
        }
    }
}
