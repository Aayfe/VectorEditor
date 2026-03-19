package cz.uhk.vedit.model;

import java.awt.*;

public class Triangle extends AbstractGraphicObject{
    protected int a;

    public Triangle(){

    }
    public Triangle(Point point, Color color, int a) {
        super(point, color);
        this.a = a;
    }

    public Triangle(int x, int y, Color color, int a) {
        super(x, y, color);
        this.a = a;
    }
    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color);

        int pyth =(int)Math.sqrt(Math.pow(a,2)-Math.pow(a/2,2));

        g.drawLine(point.x, point.y +pyth, point.x+a ,point.y+pyth);
        g.drawLine(point.x, point.y+pyth, point.x+a/2, point.y);
        g.drawLine(point.x+a, point.y+pyth, point.x+a-a/2, point.y );


    }

    @Override
    public boolean contains(Point g) {
        return false;
    }
}
