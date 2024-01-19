package ejercicicos_Do_While;

import java.util.Scanner;

public class mostrar_Los_5_Numeros {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;

        do {
            System.out.println("Por favor ingrese el número: ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador++;
        }
        while (contador < numeros.length);

        contador = 0;
        System.out.println("Los numeros que usted ingreso son: ");
        do {
            //acá lo que se va a realizar es mostrarme el listado de numeros
            System.out.println(numeros[contador]);
            contador++;
        }
        while (contador< numeros.length);
    }
}
