package PracticaFinal;

import javax.swing.*;

//Este será el frame en el que añadire todos los paneles
public class FramePrincipal {
    public static void main(String[] args) {
        JFrame framePrincipal=new JFrame();

        framePrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //framePrincipal.add();
        //framePrincipal.add();
        framePrincipal.pack();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }
}
