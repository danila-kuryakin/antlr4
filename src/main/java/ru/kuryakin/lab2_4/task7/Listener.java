package ru.kuryakin.lab2_4.task7;

public class Listener extends Task7BaseListener {

    private boolean frame, function, xCoord, yCoord;
    private boolean correct;
    private int x, y, dx, dy;
    private int method;  // 1 - interpolation, 0 - add
    private int signX, signY; // -1 нет, 0 +, 1 -

    public Listener(int x, int y){
        this.frame = false; this.function = false; this.xCoord = false; this.yCoord = false;
        this.correct = true;
        this.x = x;
        this.y = y;
        this.method = -1;
        this.signX = -1;
        this.signY = -1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMethod() {
        return method;
    }

    private void addCoord(){
        if (signX == 0){
            this.x += dx;
        } else if (signX == 1){
            this.x -= dx;
        }
        if (signY == 0){
            this.y += dy;
        } else if (signY == 1){
            this.y -= dy;
        }
    }

    @Override
    public void exitEnd(Task7Parser.EndContext ctx) {
        if (this.correct == true) {
            switch (method) {
                case -1:
                    System.out.println("Method not specified");
                    break;
                case 0:
                    addCoord();
                    break;
                case 1:
                    addCoord();
                    break;
                default:
                    System.out.println("The method is set incorrectly");
            }
        }
    }

    @Override
    public void enterList(Task7Parser.ListContext ctx) {
        frame = false;
        function = false;
        xCoord = false;
        yCoord = false;
    }

    @Override
    public void exitFrame(Task7Parser.FrameContext ctx) {
        if (!frame){
            frame = true;
        } else {
            this.correct = false;
            System.out.println("Frame repeated");
        }
    }

    @Override
    public void exitFunction(Task7Parser.FunctionContext ctx) {
        if (!function){
            function = true;
            method = Integer.parseInt(ctx.numFunction.getText());
        } else {
            this.correct = false;
            System.out.println("Function repeated");
        }
    }

    @Override
    public void exitXCoord(Task7Parser.XCoordContext ctx) {

        ctx.numX.getText().indexOf("-");

        if (!xCoord){
            xCoord = true;
            if (ctx.singX != null) {
                System.out.println("здесь был Х");
                if (ctx.singX.getText().equals("+")) {
                    signX = 0;
                } else if (ctx.singX.getText().equals("-")) {
                    signX = 1;
                }
            } else {
                signX = 0;
            }
            dx = Integer.parseInt(ctx.numX.getText());
        } else {
            dx = 0;
            dy = 0;
            this.correct = false;
            System.out.println("X coordinate repeated");
        }
    }

    @Override
    public void exitYCoord(Task7Parser.YCoordContext ctx) {
        if (!yCoord){
            yCoord = true;
            if (ctx.singY != null) {
                if (ctx.singY.getText().equals("+")) {
                    signY = 0;
                } else if (ctx.singY.getText().equals("-")) {
                    signY = 1;
                }
            } else {
                signY = 0;
            }
            dy = Integer.parseInt(ctx.numY.getText());
        } else {
            dx = 0;
            dy = 0;
            this.correct = false;
            System.out.println("Y coordinate repeated");
        }
    }
}
