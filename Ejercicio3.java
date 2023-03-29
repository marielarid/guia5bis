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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();

        // Pedir el tamaño del vector
        System.out.print("Introduce el tamaño del vector: ");
        int N = leer.nextInt();

        // Crear el vector y rellenarlo con números aleatorios
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = aleatorio.nextInt(99999) + 1;
        }

        // Mostrar el vector
        System.out.print("El vector es: ");
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + "|");
        }
        System.out.println();

        // Contar cuántos números tienen 1, 2, 3, 4 o 5 dígitos
        int[] cont = new int[5];
        for (int i = 0; i < N; i++) {
            int numDigitos = 1;
            int num = vector[i];
            while (num >= 10) {
                num /= 10;
                numDigitos++;
            }
            cont[numDigitos - 1]++;
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números de 1 dígito: " + cont[0]);
        System.out.println("Cantidad de números de 2 dígitos: " + cont[1]);
        System.out.println("Cantidad de números de 3 dígitos: " + cont[2]);
        System.out.println("Cantidad de números de 4 dígitos: " + cont[3]);
        System.out.println("Cantidad de números de 5 dígitos: " + cont[4]);
    }
}
    
    

