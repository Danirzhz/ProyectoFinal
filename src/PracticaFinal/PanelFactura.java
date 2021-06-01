package PracticaFinal;

import javax.swing.*;
import java.awt.*;

//Este panel será mi panel central en el que se mostrará los productos  que hemos seleccionado y tendrá un boton
// que los sumará
public class PanelFactura  {

    private static JPanel panelFactura;

    public PanelFactura() {
    }

    public JPanel getPanelFactura() {
        return panelFactura;
    }



    public static void main(String[] args) {

         JFrame frame=new JFrame("Factura");
         panelFactura = new JPanel(new GridLayout(2,1));
         JTextArea area = new JTextArea(3,2);
         JButton ticket = new JButton("Tiquet");

        frame.add(panelFactura);


        panelFactura.add(area);
        panelFactura.add(ticket);



        ticket.addActionListener(e -> {});//Accion de la factura




        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
