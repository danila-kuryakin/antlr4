package ru.kuryakin.test.expr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        String str = "193 \n" +
                "a = 2\n" +
                "b = 5\n" +
                "(a+b)*2\n";

        LabeledExprLexer lexer = new LabeledExprLexer(CharStreams.fromString(str));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.stat();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
