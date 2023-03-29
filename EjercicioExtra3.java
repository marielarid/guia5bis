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
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector = new int [5];
        //int[] vecto1= new int [5];
        vector =llenaVector(vector);
        System.out.println(" ");       
        vector= muestraVector(vector);
        System.out.println(" ");
        
        
    }
    public static int[] llenaVector (int []vector){
      //int[] retorno = new int[5] ;
      Random numeroRandom = new Random();
        for (int i = 0; i < 5; i++) {
            vector[i]= numeroRandom.nextInt(10);
           // System.out.print("[ "+ vector[i]+ "]");
        }
            
        return  vector;//retorno;
    }
    public static int [] muestraVector (int []vector){
        //int[] retorno = new int [5];
        for (int i = 0; i < 5; i++) {
            System.out.print("[ "+ vector[i]+" ]");
            
        }
        return vector;//retorno;
    }
}
