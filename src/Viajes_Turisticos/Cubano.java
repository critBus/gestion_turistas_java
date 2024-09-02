package Viajes_Turisticos;

public class Cubano extends Persona {

    private String carneDeIndentidad;
    private String dirrecion;

    //Constructor
    public Cubano(String nombre, String sexo, boolean viajadoAntes, double precioBasicoAutobus, String carneDeIndentidad, String dirrecion) {
        super(nombre, sexo, viajadoAntes, precioBasicoAutobus);
        this.carneDeIndentidad = carneDeIndentidad;
        this.dirrecion = dirrecion;
    }

    public boolean validarCarnetIdentidad() {
        return carneDeIndentidad != null && carneDeIndentidad.matches("\\d{11}");

    }

    //Getters y Setters
    public String getCarneDeIndentidad() {
        return this.carneDeIndentidad;
    }

    public void setCarneDeIndentidad(String carneDeIndentidad) {
        this.carneDeIndentidad = carneDeIndentidad;
    }

    public String getDirrecion() {
        return this.dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    @Override
    public String toString() {
        return "Cubano{"
                + "Nombre= "
                + getNombre()
                + "Sexo= "
                + getSexo()
                + "Ha viajado antes= "
                + getViajadoAntes()
                + "Precio básico del autobus= "
                + getPrecioBasicoAutobus()
                + "Carnet de identidad= "
                + carneDeIndentidad
                + "Dirección particular= "
                + dirrecion
                + "}";
    }

    public void imprimirDetallesCubano() {
        System.out.println("Detalles de persona cubana: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Ha viajado antes?: " + getViajadoAntes());
        System.out.println("Precio básico a pagar: " + getPrecioBasicoAutobus());
        System.out.println("Carnet de identidad: " + carneDeIndentidad);
        System.out.println("Dirección particular: " + dirrecion);

    }

    @Override
    public double calcularPrecioPasaje(double precioBasicoViaje) {
        return this.precioBasicoAutobus / 27 + precioBasicoViaje;
    }

}
