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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rene
 */
public abstract class UtilesTablas {
    public static String[][] obtenerDatosDeTabla(DefaultTableModel modelo) {
        int row_count = modelo.getRowCount();
        int colum_count = modelo.getColumnCount();
        String[][] datos = new String[row_count][colum_count];
        for (int i = 0; i < row_count; i++) {
            for (int j = 0; j < colum_count; j++) {
                datos[i][j] = modelo.getValueAt(i, j) + "";
            }
        }
        return datos;
    }

    public static void actualizarTabla(DefaultTableModel modelo, String[][] datos) {
        if (datos != null) {
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            for (String[] dato : datos) {
                modelo.addRow(dato);
            }
        }

    }
    public static void crearTXTconContenidoDeTabla(DefaultTableModel modelo,String nombreArchivo){
        String[] titulos=new String[modelo.getColumnCount()];
        for (int i = 0; i < titulos.length; i++) {
            titulos[i]=modelo.getColumnName(i);
        }
        String[][] contenido=obtenerDatosDeTabla(modelo);
        String[] lineas=new String[contenido.length];
        for (int i = 0; i < contenido.length; i++) {
            String linea="";
            for (int j = 0; j < contenido[i].length; j++) {
                linea+=titulos[j]+": "+contenido[i][j]+"  |";
            }
            lineas[i]=linea;
        }
        UtilesArchivo.crearTXT(nombreArchivo, lineas);
    }
    
}
