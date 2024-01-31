package Strings;

import java.beans.PropertyEditorSupport;

public class metodos_Para_Cadena1 {
    public static void main (String[] args){
        String palabra1 = "Miguel Angel";
        String palabra2 = "Utiliza el movil";
        // Para averiguar que letra contiene la palabra
        // primero creamos la variable primer_Character
        char primer_Character;
        //int resultado;
        //String resultado;
        boolean resultado;
        //resultado = palabra1.length();
        // recordar que para utilizar endsWith, starWidth y contains
        // debemos utilizar la variable en booleano
        //resultado = palabra1.endsWith("Angel");
        //Para ver en que primera posicion se encuentra
        //la palabra movil usamos el metodo indexOf
        //resultado = palabra2.indexOf("movil");
        // para ver la letra en la posicion que se encuentra
        // utilizamos el metodo charAt
        // OJO QUE LA VARIABLE QUE LO CONTIENE TIENE QUE SE CHAR.
        primer_Character = palabra1.charAt(2);
        // Metodo contains se usa para si de verda lo contiene o no
        // es por eso que la variable tiene que se booleano.
        resultado = palabra2.contains("movil");
        System.out.println(resultado);
        System.out.println(primer_Character);
    }
}
