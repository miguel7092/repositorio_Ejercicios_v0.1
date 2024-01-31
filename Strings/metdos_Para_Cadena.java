package Strings;

import java.beans.PropertyEditorSupport;

public class metdos_Para_Cadena {
    public static void main (String[] args){
        String menu = "Este es el pais de peru";
        int resultado;
        // la clase de string invoca al metodo length
        resultado = menu.length();
        System.out.println(resultado);
        // En el caso de que se saber si contiene la letra o palabra
        // se debe usar el metodo contains
        boolean observarContenido;
        System.out.println("Aca se obserba que si o no contiene la palabra o letra");
        observarContenido = menu.contains("a");
        System.out.println(observarContenido);
        boolean empieza_Con;
        boolean termina_Con;
        // El metodo startsWitch nos va indicar si en verdad empieza con la palabra que hemos colocado
        empieza_Con = menu.startsWith("Este");
        // El metodo endsWith nos va a indica si en verdad termina con la palabra que hemos colocado
        System.out.println("Empieza con: " + empieza_Con);
        termina_Con = menu.endsWith("peru");
        System.out.println("Termina con: " + termina_Con);
        String palabra;
        // con concat podemos unir dos strings
        palabra = menu.concat(", deberias visitarlo");
        System.out.println(palabra);
    }
}
