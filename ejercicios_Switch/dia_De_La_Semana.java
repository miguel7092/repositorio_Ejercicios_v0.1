package ejercicios_Switch;

public class dia_De_La_Semana {
    public static void main(String[] args){
        String tipoDia = "";
        String diaSemana = "sabado";

        switch (diaSemana.toLowerCase()){
            case "lunes":
            case "martes":
            case "miercoles":
                tipoDia = "inicio de semana";
                break;
            case "jueves":
                tipoDia = "mediados de semana";
                break;
            case "viernes":
                tipoDia = "empieza el fin de semana";
                break;
            case "sabado":
            case "domingo":
                tipoDia = "fin de semana";
                break;
        }
            System.out.println(diaSemana + " es " + tipoDia);
    }
}
