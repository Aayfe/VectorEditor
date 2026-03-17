//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cz.uhk.vedit.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Square extends AbstractGraphicObject {
    protected int a;

    public Square() {
    }

    public Square(Point point, Color color, int a) {
        super(point, color);
        this.a = a;
    }

    public Square(int x, int y, Color color, int a) {
        super(x, y, color);
        this.a = a;
    }

    public void draw(Graphics2D g) {
        g.setColor(this.color);
        g.drawRect(this.point.x, this.point.y, this.a, this.a);
    }

    public boolean contains(Point point) {
        return false;
    }
}
