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
public class Ejercicioextra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese hasta que sucesion quiere imprimir");
        
        int N = leer.nextInt();
        
        Sucesion(N);
    }
     
    public static void Sucesion (int N){
            
        int vector [] = new int [N];
        
        for (int i = 0; i < N; i++) {
            if (i<2) {
                vector[i] = 1;
                
            }else
                vector[i] = vector[i-1]+ vector[i-2];
        }
        
        System.out.println("La sucesion de fibonacci");
        
        for ( int i = 0; i < N; i++) {
            
            System.out.print(" " + vector[i] + " ");
        }
    }
    
}
