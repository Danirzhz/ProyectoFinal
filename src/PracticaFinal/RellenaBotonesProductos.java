package PracticaFinal;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
//Con esta clase rellenaremos los botones de la clase MiBotonProducto con los nombres
public class RellenaBotonesProductos {

    public static List<Producto> rellenarBotones() throws IOException {
        List<Producto> salida = new ArrayList<>();
        List<String> lineas = Files.readAllLines(Paths.get("productos.csv"));
        for (String s :
                lineas) {
            String[] campos = s.split(":");
            int precio = Integer.parseInt(campos[1]);

            Producto producto = new Producto(campos[0], precio,campos[2]); //
            salida.add(producto);
        }
        return salida;
    }
}


