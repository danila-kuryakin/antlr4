package ru.kuryakin.test.exempl4_4;

import org.antlr.v4.runtime.*;

public class Col {
    public static void main(String[] args) {
        String str = "parrt Terence Parr 101\n" +
                "tombu Tom Burns 020\n" +
                "bke Kevin Edgar 008";
        RowsLexer lexer = new RowsLexer(CharStreams.fromString(str));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        int col = 1;
        RowsParser parser = new RowsParser(tokens, col); // pass column number!
        parser.setBuildParseTree(false); // don't waste time bulding a tree
        parser.file(); // parse
    }
}