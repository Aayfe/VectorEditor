
package cz.uhk.vedit.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Circle extends AbstractGraphicObject {
    protected int a;

    public Circle() {
    }

    public Circle(Point point, Color color, int a) {
        super(point, color);
        this.a = a;
    }

    public Circle(int x, int y, Color color, int a) {
        super(x, y, color);
        this.a = a;
    }

    public void draw(Graphics2D g) {
        g.setColor(this.color);
        g.drawOval(point.x, point.y, a, a);
    }

    public boolean contains(Point point) {
        return false;
    }
}