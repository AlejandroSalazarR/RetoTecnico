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
    
    public naveLanzadora(String nombre,int edad,double estatura){
      super(nombre,edad);  
      this.estatura = estatura;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getNomNave() {
        return nomNave;
    }

    public void setNomNave(String nomNave) {
        this.nomNave = nomNave;
    }

    public int getEdadNave() {
        return edadNave;
    }

    public void setEdadNave(int edadNave) {
        this.edadNave = edadNave;
    }
     
    
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
    
    @Override
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
    
}
