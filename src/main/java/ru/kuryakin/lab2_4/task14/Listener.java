package ru.kuryakin.lab2_4.task14;

import java.util.ArrayList;

public class Listener extends Task14BaseListener {

    private int size;
    private ArrayList<String> arrayList;

    public Listener(){
        arrayList = new ArrayList<>();
    }

    @Override
    public void exitWithoutReference(Task14Parser.WithoutReferenceContext ctx) {
        if (ctx.arrauSize != null) {
            if (ctx.arrauSize != null && ctx.assign() != null) {
                return;
            }
            size = Integer.parseInt(ctx.arrauSize.getText());
            if (size >= arrayList.size()) {
                for (int i = 0; i < size; i++) {
                    if (arrayList.size() - 1 < i) {
                        if (size - 1 == i) {
                            System.out.printf("0\n");
                        } else {
                            System.out.printf("0, ");
                        }
                    } else {
                        if (arrayList.size() - 1 == i && size - 1 == i) {
                            System.out.printf("%s\n", arrayList.get(i));
                        } else {
                            System.out.printf("%s, ", arrayList.get(i));
                        }
                    }
                }
            } else {
                System.out.println("Values greater than specified");
            }
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.size() - 1 == i) {
                    System.out.printf("%s\n", arrayList.get(i));
                } else {
                    System.out.printf("%s, ", arrayList.get(i));
                }
            }
        }
    }

    @Override
    public void exitWithReference(Task14Parser.WithReferenceContext ctx) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.size()-1 == i){
                System.out.printf("%s\n", arrayList.get(i));
            } else {
                System.out.printf("%s, ", arrayList.get(i));
            }

        }
    }

    @Override
    public void exitValue(Task14Parser.ValueContext ctx) {
        arrayList.add(ctx.Number().getText());
    }
}
