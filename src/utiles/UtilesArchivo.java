/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UtilesArchivo {

    public static void crearTXT(String nombreTXT, String lines[]) {
        try {
            PrintWriter p = new PrintWriter(nombreTXT + ".txt");
            for (String l : lines) {
                p.println(l);

            }
            p.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private static void escribirEnArchivoTEXTO(File archivo, String contenido[], boolean aContinuacion) throws IOException {
        if (!archivo.exists()) {
            PrintWriter pp = new PrintWriter(archivo);
            pp.close();

        }
        PrintWriter p = new PrintWriter(new FileWriter(archivo, aContinuacion));
        if (contenido != null) {
            for (int i = 0; i < contenido.length; i++) {
                p.println(contenido[i]);
            }
        }
        p.close();
    }
}
