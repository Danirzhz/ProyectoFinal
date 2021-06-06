package PracticaFinal;

import javax.swing.*;
import java.awt.*;

//Este panel será mi panel central en el que se mostrará los productos  que hemos seleccionado y tendrá un boton
// que los sumará
public class PanelFactura  {

   private JPanel panelFactura;
   private JTextArea areaDeTexto;

    public void setPanelFactura(JPanel panelFactura) {
        this.panelFactura = panelFactura;
    }

    public JTextArea getAreaDeTexto() {
        return areaDeTexto;
    }

    public void setAreaDeTexto() {
        this.areaDeTexto = areaDeTexto;
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
         JTextArea area = new JTextArea(3,2);
         JButton ticket = new JButton("Tiquet");

        frame.add(panelFactura);


        panelFactura.add(area);
        panelFactura.add(ticket);



        ticket.addActionListener(e -> {});//Accion de la factura




        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    public Component componentesPanelFact(){

        panelFactura = new JPanel(new GridLayout(2,1,10,10));
        JTextArea area = new JTextArea(3,2);
        JButton ticket = new JButton("Tiquet");

        panelFactura.add(area);

        panelFactura.add(ticket);
        return panelFactura;
    }
    public  void anyadeProductos(Producto producto){
        areaDeTexto.setText(areaDeTexto.getText()+producto.getNombre());
    }

}
