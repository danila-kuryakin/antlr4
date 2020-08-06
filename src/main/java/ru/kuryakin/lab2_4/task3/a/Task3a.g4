grammar Task3a;

@parser::members{
    private int x;
    private int y;
    private int num;
    private int i;
    private double l;
    ArrayList<String> coord;

    public void initCoord(){
        this.i = 0;
        this.l = -1;
    }

    public void setX(String x) {
        this.x = Integer.parseInt(x);
    }

    public void setY(String y) {
        this.y = Integer.parseInt(y);
    }

    public String get(){
        return String.format("num: %s, length: %f\n", num, l);
    }

    public void compare() {
        i++;
        double newL = Math.sqrt((this.x*this.x+this.y*this.y));
        if(newL > l){
            this.l = newL;
            num = i;
            return;
        }
    }
}

init    :   {initCoord();}
            list
            {System.out.printf(get());}
        ;

list    :   ext
        |   list  ext
        ;

ext : '('coord   {setX($coord.text); }
    ',' coord   {setY($coord.text); }
    ')' {compare();}
    ;

coord
    :   Value
    ;

WS
    :   [ \t\r\n]+ -> channel(HIDDEN);

Value
    :   [-+]?[0-9]+;
