package Viajes_Turisticos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 

public class Viajes implements Serializable{

        int numeroDelViaje;
	int cantDePersonas;
	private String carroUtilizado;
	double precioBasicoViaje;
        private String destino;
        List<Persona> listadoDePersonas;
        
   
	
        //Constructor
        public Viajes(int numeroDelViaje,int cantDePersonas,String carroUtilizado,double precioBasicoViaje, String destino, List<Persona> listadoDePersonas){
        setNumeroDelViaje(numeroDelViaje);
        setCantDePersonas(cantDePersonas);
        setCarroUtilizado(carroUtilizado);
        setPrecioBasicoViaje(precioBasicoViaje);
        setDestino(destino);
        
        }

        //Getters y Setters
	public int getNumeroDelViaje() {
		return this.numeroDelViaje;
	}

	public void setNumeroDelViaje(int numeroDelViaje) {
		this.numeroDelViaje=numeroDelViaje;
	}

	public int getCantDePersonas() {
		return this.cantDePersonas;
	}

	public void setCantDePersonas(int cantDePersonas) {
		this.cantDePersonas=cantDePersonas;
	}
        
	public String getCarroUtilizado() {
		return this.carroUtilizado;
	}

	public void setCarroUtilizado(String carroUtilizado) {
		this.carroUtilizado=carroUtilizado;
	}

	public double getPrecioBasicoViaje() {
		return this.precioBasicoViaje;
	}

	public void setPrecioBasicoViaje(double precioBasicoViaje) {
		this.precioBasicoViaje=precioBasicoViaje;
	}

        public String getDestino() {
        return destino;
        }

        public void setDestino(String destino) {
        this.destino = destino;
        }
        
        public List<Persona> getListadoDePersonas() {
        return listadoDePersonas;
        }

        public void setListadoDePersonas(List<Persona> listadoDePersonas) {
        this.listadoDePersonas = listadoDePersonas;
        }
       
        
        
   
        public double calcularPrecioPasaje(Persona persona){
        double precio;
        if(persona instanceof Cubano){
            precio = persona.getPrecioBasicoAutobus()/27+this.precioBasicoViaje;
        }else if(persona instanceof Extranjero){
            precio = persona.getPrecioBasicoAutobus()*1.5+this.precioBasicoViaje;
        }else{
            precio = this.precioBasicoViaje;
        }
        return precio;
        }    
       
    /**
     *
     * @return
     */
    @Override
        public String toString(){
            
          return "Viajes{"
                   + 
                  "Número del viaje= " +
                  numeroDelViaje + 
                  "Cantidad de personas= " +
                  cantDePersonas+
                   "Carro utilizado= " +
                  carroUtilizado+
                  "Precio básico del viaje= " +
                  precioBasicoViaje+
                  "}";
}
       
        
        public  void imprimirDetallesViajes(){
            System.out.println("Detalles del viaje: ");
            System.out.println("Número del viaje: "+numeroDelViaje); 
            System.out.println("Cantidad de personas: "+cantDePersonas); 
            System.out.println("Carro utilizado: "+carroUtilizado);  
            System.out.println("Precio básico del viaje: "+precioBasicoViaje); 
        
        }                 

    Object getCarro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     }