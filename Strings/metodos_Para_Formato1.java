package Strings;

import java.util.Scanner;

public class metodos_Para_Formato1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        String palabra1;
        System.out.println("Porfavor escriba la palabra deseada");
        palabra1 = teclado.next();
        System.out.println("La palabra que colocastes es: " + palabra1);
        float numdec = 1.14568f;
        // En este caso lo que se ah realizado es colocar los marcadoeres del metodo format
        // %s para string, %d para integer, %f para flotante
        //String mensaje = String.format("Mi nombre es: %s %s y el numero %.4f","miguel", "alburqueque",numdec);
        //System.out.println(mensaje);
        // podemos utilizar el printf donde es para imprimir de manera ordenada
        // el formato y luego los valores
        System.out.printf("Mi nombre es: %s %s y el numero %.4f", "Ryoma", "tsuguru",numdec);
    }
}
