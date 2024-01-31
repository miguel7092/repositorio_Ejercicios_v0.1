package Ejercicios;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class mitad_Triangulo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la altura de la mitad de la piramide porfavor: ");
        int altura = teclado.nextInt();
        //para las filas de la piramide
        for (int i = 1; i <= altura; i++){
            // para la cantidad de estrellas de la piramide
            for (int j = 1; j <= i; j++){
            System.out.print('*');
            }
            System.out.println();
        }
    }
}
