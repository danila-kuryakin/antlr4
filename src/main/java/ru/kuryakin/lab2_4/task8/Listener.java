package ru.kuryakin.lab2_4.task8;

import java.util.ArrayList;

public class Listener extends Task8BaseListener {

    private int byteCount;
    private ArrayList<Integer> iter;

    public Listener(){
        iter = new ArrayList<>();
    }

    @Override
    public void enterDir(Task8Parser.DirContext ctx) {
        byteCount = 0;
    }

    @Override
    public void exitDir(Task8Parser.DirContext ctx) {
        System.out.printf("%d byte\n", byteCount);
    }

    @Override
    public void exitNumber(Task8Parser.NumberContext ctx) {
        if (iter.size() != 0) {
            byteCount += iter.get(iter.size() - 1);
        } else {
            byteCount += 1;
        }

    }

    @Override
    public void exitLitters(Task8Parser.LittersContext ctx) {
        if (iter.size() != 0) {
            byteCount += iter.get(iter.size() - 1) * ctx.Letters().getText().length();
        } else {
            byteCount += ctx.Letters().getText().length();
        }
    }

    @Override
    public void enterDup(Task8Parser.DupContext ctx) {
        if (iter.size() != 0)
            iter.add(iter.get(iter.size()-1) * Integer.parseInt(ctx.n.getText()));
        else
            iter.add(Integer.parseInt(ctx.n.getText()));
    }

    @Override
    public void exitDup(Task8Parser.DupContext ctx) {
        if (iter.size() != 0)
            iter.remove(iter.size()-1);
    }
}
