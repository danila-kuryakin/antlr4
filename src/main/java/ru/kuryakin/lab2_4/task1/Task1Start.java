package ru.kuryakin.lab2_4.task1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ru.kuryakin.ConsoelRead;

import java.util.ArrayList;

public class Task1Start {
    public static void main( String[] args)
    {
        Listener listener;
        Task1Lexer lexer;
        CommonTokenStream tokens;
        Task1Parser parser;
        Task1Parser.StartContext tree;
        ParseTreeWalker walker;
        String str = "";
        lexer = new Task1Lexer(CharStreams.fromString(str));
        while (true) {
            str = ConsoelRead.read();
            if (str == null)
                break;
            lexer.setInputStream(CharStreams.fromString(str));
            tokens = new CommonTokenStream(lexer);
            parser = new Task1Parser(tokens);
            while (true) {
                str = ConsoelRead.read();
                if (str == null)
                    break;
                lexer.setInputStream(CharStreams.fromString(str));
                tokens = new CommonTokenStream(lexer);
                parser.setTokenStream(tokens);
                tree = parser.start();

                listener = new Listener();
                walker = new ParseTreeWalker();
                walker.walk(listener, tree);
                ArrayList<String> arrayList = listener.getArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i == arrayList.size() - 1) {
                        System.out.printf("%s\n", arrayList.get(i));
                    } else {
                        System.out.printf("%s, ", arrayList.get(i));
                    }
                }
                System.out.println();
            }
        }
    }
}
