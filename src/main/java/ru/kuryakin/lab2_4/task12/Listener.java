package ru.kuryakin.lab2_4.task12;

public class Listener extends Task12BaseListener {
    @Override
    public void exitList(Task12Parser.ListContext ctx) {
        System.out.println(ctx.path().getText());
    }
}
