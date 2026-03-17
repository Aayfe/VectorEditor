
package cz.uhk.vedit;

import cz.uhk.vedit.gui.VeditFrame;
import javax.swing.SwingUtilities;

public class Main {
    static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                (new VeditFrame()).setVisible(true);
            }
        });
    }
}
