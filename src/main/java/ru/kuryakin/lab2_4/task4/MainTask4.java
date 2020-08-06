package ru.kuryakin.lab2_4.task4;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ru.kuryakin.ConsoelRead;

public class MainTask4 {
    public static void main( String[] args)
    {
        Task4Lexer lexer;
        CommonTokenStream tokens;
        Task4Parser parser;
        ParseTree tree;
        ListVisitor eval;
        String str = "";
        lexer = new Task4Lexer(CharStreams.fromString(str));
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer.setInputStream(CharStreams.fromString(str));
            tokens = new CommonTokenStream(lexer);
            parser = new Task4Parser(tokens);
            tree = parser.init();
            eval = new ListVisitor();
            eval.visit(tree);
        }
    }
}
