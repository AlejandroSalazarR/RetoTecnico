package naves;

import javax.swing.JOptionPane;

/** @since  29/07/2022
* @author Alejandro Salazar Rendón
* @version 1.0 */


public class naveLanzadora extends tipoDeNave{
    private double estatura;
    private int num1;
    private String nomNave;
    private int edadNave;
    
    //A constructor
    public naveLanzadora(String nombre,int edad,double estatura){
      super(nombre,edad);  
      this.estatura = estatura;
    }

     // A method that is overriding the method in the superclass.   
    @Override
    public void tipos(){
        int num2;
        System.out.println("Que tipo de nave lanzadera?");
        System.out.println("1. Satelites 2.En orbita 3.fuera de orbita 4.Exploracion");
        num2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de nave lanzadora? "));
        
        if(num2 == 1){
            System.out.println("Has escogido una nave lanzadera tipo satelite");
        } else if(num2 == 2){
            System.out.println("Has escogido una nave lanzadera tipo En orbita");
        } else if(num2 == 3){
            System.out.println("Has escogido una nave lanzadera tipo fuera de orbita");
        } else if(num2 == 4){
            System.out.println("Has escogido una nave lanzadera tipo exploracion");
        }
    }
    
    // Overriding the method verDatos() from the superclass Persona.
    @Override
    public void verDatos(){
        System.out.println("El nombre es : "+nombre);
        System.out.println("la edad es : "+edad);
        System.out.println("la estatura es : "+ estatura);
    }   
    
    //Method that creates a "Nave"
    public void crearNave(){
         
        System.out.println("");System.out.println("1. Nave lanzadora 2.Nave no tripulada 3. Nave tripulada");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para crear una nave: "));
        if(num1 == 1){
            System.out.println("Creando nave lanzadora");
             
        }
        else if(num1 == 2){
            System.out.println("Creando nave no tripuladas");  
        }
        else if (num1 == 3){
            System.out.println("Creando naves tripuladas");
        }       
        
         nomNave = (JOptionPane.showInputDialog("Digite el nombre de la nave: "));
                System.out.println("El nombre es : " + nomNave);
              edadNave = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad de la nave: "));
                System.out.println("La edad de la nave es : " + edadNave + "años");
    }
    
}
