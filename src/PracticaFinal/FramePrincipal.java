package PracticaFinal;

import javax.swing.*;

//Este será el frame en el que añadire todos los paneles
public class FramePrincipal {


    private JFrame framePrincipal;

    public static void main(String[] args) {
        JFrame framePrincipal=new JFrame();
        PanelAcciones panelAcciones= new PanelAcciones();

        framePrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       // framePrincipal.add(panelAcciones); Crear un constructor para cada panel e inicializarlo aquí y añadirlo al frame
        framePrincipal.pack();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }
}