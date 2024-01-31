package ejercicios_For;

import java.util.Scanner;

public class ejercicio_Basico_1_Al_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escriba un número");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("el resultado de los numeros seria: ");
        // Imprimir los números separados por guiones, sin guión al final
        // en esta parte la condicional colocamos - 1 en el tamaño del vector
        // ya que selecciona el ultimo indice del array
        // es decir de cero hasta numeros.length - 1
        for (int i = 0; i < numeros.length - 1; i++) {
            System.out.print(numeros[i] + "-");
        }

        // Esto se hace para asegurarse de que el array
        // no esté vacío antes de intentar acceder al último elemento.
        if (numeros.length > 0) {
            // Imprimir el último número sin guión al final
            // Imprime el valor del último elemento del array numeros sin agregar un guión al final
            // numeros.length - 1 se utiliza para acceder al índice del último elemento del array,
            // ya que los índices van desde 0 hasta numeros.length - 1.
            // si nos damos cuenta el ultimo guion no se considero pero si se considera
            System.out.print(numeros[numeros.length - 1]);
        }
    }
}
