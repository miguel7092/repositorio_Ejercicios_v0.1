package ejercicios_For;

public class numeros_Pares {
    public static void main (String[] args){

        for (int num = 1; num < 101; num++){
            // para realizar el ejercicio y saber si es par o impar debemos realizar la operación de modulo.
            if (num % 2 == 0){
                System.out.println("este numero es par: " + num);
            }
        }
    }
}
