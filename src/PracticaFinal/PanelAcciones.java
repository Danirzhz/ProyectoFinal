package PracticaFinal;

import javax.swing.*;
import java.awt.*;

//Este panel será mi panel derecho con acciones de sacar la media de los productos y demás
public class PanelAcciones {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel(new GridLayout(3,5,10,10));



        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
