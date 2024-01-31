package Strings;

public class comparar_Cadenas {
    public static void main (String[] args){
        String palabra1 = "Hola";
        String palabra2 = "hola";
        boolean resultado;
        // podemos unir varios metodos para realizar la comparación
        resultado = palabra1.toUpperCase().equals(palabra2.toUpperCase());
        //en la siguiente linea de codigo nos va indicar que es diferente ya que contiene diferente cadena
        //resultado = palabra1.equals(palabra2);
        //Se puede realizar de una manera mas simplificada utilizando equalsIgnoreCase
        resultado = palabra1.equalsIgnoreCase(palabra2);
        System.out.println(resultado);
    }
}
