package naves;

import java.util.Scanner;
import javax.swing.JOptionPane;


/** @since  29/07/2022
* @author Alejandro Salazar Rendón
* @version 1.0 */

public class Naves {

       //construir un objeto
    public static void main(String[] args) throws InterruptedException {
        
        naves.Naves.llamar();
        
        //Naves1.verDatos();
        
       
       // naveLanzadora naveLanz1 = new naveLanzadora ("Jorge",22,1.7);
       //naveLanz1.verDatos();
       //naveLanz1.crearNave();
       //NaveET Naves3 = new NaveET ("Marte3",23,2);
       //Naves3.mensaje();
       
       
       
    }
   
    
    public static void llamar(){
          int num1 ;
          int num2 ;
        System.out.println("");System.out.println("1. Nave lanzadora 2.Nave no tripulada 3. Nave tripulada");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para crear una nave: "));
        if(num1 == 1){
            naves.Naves.seleccionarLanzadera(num1);
             
        }
        else if(num1 == 2){
            naves.Naves.seleccionarNTP(num1);
                           
        }
        else if (num1 == 3){
            naves.Naves.seleccionarET(num1);
        }
        
    }
    
    public static void seleccionarLanzadera(int num){
        int num2;
        System.out.println("Creando nave lanzadora");
            naveLanzadora naveLanz1 = new naveLanzadora ("Lanzadera",11,1.1);
            
            System.out.println("");
           if(num == 1){ 
               naveLanz1.tipos();
           }
    }
    
    public static void seleccionarNTP(int num){
        int num2;
        System.out.println("Creando nave No tripulada");
            NoTP naveNoTP = new NoTP ("Nava NTP",200,3);
            
            System.out.println("");
           if(num == 2){ 
               naveNoTP.tipos();     
              }      
    }
    
    
    public static void seleccionarET(int num){
        int tipo;
        int num2;
        System.out.println("Creando nave Espacial tripulada");
        System.out.println("Tripulada por: "); 
        System.out.println("1.Nave tripulada por personas 2. Nave tripualada por animales");
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para crear una nave: "));
        System.out.println("");
        
        if(tipo == 1){
            System.out.println("Creando nave tripulada por personas...");
            naves.Naves.llamarPersonas(tipo);
                        
        }else if(tipo == 2){
            System.out.println("Creando nave tripulada por animales...");
            naves.Naves.llamarAnimales(tipo);
        }     
    }
    
    public static void llamarPersonas(int  num){
        
        //System.out.println("Creando nave tripulada por personas...");
        Personas personas1 =  new Personas ("Raul",444,5);
        
            personas1.tipos();   
            
           
    }
    
    public static void llamarAnimales(int  num){
        
        Animales animales1 =  new Animales ("Jorge",555,6);
       
            animales1.tipos();     
           
       
    }
}

    

