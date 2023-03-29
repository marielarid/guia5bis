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
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = {"hola", "adios", "bien", "mal", "feliz"};
        char[][] matriz = new char[20][20];
        Random random = new Random();

        // Colocar las palabras en filas aleatorias
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            int fila = random.nextInt(20);
            int columna = random.nextInt(20 - palabra.length() + 1);
            for (int j = 0; j < palabra.length(); j++) {
                matriz[fila][columna + j] = palabra.charAt(j);
            }
        }

        // Completar la matriz con 0 y 9 aleatoriamente
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == '\u0000') { // si no hay una letra en la posición
                    int numAleatorio = random.nextInt(2); // generar un número aleatorio entre 0 y 1
                    if (numAleatorio == 0) {
                        matriz[i][j] = '0';
                    } else {
                        matriz[i][j] = '9';
                    }
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}

    
        

    

