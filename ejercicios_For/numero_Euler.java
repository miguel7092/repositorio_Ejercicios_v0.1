package ejercicios_For;

public class numero_Euler {
    public static void main(String[] args){
        int numTerminos = 5;
        double e = 1.0;
        // para iniciar en el primer termino
        double factorial = 1.0;
        for (int i=1; i < numTerminos; i++){
            //calculamos el factorial
            factorial *=i;
            e += 1.0 / factorial;
        }
        System.out.println("valor aproximado de e con " + numTerminos + "terminos: " + e);
    }
}
