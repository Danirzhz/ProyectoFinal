package PracticaFinal;

import javax.swing.*;

//Este será el frame en el que añadire todos los paneles
import PracticaFinal.PanelAcciones;

import java.awt.*;

public class FramePrincipal extends JPanel {

        private static JFrame framePrincipal;


    public static void main(String[] args) {
        framePrincipal=new JFrame();
        JPanel panelPrincipal= new JPanel(new GridLayout(1,3));
        PanelAcciones panelAccion = new PanelAcciones();
        PanelFactura panelFac = new PanelFactura();
        PanelProductos panelPro = new PanelProductos();

        panelPrincipal.add(panelPro.componentesPanelPro());
        panelPrincipal.add(panelFac.componentesPanelFact());
        panelPrincipal.add(panelAccion.componentesPanelAcciones());



        framePrincipal.add(panelPrincipal);
        framePrincipal.setSize(500,500);
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
        framePrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}