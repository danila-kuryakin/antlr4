package ru.kuryakin.lab2_4.task5;

import java.time.Duration;
import java.util.ArrayList;

public class Listener extends Task5BaseListener {
    private ArrayList<Sheldule> sheldule;
    Duration delta, maxDelta;

    public Listener(){
        sheldule = new ArrayList<>();
        maxDelta = Duration.ZERO;
    }

    public Duration getMaxDelta() {
        return maxDelta;
    }

    @Override
    public void exitStart(Task5Parser.StartContext ctx) {

        if (sheldule.size() > 1) {
            for (int i = 0; i < sheldule.size() - 1; i++) {
                if (sheldule.get(i).getEnd().getHour() >= 9 && sheldule.get(i + 1).getBegine().getHour() < 17) {
                    delta = Duration.between(sheldule.get(i).getEnd(), sheldule.get(i + 1).getBegine());
                    if (delta.toMinutes() > maxDelta.toMinutes())
                        maxDelta = delta;
                }
            }
        }
    }

    @Override
    public void exitList(Task5Parser.ListContext ctx) {
        sheldule.add(new Sheldule(ctx.interval().begine.hour.getText(), ctx.interval().begine.minute.getText(),
                ctx.interval().end.hour.getText(), ctx.interval().end.minute.getText(), ctx.Text().getText()));
    }
}
