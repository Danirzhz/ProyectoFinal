package PracticaFinal;

import javax.swing.*;

//Este es el boton del producto

public class Producto {


    private final String nombre;
    private final int precio;
    private final String imagen;



    public Producto(String nombre, int cantidad ,String  imagen) {
        this.nombre = nombre;
        this.precio = cantidad;
        this.imagen =imagen;

    }


    public String getImagen() {
        return imagen;
    }
    public int getPrecio(){
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
}
