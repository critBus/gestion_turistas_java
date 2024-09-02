package Viajes_Turisticos;

import java.io.Serializable;

public class HotelCentroRecreativo implements Serializable{

    private String nombreHotel;
    private boolean esHotel;

    //Constructor
    public HotelCentroRecreativo(String nombreHotel, boolean esHotel) {

        this.nombreHotel = nombreHotel;
        this.esHotel = esHotel;
        setNombreHotel(nombreHotel);
        setEsHotel(esHotel);
    }

    //Getters y Setters
    public String getNombreHotel() {
        return this.nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public boolean isEsHotel() {
        return this.esHotel;
    }

    public void setEsHotel(boolean esHotel) {
        this.esHotel = esHotel;
    }

}
