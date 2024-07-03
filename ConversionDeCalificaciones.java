import java.util.Scanner;

public class ConversionDeCalificaciones {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int calificacion = 0;

        System.out.println();
        System.out.print("Ingrese una calificacion del 1 al 5:");    
        calificacion = myScanner.nextInt();
        System.out.println();


        switch (calificacion) {
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 2:
                System.out.println("Deficiente");
                break;
            case 3:
                System.out.println("Suficiente");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Valor ingresado fuera de rango");
                break;
        }





        System.out.println();

        myScanner.close();
    }
}
