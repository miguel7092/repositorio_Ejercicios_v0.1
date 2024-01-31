package ejercicicos_While;

public class cantidad_De_Digitos {
    public static void main (String[] args){
        int numero = 1245554621;
        int contador = 0;
        while (numero > 0){
            // para realizar la operacion de cantidad de digitps debemos dividirlo entre 10
            numero = numero / 10;
            contador++;
        }
        System.out.println("La cantidad de digitos son: " + contador);
    }
}
