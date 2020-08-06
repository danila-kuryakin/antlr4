package ru.kuryakin.Task1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class TestMain {
    public static void main( String[] args) throws Exception
    {
        Task1Lexer lexer = new Task1Lexer(CharStreams.fromString("1523"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Task1Parser parser = new Task1Parser(tokens);
        parser.long_num();
    }
}
