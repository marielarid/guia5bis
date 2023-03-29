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
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño de los vectores");
        int N = leer.nextInt();
        int [] vector = new int [N];
        int [] vector1 = new int [N];
        llenarVector ( vector, N);
        System.out.println(" ");
        llenarVector(vector1,N);
        System.out.println(" ");
        comparaVector(vector,vector1,N);
        
        
    }
    public static void llenarVector (int [] vector, int N){
        Random numeroRandom = new Random();
        for (int i = 0; i < N; i++) {
            vector[i]= numeroRandom.nextInt(10);
            System.out.print("[ "+ vector[i]+" ]");
        }
    }
    public static void comparaVector (int []vector, int[]vector1, int N){
        int cont;
        cont= 0;
        for (int i = 0; i < N; i++) {
            if (vector[i]==vector1[i]){
                cont++;
            }else
                break;
        }
        if (cont==N){
            System.out.println("Los vectores son iguales");
            
        }else
            System.out.println("Los vectres son distintos");
    }
}
