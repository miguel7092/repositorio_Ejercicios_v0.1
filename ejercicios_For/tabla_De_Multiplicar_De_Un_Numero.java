package ejercicios_For;

import java.util.Scanner;

public class tabla_De_Multiplicar_De_Un_Numero {
    public static void main (String[] args){
        Scanner digitar = new Scanner(System.in);
        System.out.print("Porfavor digite el numero que quiere multiplicar: ");
        int multiplicar = digitar.nextInt();
        System.out.println("El resultado seria de la siguiente manera");
        for (int multiplicador = 1;multiplicador<11;multiplicador++){
            int resultadomult = multiplicar * multiplicador;
            System.out.print(resultadomult);
            if (multiplicador<10){
                System.out.print("||");
            }
        }
    }
}
