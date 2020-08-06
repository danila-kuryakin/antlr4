package ru.kuryakin.lab2_4.task5;

import java.time.LocalTime;

public class Sheldule {

    private LocalTime begine, end;
    private String  commet;

    public Sheldule(String begineHour, String begineMinute, String endHour, String endMinute, String commet) {
        this.begine = LocalTime.of(Integer.parseInt(begineHour), Integer.parseInt(begineMinute));
        this.end = LocalTime.of(Integer.parseInt(endHour), Integer.parseInt(endMinute));;
        this.commet = commet;
    }

    public LocalTime getBegine() {
        return begine;
    }

    public LocalTime getEnd() {
        return end;
    }
}
