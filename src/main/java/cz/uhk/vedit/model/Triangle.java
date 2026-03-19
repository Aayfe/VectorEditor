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
    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color);
        g.drawLine(point.x, point.y, a );
    }

    @Override
    public boolean contains(Point g) {
        return false;
    }
}
