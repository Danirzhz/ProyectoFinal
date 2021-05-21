package PracticaFinal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RellenaBotonesProductos {

    public static List<String> rellenarBotones() throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get("productos.csv"));
        for (String s :
                lineas) {
            String[] campos=s.split(":");
            int precio = 0;
            MiBoton boton=new MiBoton(campos[0],Integer.parseInt(String.valueOf(precio)));
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
