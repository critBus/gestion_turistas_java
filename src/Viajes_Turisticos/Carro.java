package Viajes_Turisticos;

import java.io.Serializable;

public abstract class Carro implements Serializable{

	private String chapa;
	int capacidad;
	private String nombreDelChofer;
	private String tipo;
	

        //Constructor
	public Carro(String chapa,int capacidad,String nombreDelChofer,String tipo){
         this.chapa=chapa; 
         this.capacidad=capacidad;
         this.nombreDelChofer=nombreDelChofer;
         this.tipo=tipo;
         
         
        }
        //Getters y Setters
	public String getChapa() {
		return this.chapa;
	}

	public void setChapa(String chapa) {
		this.chapa=chapa;
	}

	
	public int getCapacidad() {
		return this.capacidad;
	}

	
	public void setCapacidad(int capacidad) {
		this.capacidad=capacidad;
	}

	public String getNombreDelChofer() {
		return this.nombreDelChofer;
	}

	public void setNombreDelChofer(String nombreDelChofer) {
		this.nombreDelChofer=nombreDelChofer;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo=tipo;
	}

	 
          @Override
        public String toString(){
          return "Carro{"
                   + 
                  "Chapa= " +
                  chapa + 
                  "Capacidad= " +
                  capacidad +
                  "Tipo de vehiculo= " +
                  tipo +
                  "Nombre del chofer= " +
                  nombreDelChofer+
                  "}";
        }
          //Metodo abstracto para obtener el tipo de combustible
          public abstract String getTipoDeCombustible();
          public abstract double calcularRecaudacionViaje(double precioPorPasajero);
        
        
        public void imprimirDetallesCarro(){
            System.out.println("Detalles del carro: ");
            System.out.println("Chapa: "+chapa); 
            System.out.println("Capacidad: "+capacidad); 
            System.out.println("Tipo de vehiculo: "+tipo); 
            System.out.println("Nombre del chofer: "+nombreDelChofer);  
        } }
    

        

                  
