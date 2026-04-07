//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cz.uhk.vedit.gui;

import cz.uhk.vedit.model.AbstractGraphicObject;
import cz.uhk.vedit.model.ObjectGroup;

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
    private Point oldMouse;
    private boolean selection;

    public void setSelection(boolean selection) {
        this.selection = selection;
    }

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
            moveObject();



    }

    public void moveObject(){

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (!selection) return;


                    selected = findObjectUnderMouse(e.getPoint());
                    if (selected != null) {
                        oldMouse = e.getPoint();
                    }
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    if (!selection) return;


                    if (selected != null) {
                        int dx = e.getX() - oldMouse.x;
                        int dy = e.getY() - oldMouse.y;
                        selected.moveBy(dx, dy);
                        oldMouse = e.getPoint();

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
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for(AbstractGraphicObject obj : this.objects) {
            obj.draw((Graphics2D)g);
        }

    }

}
