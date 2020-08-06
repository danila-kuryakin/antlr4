package ru.kuryakin.lab2_4.task1;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class Listener implements Task1Listener {

    private ArrayList<String> arrayList;
    private int iter;

    public Listener(){
        arrayList = new ArrayList<>();
        iter = 1;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    @Override
    public void enterStart(Task1Parser.StartContext ctx) {

    }

    @Override
    public void exitStart(Task1Parser.StartContext ctx) {

    }

    @Override
    public void enterLeftL(Task1Parser.LeftLContext ctx) {

    }

    @Override
    public void exitLeftL(Task1Parser.LeftLContext ctx) {

    }

    @Override
    public void enterL(Task1Parser.LContext ctx) {

    }

    @Override
    public void exitL(Task1Parser.LContext ctx) {
    }

    @Override
    public void enterHex(Task1Parser.HexContext ctx) {
    }

    @Override
    public void exitHex(Task1Parser.HexContext ctx) {
        for (int i = 0; i < iter; i++)
            arrayList.add(ctx.Hex().getText());
    }

    @Override
    public void enterReiteration(Task1Parser.ReiterationContext ctx) {
        iter = hexToDec(ctx.Hex().getText());
    }

    public static int hexToDec(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    @Override
    public void exitReiteration(Task1Parser.ReiterationContext ctx) {
        iter -= hexToDec(ctx.Hex().getText());
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
