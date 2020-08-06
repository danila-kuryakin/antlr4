package ru.kuryakin.tema4.date.v3.b;

public class ListenerB extends Date_v3bBaseListener {

    @Override
    public void exitDate(Date_v3bParser.DateContext ctx) {
        String date = String.format("%2d-%2d-%4d", ctx.month().state,
                Integer.valueOf(ctx.day.getText()), Integer.valueOf(ctx.year.getText()));
        System.out.println(date);
    }
}
