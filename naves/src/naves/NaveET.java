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

public abstract class NaveET extends tipoDeNave{
    
    private int numTripulantes;
    
    // A constructor for the class NaveET.
    public NaveET(String nombre, int edad,int numTripulantes) {
        super(nombre, edad);
        this.numTripulantes = numTripulantes;
    }
    
    // A method that is overriding the method mensaje() from the interface.
    @Override
    public void mensaje(){
            System.out.println("");
    }
    
    // A method that asks the user to choose a type of ship.
     public void tipos(){
        int tipo;
        System.out.println("Que tipo de nave ");
        System.out.println("1. Satelites 2.En orbita 3.fuera de orbita 4.Exploracion");
        tipo = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de naves tripuladas por animales? "));
        
        switch (tipo) {
            case 1:
                System.out.println("Has escogido una nave  tripulada tipo satelite");
                break;
            case 2:
                System.out.println("Has escogido una nave  tripulada tipo En orbita");
                break;
            case 3:
                System.out.println("Has escogido una nave tripulada tipo fuera de orbita");
                break;
            case 4:
                System.out.println("Has escogido una nave  tripulada tipo exploracion");
                break;
            default:
                break;
        }
    }
    
    
}
