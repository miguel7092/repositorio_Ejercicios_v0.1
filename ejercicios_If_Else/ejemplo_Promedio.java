// el promedio minimo para aprobar es 7
// el promedio es diez muchas felicidades
// si el promedio es aprobatorio pero menor a 10 = felicidades
// si el promedio no es aprobatorio = es necesario repasar bloques

package ejercicios_If_Else;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class ejemplo_Promedio {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int nota_Usuario;
        System.out.println("Porfavor ingrese la nota ---> ");
        nota_Usuario = teclado.nextInt();
        if (nota_Usuario == 7){
            System.out.println("felicidades aprobastes");
        }
        else if (nota_Usuario == 10) {
            System.out.println("Muchas felicidades");
        }
        else if (nota_Usuario >7 && nota_Usuario<10){
            System.out.println("felicidades");
        }
        else if (nota_Usuario < 7 ){
            System.out.println("es necesario repasar bloques");
        }
        else {
            System.out.println("invalido");
        }
    }
}
