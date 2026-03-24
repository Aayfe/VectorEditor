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
import java.awt.event.*;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.event.ChangeListener;

public class VeditFrame extends JFrame {
    private DrawPanel drawPanel = new DrawPanel();
    private JToolBar toolBar = new JToolBar();
    private int defaultSize = 50;
    private Color defaultColor = Color.BLACK;


    public VeditFrame() {
        super("FIM Vector Editor");
        //initSampleData();
        this.setDefaultCloseOperation(3);
        createToolBarButtons();

        this.add(this.drawPanel, "Center");
        this.add(this.toolBar, "North");


        this.pack();
    }
    private void createToolBarButtons(){
        JToggleButton square=new JToggleButton("Square");
        JToggleButton triangle=new JToggleButton("Triangle");
        JToggleButton rectangle=new JToggleButton("Rectangle");
        JToggleButton circle=new JToggleButton("Circle");


        ButtonGroup group = new ButtonGroup();
        group.add(square);
        group.add(triangle);
        group.add(rectangle);
        group.add(circle);


        toolBar.add(square);
        toolBar.add(triangle);
        toolBar.add(rectangle);
        toolBar.add(circle);



        drawPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getPoint());

                if(square.isSelected()){
                    drawPanel.addObject(new Square(e.getPoint(), defaultColor,defaultSize));
                }
                if(triangle.isSelected()){
                    drawPanel.addObject(new Triangle(e.getPoint(), defaultColor,defaultSize));
                }
                if(rectangle.isSelected()){
                    drawPanel.addObject(new Rectangle(e.getPoint(), defaultColor,defaultSize));
                }
                if(circle.isSelected()){
                    drawPanel.addObject(new Circle(e.getPoint(), defaultColor,defaultSize));
                }

                drawPanel.repaint();

            }
        });
    }



    private void initSampleData() {

        this.drawPanel.addObject(new Square(120, 100, Color.blue, 70));
        this.drawPanel.addObject(new Circle(1, 100, Color.blue, 70));
        this.drawPanel.addObject(new Triangle(200, 200, Color.green, 700));
        this.drawPanel.addObject(new Rectangle(300, 200, Color.gray, 100));
    }
}
