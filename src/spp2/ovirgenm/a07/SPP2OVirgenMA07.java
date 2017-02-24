/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.a07;
import java.util.Scanner;
/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Long [] directorio = new Long [10];
        int posicion;
      
        Scanner keyboard = new Scanner (System.in);
        int indice;
        for (int i = 0; i < directorio.length; i++){
            System.out.println("Introduce el número telefónico de la posición "+ i);
            directorio [i] = keyboard.nextLong();
        }
        
        System.out.println("Introduzca la posición del número que desea conocer: ");
        posicion = keyboard.nextInt();
        if(posicion>9){
            System.out.println("La posición introducida no se encuentra en el rango");
        }else{
        System.out.println("En la posición " + posicion + " el numero es: " + directorio[posicion] );
        
 
        
       }
    }
    
    }

