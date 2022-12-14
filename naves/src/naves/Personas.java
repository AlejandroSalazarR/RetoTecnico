/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naves;

import javax.swing.JOptionPane;

/** @since  29/07/2022
* @author Alejandro Salazar Rendón
* @version 1.0 */

public class Personas extends NaveET{
    
    private int numTripulantes;
    
    // A constructor.
    public Personas(String nombre, int edad,int numTripulantes) {
        super(nombre, edad, numTripulantes);
        this.numTripulantes = numTripulantes;
    }
    
    // Overriding the method mensaje() from the interface Tripulante.
    @Override
    public void mensaje(){
        System.out.println("Heredando tripulantes personas");
    }
    
    // A method that is overriding the method in the superclass.// A method that is overriding the method in the superclass.
    @Override
     public void tipos(){
        int tipo;
        System.out.println("Que tipo de nave tripulada por personas?");
        System.out.println("1. Satelites 2.En orbita 3.fuera de orbita 4.Exploracion");
        tipo = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de naves tripuladas por personas? "));
        
        switch (tipo) {
            case 1:
                System.out.println("Has escogido una nave  tripulada por personas tipo satelite");
                break;
            case 2:
                System.out.println("Has escogido una nave  tripulada por personas tipo En orbita");
                break;
            case 3:
                System.out.println("Has escogido una nave  tripulada por personas tipo fuera de orbita");
                break;
            case 4:
                System.out.println("Has escogido una nave  tripulada por personas tipo exploracion");
                break;
            default:
                break;
        }
    }
    
    
}
