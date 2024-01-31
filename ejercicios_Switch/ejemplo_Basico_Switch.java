package ejercicios_Switch;

public class ejemplo_Basico_Switch {
    public static void main (String[] args){
    // hay que recordar que el uso de los break es importante
    // ya que si no hubiera en uno se repite la otra linea de codigo
        char nota = 'B';
        switch (nota){
            case 'A':
                System.out.println("En hora Buena");
                break;
            case 'B':
            case 'C':
                System.out.println("Estas en buen camino");
                break;
            case 'D':
                System.out.println("Sigue asi casi lo logras");
                break;
            case 'E':
                System.out.println("Casi lo logras");
                break;
            case 'F':
                System.out.println("Debes repasar para lograr esa nota");
                break;
            default:
            System.out.println("No es lo deseado");
        }
    }
}
