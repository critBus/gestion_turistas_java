package Viajes_Turisticos;

public class Extranjero extends Persona {

    private String paisDeOrigen;
    private String nacionalidad;
    private String DNI;
    private String numeroDePasaporte;

    //Constructor
    public Extranjero(String nombre, String sexo, boolean viajadoAntes, double precioBasicoAutobus, String paisDeOrigen, String nacionalidad, String DNI, String numeroDePasaporte) {
        super(nombre, sexo, viajadoAntes, precioBasicoAutobus);
        this.paisDeOrigen = paisDeOrigen;
        this.nacionalidad = nacionalidad;
        this.numeroDePasaporte = numeroDePasaporte;
        this.DNI = DNI;

    }

    //Getters y Setters
    public String getPaisDeOrigen() {
        return this.paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNumeroDePasaporte() {
        return this.numeroDePasaporte;
    }

    public void setNumeroDePasaporte(String numeroDePasaporte) {
        this.numeroDePasaporte = numeroDePasaporte;
    }

    @Override
    public String toString() {
        return "Extranjero{"
                + "Nombre= "
                + getNombre()
                + "Sexo= "
                + getSexo()
                + "Ha viajado antes= "
                + getViajadoAntes()
                + "Precio básico del autobus= "
                + getPrecioBasicoAutobus()
                + "País de origen= "
                + paisDeOrigen
                + "Nacionalidad= "
                + nacionalidad
                + "DNI= "
                + DNI
                + "Número del pasaporte= "
                + numeroDePasaporte
                + "}";
    }

    public void imprimirDetallesExtranjero() {
        System.out.println("Detalles de persona extranjera: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Ha viajado antes?: " + getViajadoAntes());
        System.out.println("Precio básico a pagar: " + getPrecioBasicoAutobus());
        System.out.println("País de origen: " + paisDeOrigen);
        System.out.println("Nacionalidadr: " + nacionalidad);
        System.out.println("DNI: " + DNI);
        System.out.println("Número de pasaporte: " + numeroDePasaporte);

    }

    @Override
    public double calcularPrecioPasaje(double precioBasicoViaje) {
        return this.precioBasicoAutobus * 1.5 + precioBasicoViaje;
    }
}
