package PracticaFinal;

import javax.swing.*;

public class PanelFactura {
    public JPanel getPanel() {
        return panel;
    }

    private final JPanel panel;


    public PanelFactura(JPanel panel) {
        this.panel = panel;
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
