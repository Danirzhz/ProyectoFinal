package PracticaFinal;

import javax.swing.*;
import java.awt.*;
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
        JFrame frame=new JFrame("Factura");
        JPanel panel = new JPanel(new GridLayout(2,1,10,10));
        JTextArea area = new JTextArea(5,2);
        JButton ticket = new JButton("Factura");

        frame.add(panel);

        panel.add(area);
        panel.add(ticket);



        ticket.addActionListener(e -> {});//Accion de la factura




        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
