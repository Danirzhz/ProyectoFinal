package PracticaFinal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Panel izquierdo en el que iran todos los productos como botones , los botones con imagenes
public class PanelProductos {

    public static JPanel panelProductos;
    private final List<Producto> botones=new ArrayList<>();

    public PanelProductos() {
    }

    public JPanel getPanel() {
        return panelProductos;
    }
//for each

    public void anyadirBoton(){
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        panelProductos = new JPanel();



        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


}

