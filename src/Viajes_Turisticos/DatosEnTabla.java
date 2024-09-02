/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viajes_Turisticos;

import java.io.Serializable;
import javax.swing.table.DefaultTableModel;
import utiles.UtilesTablas;

public class DatosEnTabla implements Serializable {

    public String[][] datosTablaViajes;
    public String[][] datosTablaCubano;
    public String[][] datosTablaExtranjero;
    public String[][] datosTablaPanel;
    public String[][] datosTablaTaxi;
    public String[][] datosTablaAutobus;

    public void actualizarLasTablas() {
        UtilesTablas.actualizarTabla(Pag1.modeloViajes, datosTablaViajes);
        UtilesTablas.actualizarTabla(Pag1.modeloCubano, datosTablaCubano);
        UtilesTablas.actualizarTabla(Pag1.modeloExtranjero, datosTablaExtranjero);
        UtilesTablas.actualizarTabla(Pag1.modeloPanel, datosTablaPanel);
        UtilesTablas.actualizarTabla(Pag1.modeloTaxi, datosTablaTaxi);
        UtilesTablas.actualizarTabla(Pag1.modeloAutobus, datosTablaAutobus);

    }

    public void almacenarDatosDeTablas() {
        this.datosTablaViajes = UtilesTablas.obtenerDatosDeTabla(Pag1.modeloViajes);
        this.datosTablaCubano = UtilesTablas.obtenerDatosDeTabla(Pag1.modeloCubano);
        this.datosTablaExtranjero = UtilesTablas.obtenerDatosDeTabla(Pag1.modeloExtranjero);
        this.datosTablaPanel = UtilesTablas.obtenerDatosDeTabla(Pag1.modeloPanel);
        this.datosTablaTaxi = UtilesTablas.obtenerDatosDeTabla(Pag1.modeloTaxi);
        this.datosTablaAutobus = UtilesTablas.obtenerDatosDeTabla(Pag1.modeloAutobus);
    }

    
}
