/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viajes_Turisticos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Yanisey
 */
public class ListadoDePersonasV implements Serializable {

    ArrayList<Viajes> listadoDePersonas;

    public ListadoDePersonasV() {
        listadoDePersonas = new ArrayList();
    }

    public void agregarViajes(Viajes viajes) {
        listadoDePersonas.add(viajes);
    }
}
