package Strings;

public class metodos_Para_Formato {
    public static void main(String[] args){
        String palabra1 = " Estamos aqui ";
        // Para colocar en mayuscula el contenido de la variable palabra1
        // utilizamos el metodo toUpperCase
        String nuevapalabra1 = palabra1.toUpperCase();
        System.out.println(nuevapalabra1.trim());
        // Para colocar en minuscula el contenido de la variable palabra1
        // Utilizamos el metodo toLowerCase
        String nuevapalabra2 = palabra1.toLowerCase();
        System.out.println(nuevapalabra2.trim());
        // si lo que se quiere es eliminar espacios innecesarios
        // Utilizamos el metodo Trim.
        System.out.println(palabra1.trim());
    }
}
