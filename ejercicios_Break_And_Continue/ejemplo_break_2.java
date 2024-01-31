package ejercicios_Break_And_Continue;

import java.util.Calendar;

public class ejemplo_break_2 {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        // Para obtener el tiempo en milisegundos
        int dia = cal.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i <= 7; i++){
            if (dia == i){
                //System.out.println("Hoy es el " + i + "° día de la semana.");
                //break;
                // con colocar solo continue obvia el bloque de codigo
                continue;
            }
            System.out.println("Día " + i);
        }
        System.out.println("Seguimos...");
    }


}
