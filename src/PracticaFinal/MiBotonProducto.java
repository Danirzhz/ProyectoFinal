package PracticaFinal;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//Este es el boton del producto
public class MiBotonProducto {
    private final String nombre;
    private  final JButton boton;
    private final int precio;

    public MiBotonProducto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.precio = cantidad;
        boton=new JButton(nombre);
    }
    public String getNombre(){
        return nombre;
    }
    public JButton getBoton(){
        return boton;
    }
    public int getPrecio(){
        return precio;
    }


}
