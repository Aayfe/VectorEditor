//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cz.uhk.vedit.gui;

import cz.uhk.vedit.model.AbstractGraphicObject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private List<AbstractGraphicObject> objects = new ArrayList();

    public DrawPanel(List<AbstractGraphicObject> objects) {
        this.objects = objects;
        this.initGui();
    }

    public DrawPanel() {
        this.initGui();
    }

    private void initGui() {
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(800, 600));
    }

    public void addObject(AbstractGraphicObject obj) {
        this.objects.add(obj);
    }

    public void paint(Graphics g) {
        super.paint(g);

        for(AbstractGraphicObject obj : this.objects) {
            obj.draw((Graphics2D)g);
        }

    }
}
