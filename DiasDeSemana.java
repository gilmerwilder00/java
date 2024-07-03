import java.util.Scanner;

public class DiasDeSemana {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int dia=0;

        boolean validInput = false;
        
        // System.out.println();
        // System.out.print("Ingrese un número entero del 1 al 7:");    
        // dia = myScanner.nextInt();
        // System.out.println();

        while (!validInput) {
            System.out.print("Ingrese un número entero del 1 al 7:");
            if (myScanner.hasNextInt()) {
                dia = myScanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                myScanner.next(); // consumir y descartar la entrada no válida.
            }
        }
        

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

        System.out.println();

        myScanner.close();
    }    
}
