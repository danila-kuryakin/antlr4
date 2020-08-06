package ru.kuryakin.lab2_4.task10;

import java.util.ArrayList;

public class Listener extends Task10BaseListener {

    private ArrayList<String> arrayList;

    public Listener(){
        arrayList = new ArrayList<>();
    }

    @Override
    public void exitNull(Task10Parser.NullContext ctx) {
        System.out.println("add sp, 2");
    }

    @Override
    public void exitWithList(Task10Parser.WithListContext ctx) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf("push %s\n", arrayList.get(i));
        }
    }

    @Override
    public void exitEndNumber(Task10Parser.EndNumberContext ctx) {
        arrayList.add(ctx.Number().getText());
    }

    @Override
    public void exitList(Task10Parser.ListContext ctx) {
        arrayList.add(ctx.Reg().getText());
    }
}
