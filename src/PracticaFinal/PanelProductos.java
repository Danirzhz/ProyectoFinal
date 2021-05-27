package PracticaFinal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Panel izquierdo en el que iran todos los productos como botones , los botones con imagenes
public class PanelProductos {


    private final JPanel panel;
    private final List<Producto> botones=new ArrayList<>();

    public PanelProductos(JPanel panel) {
        this.panel = panel;
    }
    public JPanel getPanel() {
        return panel;
    }
//for each 

    public void anyadirBoton(){


    }
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


}

