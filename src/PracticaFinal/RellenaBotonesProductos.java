package PracticaFinal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
//Con esta clase rellenaremos los botones de la clase MiBotonProducto con los nombres
public class RellenaBotonesProductos {

    public static List<String> rellenarBotones() throws IOException {
        List<String> salida = new ArrayList<>();
        List<String> lineas = Files.readAllLines(Paths.get("productos.csv"));
        for (String s :
                lineas) {
            String[] campos=s.split(":");
            int precio = Integer.parseInt(campos[1]);
            Producto boton=new Producto(campos[0],precio);
            salida.add(String.valueOf(boton));
        }
        return salida;
    }


    /*public static List<String> rellenarBotones() throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("productos.csv"));
        for (String s :
                lineas) {
            String[] campos=s.split(":");
            int precio = 0;
            Producto boton=new Producto(campos[0],Integer.parseInt(String.valueOf(precio)));
            lineas.add(String.valueOf(boton));
        }
        return lineas;
    }*/
}
