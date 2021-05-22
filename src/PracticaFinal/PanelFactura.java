package PracticaFinal;

import javax.swing.*;
import java.awt.event.ActionListener;

public class PanelFactura {
    public JPanel getPanel() {
        return panel;
    }

    private final JPanel panel;


    public PanelFactura(JPanel panel) {
        this.panel = panel;
    }

    //ActionListener

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JTextArea area = new JTextArea();
        JButton boton = new JButton("Ticket");


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(area);
        frame.add(boton);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
