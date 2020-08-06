package ru.kuryakin.lab2_4.task4;

public class ListVisitor extends Task4BaseVisitor<Integer> {

    private int i, line, sum;

    public ListVisitor() {
        i = 1;
        line = 1;
    }

    @Override
    public Integer visitCount1(Task4Parser.Count1Context ctx) {
        sum += Integer.parseInt(ctx.Num().getText());
        if(i<=8) {
            if(line<=4) {
                System.out.printf("Number of elements in row %s: %s. Sum = %s\n", line, i, sum);
            } else System.out.printf("Max lines 4\n");
        } else System.out.printf("Max elements 8\n");
        i = 1;
        line++;
        sum = 0;

        return super.visitCount1(ctx);
    }

    @Override
    public Integer visitCount2(Task4Parser.Count2Context ctx) {
        i++;
        sum += Integer.parseInt(ctx.Num().getText());
        return super.visitCount2(ctx);
    }
}
