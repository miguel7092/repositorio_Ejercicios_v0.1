package ejercicios_If_Else;

import java.util.Scanner;

public class par_O_Impar {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Coloque el numero para conocer si es par o impar --> ");
        int numero1 = teclado.nextInt();
        int resto = numero1 % 2;
        if (resto == 0){
            System.out.println("es par");
        }
        else{
            System.out.println("No es par");
        }
    }
}
