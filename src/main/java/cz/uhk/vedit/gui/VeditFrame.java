//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cz.uhk.vedit.gui;

import cz.uhk.vedit.model.Circle;
import cz.uhk.vedit.model.Rectangle;
import cz.uhk.vedit.model.Square;
import cz.uhk.vedit.model.Triangle;

import java.awt.Color;
import javax.swing.JFrame;

public class VeditFrame extends JFrame {
    private DrawPanel drawPanel = new DrawPanel();

    public VeditFrame() {
        super("FIM Vector Editor");
        initSampleData();
        this.setDefaultCloseOperation(3);
        this.add(this.drawPanel, "Center");
        initSampleData();
        this.pack();
    }

    private void initSampleData() {
        this.drawPanel.addObject(new Square(100, 100, Color.red, 500));
        this.drawPanel.addObject(new Square(170, 170, Color.gray, 100));
        this.drawPanel.addObject(new Square(1, 100, Color.blue, 70));
        this.drawPanel.addObject(new Circle(170, 170, Color.gray, 100));
        this.drawPanel.addObject(new Circle(1, 100, Color.blue, 70));
        this.drawPanel.addObject(new Triangle(20, 200, Color.green, 70));
        this.drawPanel.addObject(new Triangle(300, 800, Color.green, 700));
        this.drawPanel.addObject(new Triangle(200, 200, Color.red, 50));
        this.drawPanel.addObject(new Rectangle(300, 200, Color.gray, 100));
    }
}
