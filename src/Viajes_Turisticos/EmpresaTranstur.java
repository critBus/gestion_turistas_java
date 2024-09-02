package Viajes_Turisticos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JTextField;

public class EmpresaTranstur implements Serializable {

    private double ganancias;
    //private  Scanner sc = new Scanner(System.in);
    private double precioBasicoAutobus;

    private ArrayList<Viajes> listadoDeViajes;
    private Excursion excursion;
    private Excursion[] listaDeExcursiones;
    private DatosEnTabla datosEnTabla;

    public EmpresaTranstur() {
        this.listadoDeViajes = new ArrayList<>();
        this.ganancias = 0.00;
        this.datosEnTabla = new DatosEnTabla();
    }

    public EmpresaTranstur(List<Viajes> of) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Metodo para gestionar viajes
    public void agregarViaje(Viajes viajes) {
        this.listadoDeViajes.add(viajes);
        this.ganancias += viajes.precioBasicoViaje;
    }

    public double calcularGanancias() {
        double total = 0.0;
        for (Viajes viajes : listadoDeViajes) {
            for (Persona persona : viajes.listadoDePersonas) {
                total += viajes.calcularPrecioPasaje(persona);
            }
        }
        return total;
    }

    public void guardarEstado(String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(this);
        }
    }

    public static EmpresaTranstur cargarEstado(String archivo) throws IOException, ClassNotFoundException {
        File file = new File(archivo);
        if (!file.exists()) {
            return new EmpresaTranstur();
        }
        try {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (EmpresaTranstur) ois.readObject();
            }
        } catch (InvalidClassException ex) {
            System.out.println("el objeto cambio");
            file.delete();
            return new EmpresaTranstur();
        }
    }

    public List<Excursion> listarExcursionesRecaudacion() {
        List<Excursion> recaudacionList = new ArrayList<>();
        for (Viajes viajes : listadoDeViajes) {
            if (viajes instanceof Excursion) {
                recaudacionList.add((Excursion) viajes);
            }
        }
        //Aqui podemos ordenar las excursiones por nombre del guia
        recaudacionList.sort((e1, e2) -> e1.getNombreDelGuia().compareTo(e2.getNombreDelGuia()));
        return recaudacionList;
    }

    public List<Viajes> listarDestinoAutobus() {
        List<Viajes> destinosAutobus = new ArrayList<>();
        for (Viajes viajes : listadoDeViajes) {
            destinosAutobus.add(viajes);
        }
        return destinosAutobus;
    }

    public Viajes buscarViaje(int numeroViaje) {
        for (Viajes viajes : listadoDeViajes) {
            if (viajes.numeroDelViaje == numeroViaje) {
                return viajes;
            }
        }
        return null;
    }

    public int contarExcursionesPorTuristas(int cantidadTuristas) {
        int contador = 0;
        for (Viajes viajes : listadoDeViajes) {
            if (viajes instanceof Excursion && viajes.getCantDePersonas() > cantidadTuristas) {
                contador++;
            }
        }
        return contador;
    }

    public ArrayList<Viajes> getListadoDeViajes() {
        return this.listadoDeViajes;
    }

    public void setListadoDeViajes(ArrayList<Viajes> listadoDeViajes) {
        this.listadoDeViajes = listadoDeViajes;
    }

    public double getGanancias() {
        return this.ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public int recaudacionPorExcursiones() {
        double total = 0.00;
        for (Viajes viajes : listadoDeViajes) {
            if (viajes instanceof Excursion) {
                for (Persona persona : viajes.listadoDePersonas) {
                    total += viajes.calcularPrecioPasaje(persona);
                }
            }
        }
        return 0;

    }

    public double recaudacionPorViajes() {
        double total = 0.0;
        for (Viajes viajes : listadoDeViajes) {
            if (!(viajes instanceof Excursion)) {
                for (Persona persona : viajes.listadoDePersonas) {
                    total += viajes.calcularPrecioPasaje(persona);
                }
            }
        }
        return total;
    }

    public int recaudacionPorClientesNacionales() {
        double total = 0.0;
        for (Viajes viajes : listadoDeViajes) {
            for (Persona persona : viajes.getListadoDePersonas()) {
                if (persona instanceof Cubano) {
                    total += viajes.calcularPrecioPasaje(persona);
                }
            }
        }

        return 0;
    }

    public void recaudacionPorClientesInternacionales() {
        double total = 0.0;
        for (Viajes viajes : listadoDeViajes) {
            for (Persona persona : viajes.listadoDePersonas) {
                if (!(persona instanceof Extranjero)) {
                    total += viajes.calcularPrecioPasaje(persona);
                }
            }
        }

    }

    public void totalTuristasExcursiones() {
        int total = 0;
        for (Viajes viajes : listadoDeViajes) {
            if (viajes instanceof Excursion) {
                total += viajes.getCantDePersonas();
            }
        }
        System.out.println("Cantidad total de turistas en excursiones: " + total);
    }

    public int contarExcursionesPorGuia(String nombreDelGuia) {
        int contador = 0;
        for (Viajes viajes : listadoDeViajes) {
            if (viajes instanceof Excursion) {
                Excursion excursion = (Excursion) viajes;
                if (excursion.getNombreDelGuia().equals(nombreDelGuia)) {
                    contador++;
                }
            }
        }

        return 0;
    }

    public double calcularRecaudaion() {
        double totalRecaudacion = 0.0;
        for (Viajes viajes : listadoDeViajes) {
            totalRecaudacion += viajes.getPrecioBasicoViaje() * viajes.getCantDePersonas();
        }
        return totalRecaudacion;
    }

    public String hotelMasAtendioExtranjeros() {
        Map<String, Integer> hotelCount = new HashMap<>();
        for (Viajes viajes : listadoDeViajes) {
            if (viajes instanceof Excursion) {
                Excursion excursion = (Excursion) viajes;
                for (Persona persona : viajes.listadoDePersonas) {
                    if (persona instanceof Extranjero) {
                        String hotelNombre = excursion.getDestino();

                        hotelCount.put(hotelNombre, hotelCount.getOrDefault(hotelNombre, 0) + 1);
                    }
                }
            }
        }
        return hotelCount.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);

    }

    public HashMap<String, Integer> contarVehiculosPorCombustible() {
        HashMap<String, Integer> count = new HashMap<>();
        for (Viajes viajes : listadoDeViajes) {
            String combustible = viajes.getCarroUtilizado();
            count.put(combustible, count.getOrDefault(combustible, 0) + 1);
        }
        return count;

    }

    public double calcularPrecioPasaje(double precioBasicoViaje) {
        return this.precioBasicoAutobus * 1.5 + precioBasicoViaje;
    }

    public double getPrecioBasicoAutobus() {
        return precioBasicoAutobus;
    }

    public void setPrecioBasicoAutobus(double precioBasicoAutobus) {
        this.precioBasicoAutobus = precioBasicoAutobus;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public Excursion[] getListaDeExcursiones() {
        return listaDeExcursiones;
    }

    public void setListaDeExcursiones(Excursion[] listaDeExcursiones) {
        this.listaDeExcursiones = listaDeExcursiones;
    }

    public DatosEnTabla getDatosEnTabla() {
        return datosEnTabla;
    }

    void recaudacionPorClientesNacionales(String total) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
