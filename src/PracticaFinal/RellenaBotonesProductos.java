package PracticaFinal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//Con esta clase rellenaremos los botones de la clase MiBotonProducto con los nombres
public class RellenaBotonesProductos {

    public static List<String> rellenarBotones() throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("productos.csv"));
        for (String s :
                lineas) {
            String[] campos=s.split(":");
            int precio = 0;
            MiBotonProducto boton=new MiBotonProducto(campos[0],Integer.parseInt(String.valueOf(precio)));
            lineas.add(String.valueOf(boton));
        }
        return lineas;
    }

    /*private static List<Botones> throws IOException {
        List<String> lineas= Files.readAllLines(Paths.get("productos.csv"));
        for (String s :
                lineas) {
            String[] campos=s.split(":");
            MiBoton boton=new MiBoton(campos[0],Integer.parseInt(String.valueOf(precio)));
        }
    }*/
}
