/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5bis;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] enteros = new int[100];
        llenarVector(enteros);
        mostrarVector(enteros);
        
    }
    public static void llenarVector(int [] enteros){
      for (int i=0; i<99; i++){
       enteros[i]= i+1;
     }
    }
    public static void mostrarVector (int []enteros){
       for (int i=99; i>0; i--){
       System.out.println(" [ "+ enteros[i] +" ] ");
      }
    }
}
