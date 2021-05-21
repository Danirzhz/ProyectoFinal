package PracticaFinal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PanelProductos {


    private final JPanel panel;
    private final ArrayList<MiBoton> botones=new ArrayList<>();
    public PanelProductos(JPanel panel) {
        this.panel = panel;

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
