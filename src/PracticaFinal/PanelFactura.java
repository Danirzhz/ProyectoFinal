package PracticaFinal;

import javax.swing.*;
import java.awt.*;

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

    public JPanel getPanelFactura() {
        return panelFactura;
    }



    public static void main(String[] args) {

         JFrame frame=new JFrame("Factura");
         JPanel panelFactura = new JPanel(new GridLayout(2,1));
         JTextArea areaDeTexto = new JTextArea(3,2);
         JButton ticket = new JButton("Tiquet");
         String s= areaDeTexto.getText();
        frame.add(panelFactura);


        panelFactura.add(areaDeTexto);
        panelFactura.add(ticket);



       ticket.addActionListener(e -> {imprimirTicket(s);});//Accion de la factura




        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    public JPanel componentesPanelFact(){

        panelFactura = new JPanel(new GridLayout(2,1,10,10));
        areaDeTexto = new JTextArea(3,2);
        JButton ticket = new JButton("Tiquet");

        String s= getAreaDeTexto().getText();
        ticket.addActionListener(e -> {imprimirTicket(s);}); //Imprimir ticket

        panelFactura.add(areaDeTexto);
        panelFactura.add(ticket);

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
