package ejercicicos_While;

import java.util.Scanner;

public class mostrar_Los_5_Numeros {
    public static void main (String[] args){
        Scanner teclado = new  Scanner(System.in);
        //En esta parte se crea el arreglo para 5
        int[] numeros = new int[5];
        // se crea un contador desde cero
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Escriba el numero porfavor");
            int numero = teclado.nextInt();
            // numeros es un arreglo de 5 donde lo identifica con el numero que coloque el usuario
            numeros[contador] = numero;
            contador++;
        }
        contador=0;
        while(contador <= 5){
            System.out.println(numeros[contador]);
            contador++;
        }
        }
    }

