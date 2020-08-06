package ru.kuryakin.tema2.parse_0;

public class Listener extends Parse0BaseListener {
    private int total = 0;
    @Override
    public void enterAddNum(Parse0Parser.AddNumContext ctx) {
    }

    @Override
    public void exitAddNum(Parse0Parser.AddNumContext ctx) {
        total += Integer.valueOf(ctx.Num().getText());
    }

    @Override
    public void enterAddVal(Parse0Parser.AddValContext ctx) {
    }

    @Override
    public void exitAddVal(Parse0Parser.AddValContext ctx) {
        total += Integer.valueOf(ctx.Num().getText());
    }

    public int getTotal() {
        return total;
    }
}
