package ejercicios_If_Else;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class semaforo_De_Transito {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        String luzRoja = "Luz Roja";
        String luzVerde = "Luz verde";
        String luzAmarilla = "Luz Amarilla";
        String eleccionUsuario;
        System.out.println("Porfavor escriba luz roja, luz verde o luz amarilla --> ");
        eleccionUsuario = teclado.nextLine();
        if(luzRoja.equalsIgnoreCase(eleccionUsuario)){
            System.out.println("No puede pasar");
        }
        else if (luzVerde.equalsIgnoreCase(eleccionUsuario)){
            System.out.println("Puede pasar");
        }
        else if (luzAmarilla.equalsIgnoreCase(eleccionUsuario)) {
            System.out.println("No puede pasar parcialmente");
        }
        else {
            System.out.println("no eligio bien");
        }
    }
}
