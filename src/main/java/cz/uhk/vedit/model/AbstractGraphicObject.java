//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cz.uhk.vedit.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class AbstractGraphicObject {
    protected Point point;
    protected Color color;

    public AbstractGraphicObject() {
    }

    public AbstractGraphicObject(Point point, Color color) {
        this.point = point;
        this.color = color;
    }

    public AbstractGraphicObject(int x, int y, Color color) {
        this.setPoint(x, y);
        this.color = color;
    }

    public Point getPoint() {
        return this.point;
    }

    public Color getColor() {
        return this.color;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setPoint(int x, int y) {
        this.point = new Point(x, y);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics2D var1);

    public abstract boolean contains(Point var1);

    public boolean contains(int x, int y) {
        return this.contains(new Point(x, y));
    }
}
