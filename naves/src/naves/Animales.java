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
public class Animales extends NaveET{
    
    private int numTripulantes;
    
    public Animales(String nombre, int edad,int numTripulantes) {
        super(nombre, edad, numTripulantes);
        this.numTripulantes = numTripulantes;
        
    } 
    
    @Override
    public void mensaje(){
        System.out.println("Heredando tripulantes Animales");
    }
    
    @Override
    public void tipos(){
        int tipo;
        
        System.out.println("Que tipo de nave tripulada por Animales?");
        System.out.println("1. Satelites 2.En orbita 3.fuera de orbita 4.Exploracion");
        tipo = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de naves tripuladas por animales? "));
        
        switch (tipo) {
            case 1:
                System.out.println("Has escogido una nave  tripulada por animales tipo satelite");
                break;
            case 2:
                System.out.println("Has escogido una nave  tripulada por animales tipo En orbita");
                break;
            case 3:
                System.out.println("Has escogido una nave tripulada por animales tipo fuera de orbita");
                break;
            case 4:
                System.out.println("Has escogido una nave  tripulada por animales tipo exploracion");
                break;
            default:
                break;
        }
    }
}
