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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][]matriz = new int [3][3];
        llenarMatriz(matriz);
        matrizMagica(matriz);
        
        
    }
    public static void llenarMatriz (int [][]matriz){
        Scanner leer = new Scanner(System.in);
        int num;
         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                   System.out.println("Ingrese los valores de la matriz"); 
                   num= leer.nextInt();
                   
                }while ((num<0) && (num>9));
                matriz[i][j]=num;
                //System.out.print(" [ "+ matriz[i] [j]+ " ]");
                
            }
            System.out.println(" ");   
            
        }
    }
    public static void matrizMagica (int [][] matriz){
        int sumaf,sumacol, cont;
        sumaf=0;
        sumacol=0;
        int [] columnas = new int[3];
        int [] filas= new int [3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               sumaf += matriz[i][j] ; 
                
            }
            //System.out.println("columna " +j+ "="+sumacol);
           // System.out.println("fila " +i+ " = "+ sumaf);
            filas[i]= sumaf;
            sumaf =0;
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumacol +=matriz[j][i];
            }
           // System.out.println("columna " +j+ " = "+ sumacol);
            columnas[j]=sumacol;
            sumacol =0;
        }
        int diag1,diag2;
        diag1=0;
        diag2=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (((i==j) && (i==0))||((i==2)&&(i==j))){
                   diag1  += matriz[i][j] ;
                        
                }else if ( (i==j)&&(i==1)){
                       diag1  += matriz[i][j] ;
                       diag2  += matriz[i][j]; 
                     }else if ((i==0)&&(j==2)){
                         diag2 +=  matriz[i][j]; 
                         
                     }else if ((i==2)&&(j==0)){
                         diag2 +=  matriz[i][j];
                     }
            }
        }
                
       
        System.out.println("la diagonal ppal es "+ diag1);
        System.out.println("la diagonal inversa es "+diag2);
        for (int i = 0; i < 3; i++) {
           System.out.println("fila " +i+ " = "+filas[i]); 
           System.out.println("columna " +i+ " = "+columnas[i] );
        }
            
            
        
    }
}