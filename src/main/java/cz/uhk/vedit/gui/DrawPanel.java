//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cz.uhk.vedit.gui;

import cz.uhk.vedit.model.AbstractGraphicObject;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {


    private List<AbstractGraphicObject> objects = new ArrayList();
    private AbstractGraphicObject selected;
    private int dx, dy;

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


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                selected = findObjectUnderMouse(e.getPoint());
                if (selected != null){
                    dx = e.getX() - selected.getPoint().x;
                    dy = e.getY() - selected.getPoint().y;
                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {

                if (selected != null){
                    selected.setPoint(e.getX() - dx, e.getY() - dy);
                    repaint();
                }
            }
        });

    }
    private AbstractGraphicObject findObjectUnderMouse(Point point){
        for(AbstractGraphicObject obj : this.objects) {

            if (obj.contains(point)){
                return obj;
            }
        }

        return null;
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
