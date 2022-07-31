/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naves;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class tiposDeNaves {
    String nombre;
    int    edad;
    private double estatura;
    private int num1;
    private String nomNave;
    private int edadNave;
    

    public tiposDeNaves(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        //this.estatura = estatura;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    //creamos al metodo abstracto
    public void verDatos(){
        System.out.println("El nombre es : "+nombre);
        System.out.println("la edad es : "+edad);
        System.out.println("la estatura es : "+ estatura);
    }   
    
    public void crearNave(){
         
        System.out.println("");System.out.println("1. Nave lanzadora 2.Nave no tripulada 3. Nave tripulada");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para crear una nave: "));
        if(num1 == 1){
            System.out.println("Creando nave lanzadora");
             
        }
        else if(num1 == 2){
            System.out.println("Creando nave no tripuladas");
           // nomNave = (JOptionPane.showInputDialog("Digite el nombre de la nave: "));
             //   System.out.println("El nombre es : " + nomNave);
           // edadNave = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad de la nave: "));
             // System.out.println("La edad de la nave es : " + edadNave + "años");
                
        }
        else if (num1 == 3){
            System.out.println("Creando naves tripuladas");
        }       
        
         nomNave = (JOptionPane.showInputDialog("Digite el nombre de la nave: "));
                System.out.println("El nombre es : " + nomNave);
              edadNave = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad de la nave: "));
                System.out.println("La edad de la nave es : " + edadNave + "años");
             // estatura = Integer.parseInt(JOptionPane.showInputDialog("Digite la estatura de la nave: "));
             //   System.out.println("La estatura de la nave es : " + estatura + "años");
    }
    
    public void mensaje (){
        System.out.println("abstraccion");
    }
    
}
