package PracticaFinal;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Este panel será mi panel central en el que se mostrará los productos  que hemos seleccionado y tendrá un boton
// que los sumará
public class PanelFactura  {

   private JPanel panelFactura;
   private JTextArea areaDeTexto;

    public JTextArea getAreaDeTexto() {
        return areaDeTexto;
    }




    public PanelFactura() {
        componentesPanelFact();

    }
    public JPanel componentesPanelFact(){

        panelFactura = new JPanel(new GridLayout(2,1,10,10));
        areaDeTexto = new JTextArea(3,2);
        JButton ticket = new JButton("Tiquet");

        panelFactura.add(areaDeTexto);


        panelFactura.add(ticket);

        ticket.addActionListener(e -> {imprimirTicket(areaDeTexto.getText());}); //Imprimir ticket

        return panelFactura;
    }
        //Para imprimir ticket

    static void imprimirTicket(String s){
        JTextPane jtp = new JTextPane();
        jtp.setBackground(Color.white);
        jtp.setFont(new Font("Courier New",Font.BOLD,16));
        jtp.setText(s);
        boolean show = true;
        try {
            jtp.print(null, null, show, null, null, show);
        } catch (java.awt.print.PrinterException ex) {
            ex.printStackTrace();
        }
    }



}
