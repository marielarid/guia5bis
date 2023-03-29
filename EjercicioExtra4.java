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
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] alumnos = new int [3][4];
        double [] notafinal = new double [3];
        llenarMatriz(alumnos);
        promedioNotas(alumnos,notafinal);
       // mostrarVector(notafinal);
        System.out.println(" ");
        notaVector(notafinal);
        
        
    }
     public static void llenarMatriz (int [][]matriz){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese las notas del alumno "+(i+1));
            for (int j = 0; j < 4; j++) {
              matriz[i][j]= leer.nextInt();
            }  
        }
    }
    public static void promedioNotas (int [][] matriz, double []vector){
        double suma;
        suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4 ; j++) {
                switch (j){
                    case 0:
                           suma = ( suma + matriz [i][j]* 0.10);
                           break;
                    case 1:
                           suma = ( suma + matriz [i][j]* 0.15);
                           break;
                    case 2:
                           suma = ( suma + matriz [i][j]* 0.25);
                           break;
                    case 3:
                           suma = ( suma + matriz [i][j]* 0.5);
                           break;
                           
                }      
            }
            vector[i]= suma;
            System.out.print(" [ "+ vector[i] +" ] ");
            suma=0;
        }
    }
   // public static void mostrarVector (double [] vector){
    //     for (int i=0; i>3; i++){
      //     System.out.println(" Las notas finales son:"); 
       //    System.out.print(" [ "+ vector[i] +" ] ");
      //   }
   // }
    public static void notaVector (double [] vector){
        int conta,contd;
        conta=0;
        contd=0;
        for (int i = 0; i < 3; i++) {
            if (vector[i]>=7){
                conta++;
            }else{
                contd++;
            }
            
        }
        System.out.println("La cantidad de alumnos aprobados es: " +conta);
        System.out.println("La cantidad de alumnos desaprobados es: " +contd);
    }
    
}
