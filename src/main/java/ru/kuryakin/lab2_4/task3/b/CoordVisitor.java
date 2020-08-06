package ru.kuryakin.lab2_4.task3.b;

import java.util.ArrayList;

public class CoordVisitor extends Task3bBaseVisitor<Integer> {

    ArrayList<Coord> coord;
    public CoordVisitor() {
        this.coord = new ArrayList();
    }

    public void cordCount() {
        double l = 0;
        for (int i = 1; i < coord.size(); i++) {
            l += Math.sqrt((Math.pow(coord.get(i).getX()-coord.get(i-1).getX(),2) +
                    Math.pow(coord.get(i).getY()-coord.get(i-1).getY(),2)));
        }
        l += Math.sqrt((Math.pow(coord.get(0).getX()-coord.get(coord.size()-1).getX(),2) +
                Math.pow(coord.get(0).getY()-coord.get(coord.size()-1).getY(),2)));
        System.out.printf("Perimetr = %.4f", l);
    }

    @Override
    public Integer visitInit(Task3bParser.InitContext ctx) {
        return super.visitInit(ctx);
    }

    @Override
    public Integer visitAddCoord(Task3bParser.AddCoordContext ctx) {
        coord.add(new Coord(Integer.parseInt(ctx.coord(0).getText()), Integer.parseInt(ctx.coord(1).getText())));
        return super.visitAddCoord(ctx);
    }

    @Override
    public Integer visitCoord(Task3bParser.CoordContext ctx) {
        return super.visitCoord(ctx);
    }
}
