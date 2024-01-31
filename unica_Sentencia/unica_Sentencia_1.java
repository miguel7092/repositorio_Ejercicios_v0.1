package unica_Sentencia;

public class unica_Sentencia_1 {
    public static void main (String[] args){
        int numero = 16;
        // En este caso lo que se va observa es que podemos colocarlo sin llaves el bloque de codigo
        // si nos damos cuento el codigo ejecuta siempre y cuando tenga una linea el bloque de codigo
        if (numero > 15)
            System.out.println("Excedente");
        else if (numero >= 12 && numero <= 15)
            System.out.println("sobrepasa un poco");
        else
            System.out.println("es un minimo de permitido");
    }
}
