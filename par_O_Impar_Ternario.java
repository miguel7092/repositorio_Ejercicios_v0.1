import java.util.Scanner;

public class par_O_Impar_Ternario {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Coloque el numero por favor");
        int numero = teclado.nextInt();
        String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(resultado);
    }
}
