package PracticaFinal;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//Panel izquierdo en el que iran todos los productos como botones , los botones con imagenes
public class PanelProductos {

    public JPanel panelProductos;
    private List<Producto> botonProducto= new ArrayList<>();


    public PanelProductos()  {
        componentesPanelPro();
        anyadirBoton();
    }

    public JPanel getPanel() {
        return panelProductos;
    }
//for each
    public static void main(String[] args) throws IOException {
        JFrame frame=new JFrame();
        JPanel panelProductos = new JPanel();




        frame.add(panelProductos);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    public void componentesPanelPro(){
        panelProductos = new JPanel();
    }

    public void anyadirBoton()  {
        try {
            this.botonProducto=RellenaBotonesProductos.rellenarBotones();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Producto p :
                this.botonProducto) {
            JButton boton = new JButton(p.getNombre());
            panelProductos.add(boton);
        }

    }
}

