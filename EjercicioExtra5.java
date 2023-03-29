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
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de filas y columnas de la matriz");
        int N = leer.nextInt();
        int M = leer.nextInt();
        int [][] matriz = new int [N][M];
        llenarMatriz(matriz,N,M);
        
    }
    public static void llenarMatriz (int [][]matriz, int N, int M){
        Random numeroRandom =new Random();
        int suma=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i] [j]= numeroRandom.nextInt(10);
                System.out.print(" [ "+ matriz[i] [j]+ " ]");
                suma += matriz[i][j];
            }
            System.out.println(" ");   
            
        }
        System.out.println(" La suma de los números de la matriz es : "+ suma);
    }
}
