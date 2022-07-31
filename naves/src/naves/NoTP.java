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
public class NoTP extends tipoDeNave{
    private int numeroMotores;
    public NoTP(String nombre, int edad,int numeroMotores) {
        super(nombre, edad);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
    
    public void tipos(){
        int num2;
        System.out.println("Que tipo de nave lanzadera?");
        System.out.println("1. Satelites 2.En orbita 3.fuera de orbita 4.Exploracion");
        num2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de nave no tripulada? "));
        
        if(num2 == 1){
            System.out.println("Has escogido una nave no tripulada tipo satelite");
        } else if(num2 == 2){
            System.out.println("Has escogido una nave no tripulada tipo En orbita");
        } else if(num2 == 3){
            System.out.println("Has escogido una nave no tripulada tipo fuera de orbita");
        } else if(num2 == 4){
            System.out.println("Has escogido una nave no tripulada tipo exploracion");
        }
    }
    
    
    
}
