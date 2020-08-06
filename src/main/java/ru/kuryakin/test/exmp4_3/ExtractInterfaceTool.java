package ru.kuryakin.test.exmp4_3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class ExtractInterfaceTool {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }

        String str = "interface IDemo {\n" +
                "void f(int x, String y);\n" +
                "int[ ] g(/*no args*/);\n" +
                "List<Map<String, Integer>>[] h();\n" +
                "}";
        ANTLRInputStream input = new ANTLRInputStream(is);

        JavaLexer lexer = new JavaLexer(CharStreams.fromString(str));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit(); // parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        ExtractInterfaceListener extractor = new ExtractInterfaceListener(parser);
        walker.walk(extractor, tree); // initiate walk of tree with listener
    }
}
