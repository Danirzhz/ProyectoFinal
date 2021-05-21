package PracticaFinal;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MiBoton {
    private final String nombre;
    private  final JButton boton;
    private final int precio;

    public MiBoton(String nombre, int cantidad) {
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
    private void rellenaBotonFichero() throws IOException {
        List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
        for (String s :
                lineas) {
            String[] campos=s.split(":");
            MiBoton boton=new MiBoton(campos[0],Integer.parseInt(String.valueOf(precio)));
        }
    }
}
