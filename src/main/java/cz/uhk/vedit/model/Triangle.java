package cz.uhk.vedit.model;

import java.awt.*;

public class Triangle extends AbstractGraphicObject{
    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color);

    }

    @Override
    public boolean contains(Point g) {
        return false;
    }
}
