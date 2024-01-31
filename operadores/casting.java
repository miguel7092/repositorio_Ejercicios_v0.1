package operadores;

public class casting {
    public static void main(String[] args){
        int variablex = 50, variabley = 60;
        // Se realiza dos maneras con int y con float
        // Se pone la f al final cuando el dato es de tipo float
        float variablez = 5.5f;
        // int resultado;
        float resultado;
        // para convertir la variablez en numero entero ya que con float no
        // nos va permitir hacer la operacion debemos agregar un entre parentesis
        // al lado izquierdo de la variable que debemos convertir
        //resultado = variablex + (int)variablez;
        resultado = (float)variablex + variablez;
        System.out.println(resultado);
    }
}
