package PracticaFinal;

import javax.swing.*;

public class PanelProductos {


    private final JPanel panel;

    public PanelProductos(JPanel panel) {
        this.panel = panel;

    }
    public JPanel getPanel() {
        return panel;
    }


    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
class Productos{
    private final String nombre;
    private final int precio;
    private final JButton boton;

    Productos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        boton=new JButton(nombre);//Hola bebe
    }
}
