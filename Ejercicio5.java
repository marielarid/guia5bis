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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int [][]matriz1 = new int [3][3];
        llenarMatriz (matriz);
        llenarMatriz (matriz1);
        mostrarMatriz(matriz);
        System.out.println(" ");
        mostrarMatriz(matriz1);
        trasponerMatriz(matriz,matriz1);
        
    }
     public static void llenarMatriz (int [][]matriz){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de la matriz"); 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= leer.nextInt();
                //System.out.print(" [ "+ matriz[i] [j]+ " ]");
                
            }
            System.out.println(" ");   
            
        }
    }
     public static void trasponerMatriz( int [][] matriz, int[][] matriz1){
        int cont =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if (matriz1 [i][j] != (- matriz [j][i])){
                   cont ++;
               }else if  ((matriz1 [i][j])==0){
                        if ((matriz1 [i][j])== (matriz [j][i])){
                             cont++;
                        }
               }     
                
            }
        }
        System.out.println(+cont);
        if (cont==9){
            System.out.println("La matrices son antisimétricas");
        }else{
            System.out.println("las matrices no son antisimétricas");
        }
    }
     public static void mostrarMatriz (int [][]matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ "+ matriz[i] [j]+ " ]");
                
            }
            System.out.println("  ");    
            
        }
    } 
}
