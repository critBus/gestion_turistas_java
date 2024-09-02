package Viajes_Turisticos;

import java.io.Serializable;

public abstract class Persona implements Serializable {

    private String nombre;
    private String sexo;
    private boolean viajadoAntes;
    double precioBasicoAutobus;

    //Constructor
    public Persona(String nombre, String sexo, boolean viajadoAntes, double precioBasicoAutobus) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.viajadoAntes = viajadoAntes;
        this.precioBasicoAutobus = precioBasicoAutobus;

    }

    public abstract double calcularPrecioPasaje(double precioBasicoViaje);

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getViajadoAntes() {
        return this.viajadoAntes;
    }

    public void setViajadoAntes(boolean viajadoAntes) {
        this.viajadoAntes = viajadoAntes;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPrecioBasicoAutobus() {
        return this.precioBasicoAutobus;
    }

    public void setPrecioBasicoAutobus(double precioBasicoAutobus) {
        this.precioBasicoAutobus = precioBasicoAutobus;
    }

    @Override
    public String toString() {
        return "Persona{"
                + "Nombre= "
                + nombre
                + "Sexo= "
                + sexo
                + "Ha viajado antes= "
                + viajadoAntes
                + "Precio básico del autobus= "
                + precioBasicoAutobus
                + "}";
    }

    public void imprimirDetalles() {
        System.out.println(toString());
    }
}
