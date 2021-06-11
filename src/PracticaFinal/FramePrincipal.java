package PracticaFinal;

import javax.swing.*;

//Este será el frame en el que añadire todos los paneles


import java.awt.*;

public class FramePrincipal extends JPanel {




    public static void main(String[] args) {

       JFrame framePrincipal=new JFrame();
        JPanel panelPrincipal= new JPanel(new GridLayout(1,3));

        PanelFactura panelFac = new PanelFactura();
        PanelProductos panelPro = new PanelProductos(panelFac);

        panelPrincipal.add(panelPro.componentesPanelPro());
        panelPrincipal.add(panelFac.componentesPanelFact());




        framePrincipal.add(panelPrincipal);
        framePrincipal.setSize(500,500);
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
        framePrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}