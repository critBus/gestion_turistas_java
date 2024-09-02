/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_vt;

import Viajes_Turisticos.Autobus;
import Viajes_Turisticos.Carro;
import Viajes_Turisticos.Cubano;
import Viajes_Turisticos.EmpresaTranstur;
import Viajes_Turisticos.Excursion;
import Viajes_Turisticos.Extranjero;
import Viajes_Turisticos.Pag1;
import Viajes_Turisticos.Panel;
import Viajes_Turisticos.Persona;
import Viajes_Turisticos.Taxi;
import Viajes_Turisticos.Viajes;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yanisey
 */
public class Proyecto_VT {
    public static final String ARCHIVO="data.data";
    public static EmpresaTranstur empresa;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
       empresa= EmpresaTranstur.cargarEstado(ARCHIVO);
       
       System.out.println("0-lista de viajes:"+empresa.getListadoDeViajes().size());
       
       Pag1 pag1 =new Pag1();
       pag1.setVisible(true);
       pag1.setLocationRelativeTo(null);
       
       pag1.addWindowListener(new WindowListener() {
           @Override
           public void windowOpened(WindowEvent e) {
               
           }

           @Override
           public void windowClosing(WindowEvent e) {
               try{
                   empresa.getDatosEnTabla().almacenarDatosDeTablas();
                   empresa.guardarEstado(ARCHIVO);
                   System.out.println("se llamo");
                   System.out.println("lista de viajes:"+empresa.getListadoDeViajes().size());
               }catch(Exception ex){
                   ex.printStackTrace();
               }
           }

           @Override
           public void windowClosed(WindowEvent e) {
               
           }

           @Override
           public void windowIconified(WindowEvent e) {
               
           }

           @Override
           public void windowDeiconified(WindowEvent e) {
               
           }

           @Override
           public void windowActivated(WindowEvent e) {
               
           }

           @Override
           public void windowDeactivated(WindowEvent e) {
               
           }
       });
       
       
       
    
      
     
       //Autobus
       String chapa1= " ABC123 " ;
       int capacidad1=50;
       String nombreDelChofer1= " Carlos " ;
       String tipo1= " Autobus " ;
       int cantMantenimientos1=10;
       String fechaProximoMantenimiento1= " 2023-12-31 " ;
       
       //Taxi
       String chapa2="XYZ-789";
       int capacidad2=4;
       String nombreDelChofer2="Juan";
       String tipo2="Taxi";
       String marca2="Toyota";
     
       //Panel
       String chapa3="DEF-456";
       int capacidad3=8;
       String nombreDelChofer3="Pedro";
       String tipo3="Panel";
        
       
        

      
         
         
   
    }

  
   

   
}
                

   
     

 