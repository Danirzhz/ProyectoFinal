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

    private JPanel panelProductos;
    private List<Producto> botonProducto= new ArrayList<>();
    private PanelFactura panelFactura;


    public PanelProductos(PanelFactura panelFactura)  {
        this.panelFactura = panelFactura;
        componentesPanelPro();
    }

    public JPanel componentesPanelPro(){
        panelProductos = new JPanel(new GridLayout(5,2,20,20));

        try {
            this.botonProducto=RellenaBotonesProductos.rellenarBotones();
            for (Producto p :
                    this.botonProducto) {
                //Le paso el nombre de la imagen como string y después me creo el boton poniendo la imagen

                ImageIcon imagen = new ImageIcon((p.getImagen()));
                JButton boton = new JButton(imagen);

                // JButton boton = new JButton(p.getNombre());

                String nombre;
                int precio;
                precio=p.getPrecio();
                nombre=p.getNombre();
                boton.addActionListener(e1 -> {
                    String textoAnterior;
                    textoAnterior=panelFactura.getAreaDeTexto().getText();
                    panelFactura.getAreaDeTexto().setText(nombre +" "+ precio +"\n"+textoAnterior);

                });
                panelProductos.add(boton);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return panelProductos;
    }



}

