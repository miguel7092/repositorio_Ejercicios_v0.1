package Ejercicios;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int altura;
        altura = teclado.nextInt();
        // Primero hacemos para la cantidad de filas hacia la derecha
        for (int i = 1; i <= altura; i++){
            // Luego hacemos para la cantidad de filas hacia la izquierda
            // imprimir espacios en blancos
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }// imprimir los asteriscos
            for (int k =1; k<= 2 * i - 1;k++){
                // imprimir asteriscos
                System.out.print("*");
                }
                // cambiar de línea
                System.out.println();
            }
        }
    }

