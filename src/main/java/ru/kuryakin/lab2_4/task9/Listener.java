package ru.kuryakin.lab2_4.task9;

public class Listener extends Task9BaseListener {
    private int count;
    private int typeFlag; // 0 - none; -1 - var; 1 - char, boolean; 2 - integer; 3 - real

    public Listener(){
        count = 0;
        typeFlag = 0;
    }

    @Override
    public void exitStart(Task9Parser.StartContext ctx) {
        System.out.printf("%d byte\n", count);
    }

    @Override
    public void enterWithoutVar(Task9Parser.WithoutVarContext ctx) {
        if (ctx.Type().getText().equals("char") || ctx.Type().getText().equals("boolean")){
            typeFlag = 1;
        } else if (ctx.Type().getText().equals("integer")){
            typeFlag = 2;
        } else if (ctx.Type().getText().equals("real")){
            typeFlag = 3;
        }
    }

    @Override
    public void exitNames(Task9Parser.NamesContext ctx) {
        switch (typeFlag){
            case -1:
                count += 2;
                break;
            case 1:
                count += 1;
                break;
            case 2:
                count += 2;
                break;
            case 3:
                count += 4;
                break;
        }
    }
}
