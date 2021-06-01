package PracticaFinal;

import javax.swing.*;
import java.awt.*;

//Este panel será mi panel derecho con acciones de sacar la media de los productos y demás
public class PanelAcciones {


    private static JPanel panelAcciones;



    public static JPanel getPanelAcciones() {
        return panelAcciones;
    }

    public static void main(String[] args) {

        JFrame frame=new JFrame();
        panelAcciones=new JPanel(new GridLayout(3,5,10,10));
        JButton boton1 = new JButton("Accion 1");
        JButton boton2 = new JButton("Accion 2");
        JButton boton3 = new JButton("Accion 3");

        panelAcciones.add(boton1);
        panelAcciones.add(boton2);
        panelAcciones.add(boton3);


        frame.add(panelAcciones);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
