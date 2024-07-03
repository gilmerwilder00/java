import java.util.Scanner;

public class SeleccionDeOpcion {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int opcion;
        
        System.out.println();
        System.out.println("-Opción 1: Guardar");
        System.out.println("-Opción 2: Cargar");
        System.out.println("-Opción 3: Salir");
        System.out.println();
        System.out.print("Ingrese un número entero del 1 al 3 para seleccionar una opción:");

        opcion = myScanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Guardar");
            case 2 -> System.out.println("Cargar");
            case 3 -> System.out.println("Salir");
            default ->System.out.println("Opción invalida");
        }


        System.out.println();
        myScanner.close();
    }
}
