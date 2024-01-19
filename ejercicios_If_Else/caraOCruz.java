package ejercicios_If_Else;

import java.util.Random;
import java.util.Scanner;

public class caraOCruz {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba cara o sello: ");
        String moneda = teclado.nextLine();
        // Metodo para generar un resultado aleatorio
        Random resultado = new Random();
        // se crea una variable aleatorio
        int resultado_Moneda = resultado.nextInt(2);
        // En la condicional if colocamos !moneda donde quiere decir en el caso
        if (!moneda.equalsIgnoreCase("cara") && !moneda.equalsIgnoreCase("sello")){
            System.out.println("por favor escriba correctamente cara o sello");
            return;
        }
        // Se utiliza el operador ternario donde cero es cara y 1 es sello
        System.out.println("Resultado:" + (resultado_Moneda == 0 ? "cara": "sello"));
        if (moneda.equalsIgnoreCase("cara") && resultado_Moneda == 0 ||
                moneda.equalsIgnoreCase("sello") && resultado_Moneda == 1){
            System.out.println("Acertaste");
        }
        else {
            System.out.println("No Acertaste");

        }

    }
}
