package ejercicios_For;

import java.util.Scanner;

public class ejemplo_Random {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println("Escriba un número");
            numeros[contador] = teclado.nextInt();
        }
        // Imprimir los números separados por guiones
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print(numeros[contador]);

            // Agregar guión solo si no es el último número
            if (contador < numeros.length - 1) {
                System.out.print("-");
            }
        }
    }
}
