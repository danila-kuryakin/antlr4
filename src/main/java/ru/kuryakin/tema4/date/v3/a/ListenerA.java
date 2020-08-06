package ru.kuryakin.tema4.date.v3.a;

public class ListenerA extends Date_v3aBaseListener {
    int state = 0;
    @Override
    public void exitDate(Date_v3aParser.DateContext ctx) {
        switch (ctx.month.getText()){
            case "jan" : state = 1; break;
            case "feb" : state = 2; break;
            case "mar" : state = 3; break;
            case "apr" : state = 4; break;
            case "may" : state = 5; break;
            case "jun" : state = 6; break;
            case "jul" : state = 7; break;
            case "aug" : state = 8; break;
            case "sep" : state = 9; break;
            case "oct" : state = 10; break;
            case "nov" : state = 11; break;
            case "dec" : state = 12; break;
        }
        String date = String.format("%2d-%2d-%4d", state,
                Integer.valueOf(ctx.day.getText()), Integer.valueOf(ctx.year.getText()));
        System.out.println(date);

    }
}
