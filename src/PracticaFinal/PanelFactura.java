package PracticaFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JTextArea area = new JTextArea();
        JButton boton = new JButton("Ticket");


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(area);
        frame.add(boton);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aquí ira el boton del recibo para hacer la factura

            }
        });
    }
}
