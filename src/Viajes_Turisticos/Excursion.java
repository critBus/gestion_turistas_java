package Viajes_Turisticos;

import java.util.ArrayList;
import java.util.List;

public class Excursion extends Viajes {

    private String nombreDelGuia;

    //Constructor
    public Excursion(int numeroDelViaje, int cantDePersonas, String carroUtilizado, double precioBasicoViaje, String destino, List<Persona> listadoDePersonas, String nombreDelGuia) {
        super(numeroDelViaje, cantDePersonas, carroUtilizado, precioBasicoViaje, destino, listadoDePersonas);
        this.nombreDelGuia = nombreDelGuia;

    }

    //Getters y Setters
    public String getNombreDelGuia() {
        return this.nombreDelGuia;
    }

    public void setNombreDelGuia(String nombreDelGuia) {
        this.nombreDelGuia = nombreDelGuia;
    }

    @Override
    public String toString() {
        return "Excursión { "
                + " Número del viaje = "
                + getNumeroDelViaje()
                + " Cantidad de personas = "
                + getCantDePersonas()
                + " Carro utilizados = "
                + getCarroUtilizado()
                + " Precio básico del viaje = "
                + getPrecioBasicoViaje()
                + " Nombre del guía = "
                + nombreDelGuia
                + "}";

    }

    public void imprimirDetallesExcursion() {
        System.out.println("Detalles del viaje: ");
        System.out.println("Número del viaje: " + getNumeroDelViaje());
        System.out.println("Cantidad de personas: " + getCantDePersonas());
        System.out.println("Carro utilizado: " + getCarroUtilizado());
        System.out.println("Precio básico del viaje: " + getPrecioBasicoViaje());
        System.out.println("Nombre del guía: " + nombreDelGuia);

    }
}
