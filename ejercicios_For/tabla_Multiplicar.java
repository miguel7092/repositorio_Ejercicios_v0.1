package ejercicios_For;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class tabla_Multiplicar {
    public static void main (String[] args){
        Scanner digitar = new Scanner(System.in);
        System.out.println("Porfavor digite el número: ");
        int numero;
        numero = digitar.nextInt();
        for (int multiplicador = 1; multiplicador < 12; multiplicador++){
            System.out.println(numero + " * " + multiplicador + " = " + (numero * multiplicador) );
        }

    }
}
