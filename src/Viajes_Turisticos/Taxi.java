package Viajes_Turisticos;

public class Taxi extends Carro {

    private String marca;
    private final String tipoCombustible = "Gasolina";

    //Constructor
    public Taxi(String chapa, int capacidad, String nombreDelChofer, String tipo, String marca) {
        super(chapa, capacidad, nombreDelChofer, "Taxi");
        this.marca = marca;

    }

    //Getters y Setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Taxi{"
                + "Chapa= "
                + getChapa()
                + "Capacidad= "
                + getCapacidad()
                + "Tipo de vehiculo= "
                + getTipo()
                + "Nombre del chofer= "
                + getNombreDelChofer()
                + "Marca= "
                + getMarca()
                + "}";
    }

    public void imprimirDetallesTaxi() {
        System.out.println("Detalles del taxi: ");
        System.out.println("Chapa: " + getChapa());
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Tipo de vehiculo: " + getTipo());
        System.out.println("Nombre del chofer: " + getNombreDelChofer());
        System.out.println("Marca: " + marca);
    }

    @Override
    public String getTipoDeCombustible() {
        return "Gasolina";
    }

    @Override
    public double calcularRecaudacionViaje(double precioPorPasajero) {
        return capacidad * precioPorPasajero;
    }
}
