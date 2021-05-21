package PracticaFinal;

import javax.swing.*;
import java.util.List;

public class PanelProductos {


    private final JPanel panel;

    public PanelProductos(JPanel panel) {
        this.panel = panel;

        List<MiBoton> botones;
    }
    public JPanel getPanel() {
        return panel;
    }


    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}

