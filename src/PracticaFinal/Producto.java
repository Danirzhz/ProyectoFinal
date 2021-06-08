package PracticaFinal;

import javax.swing.*;

//Este es el boton del producto

public class Producto {
    private final String nombre;
    private final JButton boton;
    private final int precio;
    private final String stringImagen;



    public Producto(String nombre, int cantidad , String imagen) {
        this.nombre = nombre;
        this.precio = cantidad;
        this.boton= new JButton(nombre);
        this.stringImagen =imagen;

    }


    public String getStringImagen(){return stringImagen;}
    public int getPrecio(){
        return precio;
    }
    public JButton getBoton() {
        return boton;
    }
    public String getNombre() {
        return nombre;
    }
}
