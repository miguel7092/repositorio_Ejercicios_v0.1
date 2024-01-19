package ejercicicos_While;

import java.util.Scanner;

public class factorial_Numero_Entero {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int n;
        // Declaramos e inciamos una variable tipo long llamada factorial
        long fact = 1;
        System.out.println("Ingrese un número positivo");
        n = teclado.nextInt();
        // En esta parte colocamos en la condición cuando n sea mayor que 0
        while (n>0){
            // Se multiplica el valor de factorial por n y se le asigna a factorial
            fact = fact * n;
            // decrementamos el valor de n en 1
            /* se coloca el decremento ya que lo se quiere es que el
            numero del usuario decremente para que multiplique por
            el siguiente */
            n--;
        }
        System.out.println("El factorial es: " + fact);
        teclado.close();
            }
}
