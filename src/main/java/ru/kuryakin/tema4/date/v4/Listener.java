package ru.kuryakin.tema4.date.v4;

import java.time.LocalDate;
import java.time.Period;

public class Listener extends Date_v4BaseListener {

    @Override
    public void exitBetween(Date_v4Parser.BetweenContext ctx) {
        try {
            LocalDate startDate = LocalDate.of(Integer.parseInt(ctx.date(0).year.getText()),
                    ctx.date(0).month().state, Integer.parseInt(ctx.date(0).day.getText()));
            LocalDate endDate = LocalDate.of(Integer.parseInt(ctx.date(1).year.getText()),
                    ctx.date(1).month().state, Integer.parseInt(ctx.date(1).day.getText()));
            Period period = Period.between(endDate, startDate);
            System.out.printf("%dd:%dm:%dy\n", period.getDays(), period.getMonths(), period.getYears());
        } catch (Exception e){
            System.out.println("Date is not valid");
        }
    }
}
