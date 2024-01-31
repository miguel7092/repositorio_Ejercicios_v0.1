package ejercicios_Switch;

public class dia_De_La_Semana_1 {
    public static void main (String[] args){
        String dia_De_La_Semana = "lunes";
        switch (dia_De_La_Semana.toLowerCase()){
            case "lunes":
                System.out.println("Inicio de semana");
                break;
            case "martes":
            case "miercoles":
            case "jueves":
                System.out.println("Mediados de semana");
                break;
            case "viernes":
                System.out.println("Comienzo del fin de semana");
                break;
            case "sabado":
                System.out.println("Fin de semana");
                break;
            case "domingo":
            default:
                System.out.println("porfavor escriba correctamente la palabra del dia de la semana en vez de: " + dia_De_La_Semana);
        }

    }
}
