package ru.kuryakin.test;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws ParseException {
        LocalTime begine = LocalTime.of(12, 1);
        LocalTime end = LocalTime.of(17, 57);
        Duration duration = Duration.between(begine, end);
        System.out.printf("%d:%d", duration.toHours(), duration.toMinutes()%60);
    }
}
