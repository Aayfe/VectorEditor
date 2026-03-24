package cz.uhk.vedit.model;

import java.awt.*;

public class Rectangle extends AbstractGraphicObject{
    protected int a;
    protected int b;

    public Rectangle(){

    }
    public Rectangle(Point point, Color color, int a) {
        super(point, color);
        this.a = a;
    }

    public Rectangle(int x, int y, Color color, int a) {
        super(x, y, color);
        this.a = a;
    }
    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color);
        b = a/2;
        g.drawRect(this.point.x, this.point.y, this.a, b);


    }

    @Override
    public boolean contains(Point point) {

        return (point.x >= this.point.x && point.x <= this.point.x + a) && (point.y >= this.point.y && point.y <= this.point.y + b);

    }
}
