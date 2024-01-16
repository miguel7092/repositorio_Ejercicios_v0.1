package ejercicios_If_Else;

import java.util.Scanner;

public class anio_Bisiesto {
    public static void  main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el día: ");
        int dia = teclado.nextInt();
        System.out.println("Introduce el mes por favor: ");
        int mes = teclado.nextInt();
        System.out.println("Introduce el anio por favor: ");
        int anio = teclado.nextInt();

        teclado.close();

        boolean esBisiesto;

        if (anio % 4 == 0){ // si es divisible por 4
            if (anio % 100 == 0){ // excepto por 100
                if (anio % 400 == 0){ // a menos que sea por 400
                    esBisiesto = true;
                }
                else{
                    esBisiesto = false;
                }
            }
            else{
                esBisiesto = true;
            }
        }
        else{
            esBisiesto = false;
        }

        System.out.println("La fecha que has introducido es: " + dia + "/" + mes + "/" + anio);
        if (esBisiesto){
            System.out.println("El año " + anio + " es bisiesto");
        }
        else {
            System.out.println(("El año " + anio + " No es bisiesto"));
        }
    }
}
