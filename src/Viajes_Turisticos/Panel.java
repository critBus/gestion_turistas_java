package Viajes_Turisticos;

public class Panel extends Carro {

    private String tipoCombustible;

    //Constructor
    public Panel(String chapa, int capacidad, String nombreDelChofer, String tipo) {
        super(chapa, capacidad, nombreDelChofer, "Panel");
        setTipoCombustible(tipoCombustible);
    }

    @Override
    public String toString() {
        return "Panel{"
                + "Chapa= "
                + getChapa()
                + "Capacidad= "
                + getCapacidad()
                + "Tipo de vehiculo= "
                + getTipo()
                + "Nombre del chofer= "
                + getNombreDelChofer()
                + "}";
    }

    public void imprimirDetallesPanel() {
        System.out.println("Detalles del panel: ");
        System.out.println("Chapa: " + getChapa());
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Tipo de vehiculo: " + getTipo());
        System.out.println("Nombre del chofer: " + getNombreDelChofer());
    }

    @Override
    public String getTipoDeCombustible() {
        return tipoCombustible;
    }

    private String setTipoCombustible(String tipoCombustible) {
        return tipoCombustible;
    }

    @Override
    public double calcularRecaudacionViaje(double precioPorPasajero) {
        return capacidad * precioPorPasajero;
    }
}
