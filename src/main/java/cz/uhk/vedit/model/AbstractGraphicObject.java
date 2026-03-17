package cz.uhk.vedit.model;

//Předek všech grafických objektů v editoru

import java.awt.*;

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
        setPoint(x , y);
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    public Color getColor() {
        return color;
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


    public abstract void draw(Graphics2D g);

    public abstract boolean contains(Point point);
    public boolean contains(int x, int y){
        return contains(new Point(x, y));
    }





}
