package PracticaFinal;

import javax.swing.*;

//Este será el frame en el que añadire todos los paneles
public class FramePrincipal {
    private JFrame framePrincipal;

    public FramePrincipal(JFrame framePrincipal) {
        this.framePrincipal = framePrincipal;
    }


    public void anyadePanel(JPanel panel){
        framePrincipal.add(panel);
    }

    public static void main(String[] args) {
        JFrame framePrincipal=new JFrame();

        framePrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        framePrincipal.pack();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }
}