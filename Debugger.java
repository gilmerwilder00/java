import java.util.Scanner;

public class Debugger {

    // Variable global
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        actividad1();

        // actividad2();

    }

    public static void actividad1() {
        int[] numeros = { 1, 2, 3, 4 };
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
    }

    // Métodos Actividad 2
    public static void actividad2() {
        Integer option = null;

        do {
            option = pedirOpcion(); // devuelve una opcion válida - menu
            if (option != 5) {
                int number1 = pedirNumero();
                int number2 = pedirNumero();

                double result = realizarOperacion(option, number1, number2);
                System.out.println("El resultado de la operacion es: " + result);
                System.out.println();

            }
        } while (option != 5); // repetir cuando la opcion sea diferente a salir (5);

    }

    public static int pedirOpcion() { // menu
        Integer option = null;
        boolean validOption = false;

        System.out.println();
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.print("Por favor ingrese un número para seleccionar una opción:");

        do {
            try {
                option = myScanner.nextInt();

                validOption = (option >= 1 && option <= 5);

                if (!validOption) {
                    System.out.print("Ingrese una opcion válida:");
                }

            } catch (Exception e) {
                myScanner.nextLine();
                System.out.print("No ingresó un número, intente nuevamente:");
            }

        } while (option == null || validOption == false);

        return option;
    }

    public static int pedirNumero() {
        Integer numero = null;
        System.out.print("Por favor ingrese un número:");

        do {
            try {
                numero = myScanner.nextInt();
            } catch (Exception e) {
                myScanner.nextLine();
                System.out.print("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);

        return numero;
    }

    public static double realizarOperacion(int option, int number1, int number2) {
        int result = 0 ;

        result = switch (option) {
            case 1 ->  number1 + number2;
            case 2 ->  number1 - number2;
            case 3 ->  number1 *  number2;
            case 4 -> { 

                int division = 0;

                try {
                    division =  number1 / number2;
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println();
                }

                System.out.println("Hola 11111");

                yield division;
            }
            default -> 0;
        };


        return result;
    }
}
