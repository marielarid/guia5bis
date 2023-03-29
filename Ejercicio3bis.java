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
public class Ejercicio3bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números de vector");
        int cantidad= leer.nextInt();
        int [] digitos = new int[cantidad];
        llenarVector(digitos, cantidad);
        cantidadDigitos(digitos,cantidad);
        
    }
    public static void llenarVector(int [] digitos, int cantidad){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los "+cantidad+ " del vector");  
        for (int i=0; i<cantidad; i++){
          digitos[i]= leer.nextInt();
        }
    }
    public static void cantidadDigitos (int []digitos, int cantidad){
        int[] cont = new int[5];
        for (int i = 0; i < cantidad; i++) {
            int numDigitos = 1;
            int num = digitos[i];
            while (num >= 10) {
                num /= 10;
                numDigitos++;
            }
            cont[numDigitos - 1]++;
        }
       System.out.println("Hay "+ cont[0]+" números de 1 dígito");      
       System.out.println("Hay "+ cont[1]+" números de 2 dígito");         
       System.out.println("Hay "+ cont[2]+" números de 3 dígito");             
       System.out.println("Hay "+ cont[3]+" números de 4 dígito");         
       System.out.println("Hay "+ cont[4]+" números de 5 dígito");      
           
            
        
    }
}
