package cz.uhk.vedit.gui;

import cz.uhk.vedit.model.Square;

import javax.swing.*;
import java.awt.*;

public class VeditFrame extends JFrame {

    private DrawPanel drawPanel = new DrawPanel();

    public VeditFrame(){
        super("FIM Vector Editor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(drawPanel, BorderLayout.CENTER);

        pack();
    }

    private void initSampleData(){
        drawPanel.addObject(new Square(100,100,Color.red, 500));
        drawPanel.addObject(new Square(170,170,Color.gray, 100));
        drawPanel.addObject(new Square(1,100,Color.blue, 70));
    }
}
