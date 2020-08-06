package ru.kuryakin.tema2.parse_0;

public class Visitor extends Parse0BaseVisitor<Integer> {
    private int total = 0;
    @Override
    public Integer visitOutVal(Parse0Parser.OutValContext ctx) {
        int sum = visit(ctx.list());
        System.out.println("Sum end " + total);
        return sum;
    }

    @Override
    public Integer visitAddNum(Parse0Parser.AddNumContext ctx) {
        return total += Integer.valueOf(ctx.Num().getText());
    }

    @Override
    public Integer visitAddVal(Parse0Parser.AddValContext ctx) {
        total += Integer.valueOf(ctx.Num().getText());
        visit(ctx.list());
        return total;
    }
}
