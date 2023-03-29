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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int [] vector = new int[N];
        llenarVector(vector,N);
        sumaVector(vector,N);
    }
    public static void llenarVector (int [] vector, int N){
        Random numeroRandom = new Random();
        for (int i = 0; i < N; i++) {
            vector[i]= numeroRandom.nextInt(10);
            System.out.print("[ "+ vector[i]+" ]");
        }
    }
    public static void sumaVector ( int []vector, int N){
        int suma;
        suma = 0;
        for (int i = 0; i < N; i++) {
            suma += vector[i];
            
        }
        System.out.println("La suma del vector es : "+suma);
    }
}
