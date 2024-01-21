package ejercicicos_Do_While;

public class ejercio_Basico_1_Al_10 {
    public static void main (String[] args){
        int[] numeros = new int[10];
        int contador = 1;
        do {
            /* En esta parte lo que se realizo es el operador ternario
            como sabemos que do es un bucle que depende de la condición
            lo que se va hacer es colocar primero el contador luego para colocar la coma seguida
            hacemos el operador ternario donde compararemos contador en cada vuelta si 1 es igual a 10
            como es falso colocara seguido una coma y asi sucesivamente en caso que sea verdadero ya
            de el salto donde sera 10 igual 10*/
            System.out.print(contador + (contador == numeros.length ? "\n" : "," ));
            contador++;
        }
        // colocamos numeros que es la cantidad del array y length es la cantidad que hay
        while (contador <= numeros.length);
            }
}
