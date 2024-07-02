import java.util.Scanner;

public class DiasDeSemana {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero del 1 al 7:");
        int dia = myScanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El día de la semana es lunes");
                break;
            case 2:
                System.out.println("El día de la semana es martes");
                break;
            case 3:
                System.out.println("El día de la semana es miercoles");
                break;
            case 4:
                System.out.println("El día de la semana es jueves");
                break;
            case 5:
                System.out.println("El día de la semana es viernes");
                break;
            case 6:
                System.out.println("El día de la semana es sabado");
                break;
            case 7:
                System.out.println("El día de la semana es domingo");
                break;
            default:
                System.out.println("Numero ingresado incorrecto.");
                break;
        }

        myScanner.close();
    }    
}
