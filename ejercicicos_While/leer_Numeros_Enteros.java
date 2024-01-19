package ejercicicos_While;

import java.util.Scanner;

public class leer_Numeros_Enteros {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número entero (0 para terminar): ");
        numero = teclado.nextInt();
        /* Iniciamos un ciclo while que se repite mientras
         el numero sea diferente de cero */
        while (numero !=0){
            // le mostramos el numero
            System.out.println("El número ingresado es: " + numero);
            System.out.println("Ingrese otro número entero (0 para termina): ");
            numero = teclado.nextInt();
        }
        // cuando sea cero termina el programa.
        System.out.println("Fin del programa.");
        teclado.close();
    }
}
