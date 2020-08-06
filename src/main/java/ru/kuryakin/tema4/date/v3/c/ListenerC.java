package ru.kuryakin.tema4.date.v3.c;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListenerC extends Date_v3cBaseListener {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy") {{ setLenient(false); }};

    public static boolean isValidDate(String date) {
        try {
            sdf.parse(date);
            return true;
        } catch (Exception e) {}
        return false;
    }

    @Override
    public void exitDate(Date_v3cParser.DateContext ctx) {
        String dateStr = String.format("%d-%s-%s", ctx.month().state, ctx.day.getText(), ctx.year.getText());
        if (isValidDate(dateStr)) {
            try {
            Date date = sdf.parse(dateStr);
            String printDate = String.format("%dy %dm %dd",
                    date.getYear(),
                    date.getMonth(),
                    date.getDay());
            System.out.println(printDate);
            } catch (ParseException e) {}
        } else {
            System.out.println("Date is not valid");
        }
    }
}
