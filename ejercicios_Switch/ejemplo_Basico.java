package ejercicios_Switch;

public class ejemplo_Basico {
    public static void main (String[] args){
        String fruta = "papay";

        switch (fruta){
            case "mango":
            System.out.println("Fruta muy dulce");
            break;
            case "fresa":
            System.out.println("Fruta casi dulce");
            break;
            case "papaya":
            System.out.println("Fruta dulce");
            break;
            default:
            System.out.println("Palabra mal escrita");
        }
    }
}
