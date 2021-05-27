package PracticaFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Este panel será mi panel central en el que se mostrará los productos  que hemos seleccionado y tendrá un boton
// que los sumará
public class PanelFactura {

    private final JPanel panel;

    public JPanel getPanel() {
        return panel;
    }

    public PanelFactura(JPanel panel) {
        this.panel = panel;
    }


    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JTextField area = new JTextField();
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
                //Aquí irá el boton del recibo para hacer el tiquet

            }
        });
    }
}
