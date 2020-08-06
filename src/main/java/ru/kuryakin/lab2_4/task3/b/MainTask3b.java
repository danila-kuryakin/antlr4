package ru.kuryakin.lab2_4.task3.b;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ru.kuryakin.ConsoelRead;
import ru.kuryakin.lab2_4.task3.a.Task3aLexer;

public class MainTask3b {
    public static void main( String[] args)
    {
        Task3bLexer lexer;
        CommonTokenStream tokens;
        Task3bParser parser;
        ParseTree tree;
        CoordVisitor eval;
        String str = "";
        lexer = new Task3bLexer(CharStreams.fromString(str));
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer.setInputStream(CharStreams.fromString(str));
            tokens = new CommonTokenStream(lexer);
            parser = new Task3bParser(tokens);
            tree = parser.init();
            eval = new CoordVisitor();
            eval.visit(tree);
            eval.cordCount();
        }
    }
}
