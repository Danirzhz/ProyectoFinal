package Desechado;

import javax.swing.*;

class Productos{
    private final String nombre;
    private final int precio;
    private final JButton boton;

    Productos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        boton=new JButton(nombre);
    }
}