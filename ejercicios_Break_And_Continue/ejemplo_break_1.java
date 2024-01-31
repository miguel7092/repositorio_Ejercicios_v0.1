package ejercicios_Break_And_Continue;

public class ejemplo_break_1 {
    public static void main (String[] args){
        for (int i=1; i <= 5; i++){
            System.out.print("el ciclo " + i +" tienes estos numeros: " );
            for (int j=1; j < 100; j++){
                if (j==15){
                    // cuando colocamos break en esta parte lo que quiere decir es que termina el ciclo
                    break;
                }
                // en el bloque de if colocamos la linea de texto de salida horizontal
                // colocamos el iterativo con un texto en espacio
                System.out.print( j + " ");
            }
            // colocamos para
            System.out.println();
        }
        System.out.println("ciclo terminado");
    }
}
