/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5bis;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        int[] aleatorios =new int[tamaño];
        llenarVector( aleatorios,tamaño);
        mostrarVector( aleatorios,tamaño);
        System.out.println("Ingrese el número a buscar");
        int numero= leer.nextInt();
        buscarNumero(aleatorios, tamaño,numero);
        
        
    }
    public static void llenarVector(int [] aleatorios, int tamaño){
      Random numeroRandom =new Random();
      for (int i=0; i<tamaño; i++){
       aleatorios[i]= numeroRandom.nextInt(10);
       System.out.println(" [ "+ aleatorios[i] +" ] ");
      
     }
    }
    public static void mostrarVector (int []aleatorios,int tamaño){
       for (int i=0; i>tamaño; i++){
       System.out.println(" [ "+ aleatorios[i] +" ] ");
      }
    }
    public static void buscarNumero (int [] aleatorios, int tamaño ,int numero){
      int contador = 0;
            for (int i = 0; i < tamaño; i++) {
               if ( aleatorios[i]== numero){
                   contador ++;
                   System.out.println("El número se encuentra en la posición : " +i);
               }
            if ( contador>1){
                System.out.println("El número se repite " +contador+ " veces");
            }else if(contador==0){
                System.out.println("El número no se encuentra en el vector");
            }
            }
}
}
