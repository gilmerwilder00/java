import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Actividad 1
        divisionSegura(myScanner);

        // Actividad 2
        restaConManejoDeExcepciones(myScanner);

        // Actividad 3
        conversionCadenaAEntero(myScanner);

        myScanner.close();
    }

    private static void divisionSegura(Scanner myScanner) {
        int numero1;
        int numero2;
        int resultado;

        System.out.println();
        System.out.println("Actividad 1: División segura");

        try {
            System.out.println();
            System.out.print("Ingrese un número (n1):");
            numero1 = myScanner.nextInt(); // posible excepcion
            System.out.print("Ingrese otro número (n2):");
            numero2 = myScanner.nextInt();// posible excepcion

            resultado = numero1 / numero2; // causar un posible

            System.out.println();
            System.out.println("El resultado de dividir n1/n2 es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Debes ingresar datos enteros.");

        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("Error: no es posible realizar división por 0.");
            System.out.println();
            System.out.println(e);

        } catch (Exception e) {
            System.out.println();
            System.out.println("Upps. Error");
            System.out.println(e);
            // e.printStackTrace();
            // System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Despues de excepción.");
    }

    private static void restaConManejoDeExcepciones(Scanner myScanner) {
        int numero1;
        int numero2;
        int resta;

        System.out.println();
        System.out.println("Actividad 2: Resta con Manejo de Excepciones");

        try {
            System.out.println();
            System.out.print("Ingrese un número (n1):");
            numero1 = myScanner.nextInt(); // posible excepcion
            System.out.print("Ingrese otro número (n2):");
            numero2 = myScanner.nextInt();// posible excepcion
            myScanner.nextLine();

            resta = numero1 - numero2;

            System.out.println();
            System.out.println("El resultado de restas n1 - n2 es: " + resta);

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: debes ingresar numeros enteros.");
        } catch (Exception e) {
            System.out.println();
            System.out.println("Upps. Error");
            System.out.println(e);
        }

        System.out.println();
    }

    private static void conversionCadenaAEntero(Scanner myScanner) {

        String cadena;
        int numero;

        System.out.println();
        System.out.println("Actividad 3: Convertir cadena a entero");

        try {
            System.out.print("Ingresa una cadena que represente un número entero: ");
            cadena = myScanner.nextLine();

            numero = Integer.parseInt(cadena); // puede causar una excepcion
            System.out.println("El número ingresado es: " + numero);

        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Error: La cadena ingresada no se puede convertir un número entero.");
        } catch (Exception e) {
            System.out.println();
            System.out.println("Upps. Error");
            System.out.println(e);
        }

        System.out.println();
    }

}
