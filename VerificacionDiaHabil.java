import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int dia;

        System.out.println();
        System.out.print("Ingrese un número entero del 1 al 7:");
        dia = myScanner.nextInt();
        System.out.println();

        // estantar
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("ss:Día Habil");
                break;
            case 6:
            case 7:
                System.out.println("ss:Día no habil");
                break;
            default:
                 System.out.println("ss:Numero ingresado incorrecto.");
                 break;
        }
        
        // expression

        switch (dia) {
            case 1, 2, 3, 4, 5 -> System.out.println("se: Día Habil");
            case 6, 7 -> System.out.println("se: Día no habil");
            default -> System.out.println("se: Numero ingresado incorrecto.");
        }

        System.out.println();

        myScanner.close();
    }
}
