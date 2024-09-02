package Viajes_Turisticos;

public class Autobus extends Carro {

    private int cantMantenimientos;
    private String fechaProximoMantenimiento;
    private final String tipoCombustible = "Diesel";

    //Constructor
    public Autobus(String chapa, int capacidad, String nombreDelChofer, String tipo, int cantMantenimientos, String fechaProximoMantenimiento) {
        super(chapa, capacidad, nombreDelChofer, "Autobus");
        this.cantMantenimientos = cantMantenimientos;
        this.fechaProximoMantenimiento = fechaProximoMantenimiento;

    }

    //Getters y Setters
    public int getCantMantenimientos() {
        return this.cantMantenimientos;
    }

    public void setCantMantenimiento(int cantMantenimientos) {
        this.cantMantenimientos = cantMantenimientos;
    }

    public String getFechaProximoMantenimiento() {
        return this.fechaProximoMantenimiento;
    }

    public void setFechaProximoMantenimiento(String fechaProximoMantenimiento) {
        this.fechaProximoMantenimiento = fechaProximoMantenimiento;
    }

    @Override
    public String toString() {
        return "Autobus{"
                + "Chapa= "
                + getChapa()
                + "Capacidad= "
                + getCapacidad()
                + "Tipo de vehiculo= "
                + getTipo()
                + "Nombre del chofer= "
                + getNombreDelChofer()
                + "Cantidad de mantenimientos realizados= "
                + getCantMantenimientos()
                + "Fecha del proximo mantenimiento= "
                + getFechaProximoMantenimiento()
                + "}";
    }

    public void imprimirDetallesAutobus() {
        System.out.println("Detalles del autobus: ");
        System.out.println("Chapa: " + getChapa());
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Tipo de vehiculo: " + getTipo());
        System.out.println("Nombre del chofer: " + getNombreDelChofer());
        System.out.println("Cantidad de mantenimientos: " + cantMantenimientos);
        System.out.println("Fecha del proximo mantenimiento: " + fechaProximoMantenimiento);

    }

    @Override
    public String getTipoDeCombustible() {
        return "Diesel";
    }

    @Override
    public double calcularRecaudacionViaje(double precioPorPasajero) {
        return capacidad * precioPorPasajero;
    }

}
