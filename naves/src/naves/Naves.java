package naves;

import java.util.Scanner;
import javax.swing.JOptionPane;


/** @since  29/07/2022
* @author Alejandro Salazar Rendón
* @version 1.0 */

public class Naves {

       //construir un objeto
    public static void main(String[] args) throws InterruptedException {
        
        naves.Naves.Menu();       
    }
    
    /**
    * The function Menu() is a function that creates a menu for the user to interact with the program
    */
    public static void Menu(){
        int i = 0;
        int newNave=0;
        int contnaves = 0;
           while(i!= 1){
               naves.Naves.llamar();
               System.out.println(" ");
               System.out.println("1. Crear una nueva nave  2. cerrar el programa");
               newNave = Integer.parseInt(JOptionPane.showInputDialog("1. Crear una nueva nave  2. cerrar el programa"));
               contnaves= contnaves + 1;
               if(newNave == 1){
                   System.out.println("...Creando nueva nave...");
                   System.out.println("Numero de naves creadas : " + contnaves);
               }else if (newNave == 2){
                   System.out.println("Numero de naves creadas : "+ contnaves);
                   System.out.println("Gracias por usar nuestros servicios");
                   i=1;
               }
           }
        
        
    }
   
    /**
     * It asks the user to input a number, and then it calls a function from another class based on the
     * number the user inputs
     */
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
    
    /**
    * The function seleccionarLanzadera() creates a new object of the class naveLanzadora, and then
    * calls the method tipos() of the class naveLanzadora
    */
    public static void seleccionarLanzadera(int num){
        int num2;
        System.out.println("Creando nave lanzadora");
            naveLanzadora naveLanz1 = new naveLanzadora ("Skylab",11,1.1);
            
            System.out.println("");
           if(num == 1){ 
               naveLanz1.tipos();
           }
    }
    
    /**
    * The function seleccionarNTP() is called from the main function, and it creates a new object of
    * the class NoTP, and then calls the method tipos() from the class NoTP
    */
    public static void seleccionarNTP(int num){
        int num2;
        System.out.println("Creando nave No tripulada");
            NoTP naveNoTP = new NoTP ("Salyut",200,3);
            
            System.out.println("");
           if(num == 2){ 
               naveNoTP.tipos();     
              }      
    }
    
    /**
     * It's a function that creates a spaceship, and asks the user if he wants to create a spaceship
     * with people or animals
     */
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
    
    /**
    * The function llamarPersonas() takes an integer as an argument and returns methos tipos()
    *
    */
    
    public static void llamarPersonas(int  num){
        
        //System.out.println("Creando nave tripulada por personas...");
        Personas personas1 =  new Personas ("SpaceShipOne",444,5);
        
            personas1.tipos();   
            
           
    }
    
    /**
    * The function llamarAnimales() takes an integer as an argument and returns methos tipos()
    *
    */
    public static void llamarAnimales(int  num){
        
        Animales animales1 =  new Animales ("X-15",555,6);
       
            animales1.tipos();     
           
       
    }
}

    

