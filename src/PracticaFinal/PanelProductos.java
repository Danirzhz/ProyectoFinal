package PracticaFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//Panel izquierdo en el que iran todos los productos como botones , los botones con imagenes
public class PanelProductos {

    public JPanel panelProductos;
    private List<Producto> botonProducto= new ArrayList<>();


    public PanelProductos()  {
        componentesPanelPro();

    }

    public JPanel getPanel() {
        return panelProductos;
    }
    public static void main(String[] args) throws IOException {
        JFrame frame=new JFrame();
        JPanel panelProductos = new JPanel();
        PanelFactura panelFactura = new PanelFactura();



        frame.add(panelProductos);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public JPanel componentesPanelPro(){
        panelProductos = new JPanel(new GridLayout(6,2,20,20));
        PanelFactura panelFactura = new PanelFactura();
        try {
            this.botonProducto=RellenaBotonesProductos.rellenarBotones();
            for (Producto p :
                    this.botonProducto) {
                JButton boton = new JButton(p.getNombre());

                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                panelProductos.add(boton);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return panelProductos;
    }



}

