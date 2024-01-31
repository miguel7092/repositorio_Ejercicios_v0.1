package operadores;

import java.util.Scanner;

public class operadores_Logicos {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Porfavor digite los dos numeros");
        int num1 = teclado.nextInt() , num2 = teclado.nextInt();
        boolean resultado;
        resultado = num1 >= num2 && true;
        System.out.println(resultado);
        resultado = false || false || false || false;
        System.out.println(resultado);
        resultado = ((5 * 15) <= 95 || true) && ((16 * 65) >= 102 && true);
        System.out.println(resultado);
        System.out.println(!true);
    }
}
