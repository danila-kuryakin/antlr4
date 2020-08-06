package ru.kuryakin.lab2_4.task11;

public class Listener extends Task11BaseListener {

    private int count;

    public Listener(){
        count = 0;
    }

    @Override
    public void exitStart(Task11Parser.StartContext ctx) {
        System.out.printf("%d byte\n", count);
    }

    @Override
    public void enterWithoutReference(Task11Parser.WithoutReferenceContext ctx) {
        if (ctx.Type().getText().equals("char")){
            count += 1;
        } else if (ctx.Type().getText().equals("short")){
            count += 2;
        } else if (ctx.Type().getText().equals("long") || ctx.Type().getText().equals("float")){
            count += 4;
        } else if (ctx.Type().getText().equals("double")){
            count += 8;
        }
    }

    @Override
    public void exitWithReference(Task11Parser.WithReferenceContext ctx) {
        count += 2;
    }
}
