package ru.kuryakin.lab2_4.task13;

import java.util.ArrayList;

public class Listener extends Task13BaseListener {

    private ArrayList<String> arrayList;

    public Listener(){
        arrayList = new ArrayList<>();
    }

    @Override
    public void exitCommand(Task13Parser.CommandContext ctx) {
        for (int i = arrayList.size()-1; i >= 1; i--) {
            System.out.printf("mov %s, %s\n", arrayList.get(i), arrayList.get(i-1));
        }
    }

    @Override
    public void exitSegment(Task13Parser.SegmentContext ctx) {
        System.out.printf("push 1\n pop %s\n", ctx.SegmentReg().getText());
    }

    @Override
    public void exitEndNumber(Task13Parser.EndNumberContext ctx) {
        arrayList.add(ctx.Number().getText());
    }

   @Override
    public void exitList(Task13Parser.ListContext ctx) {
        arrayList.add(ctx.Reg().getText());
    }
}
