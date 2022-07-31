package naves;

import javax.swing.JOptionPane;

/** @since  29/07/2022
* @author Alejandro Salazar Rendón
* @version 1.0 */

public class tiposDeNaves {
    String nombre;
    int    edad;
    private double estatura;
    private int num1;
    private String nomNave;
    private int edadNave;
    
    // A constructor.
    public tiposDeNaves(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        //this.estatura = estatura;
    }
   
    //creamos al metodo abstracto
    public void verDatos(){
        System.out.println("El nombre es : "+nombre);
        System.out.println("la edad es : "+edad);
        System.out.println("la estatura es : "+ estatura);
    }   
    
    //method that creates a "Nave"
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
    
    // A method that prints the word "abstraccion"
    public void mensaje (){
        System.out.println("abstraccion");
    }
    
}
