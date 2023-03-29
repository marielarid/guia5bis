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
public class Ejercicio4bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [4][4];
        int [][] traspuesta = new int [4][4];
        llenarMatriz (matriz);
        mostrarMatriz(matriz);
        trasponerMatriz(matriz, traspuesta);
        System.out.println(" ");
        mostrarMatriz (traspuesta);
        
    }
    public static void llenarMatriz (int [][]matriz){
        Random numeroRandom =new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i] [j]= numeroRandom.nextInt(10);
                //System.out.print(" [ "+ matriz[i] [j]+ " ]");
                
            }
            // System.out.println(" ");   
            
        }
    }
    public static void mostrarMatriz (int [][]matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" [ "+ matriz[i] [j]+ " ]");
                
            }
            System.out.println("  ");    
            
        }
    }
    public static void trasponerMatriz( int [][] matriz, int[][] traspuesta){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta [i][j]= matriz [j][i];
                
            }
        }
    }
}
