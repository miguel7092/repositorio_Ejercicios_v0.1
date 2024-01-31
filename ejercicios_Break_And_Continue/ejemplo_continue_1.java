package ejercicios_Break_And_Continue;

public class ejemplo_continue_1 {
    public static void main (String[] args){
        for (int numero = 1; numero < 15 ; numero++){
            if (numero==11){
                // lo que hace continue es saltar la condición obviando el bloque de código
                continue;
            }
            System.out.println(numero);
        }

    }
}
