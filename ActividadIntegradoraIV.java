import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadIntegradoraIV {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // calculoDeFactorial(myScanner);
        // fibonacciMejorada(myScanner);
        // primosPlus(myScanner);
        dibujandoCuadrados(myScanner);

        myScanner.close();
    }

    private static void calculoDeFactorial(Scanner myScanner) {
        int number, factorial;
        int i = 0;

        System.out.println();
        System.out.println("Actividad: Cálculo de factorial");
        System.out.println();

        try {
            System.out.print("Ingresar un número entero para calcular su factorial:");
            number = myScanner.nextInt();
            System.out.println();

            if (number < 0) {
                System.out.println();
                System.out.println("Ingresa un número entero positivo.");
                System.out.println();
               
            } else {
                factorial = 1;

                if (number > 1) {

                    i = 2;

                    do {
                        factorial = factorial * (i);
                        i++;
                    } while (i <= number);

                }

                System.out.println();
                System.out.println(" El factorial de " + number + " es igual a: " + factorial);
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: Ingrese un numero entero.");
            System.out.println();
        }

    }

    private static void fibonacciMejorada(Scanner myScanner) {
        int posición;
        long fiboNumber = 0;

        System.out.println();
        System.out.println("Actividad: serie fibonaccie mejorada.");
        System.out.println();

        try {
            System.out.print("Ingresa la posición de un número en la serie fibonacci que deseas saber:");

            posición = myScanner.nextInt();

            if (posición >= 0) {

                if (posición == 0) {
                    fiboNumber = 0;
                }

                if (posición == 1) {
                    fiboNumber = 1;
                }

                if (posición > 1) {

                    long[] fibonacci = new long[posición + 1];

                    fibonacci[0] = 0;
                    fibonacci[1] = 1;

                    for (int i = 2; i <= posición; i++) {
                        fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
                    }

                    fiboNumber = fibonacci[posición];
                }

                System.out.println();
                System.out.println(
                        "El numero en la posición " + posición + " de la serie fibonacci es: " + fiboNumber);
                System.out.println();

            } else {
                System.out.println();
                System.out.println("Debes ingresar un número entero mayor a 0");
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: debes ingresar un numero entero.");
            System.out.println();
        }
    }

    private static void primosPlus(Scanner myScanner) {
        int cantidadPrimos;

        System.out.println();
        System.out.println("Actividad: primos plus.");
        System.out.println();

        try {
            System.out.print("Ingresa un número entero:");
            cantidadPrimos = myScanner.nextInt();

            int[] arregloPrimos = generarPrimos(cantidadPrimos);

            System.out.println("Los primeros " + cantidadPrimos + " números primos son:");
            for (int primo : arregloPrimos) {
                System.out.print(primo + " ");
            }

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: ingresa un número entero.");
            System.out.println();
        }

    }

    private static int[] generarPrimos(int cantidadDeseada) {

        int[] arregloPrimos = new int[cantidadDeseada];

        int cantidadPrimos = 0; // variable para controlar la cantidad de primos que se van completando
        int numero = 2; // variable para constrolar si es un numero primo

        while (cantidadPrimos < cantidadDeseada) {
            // se valida si el numero actual es primo
            if (esPrimo(numero)) {
                // si es primo entonces se incrementa la cantidad de primos
                cantidadPrimos++;
                // y se almacena en el arreglo
                arregloPrimos[cantidadPrimos - 1] = numero;
            }
            numero++;
        }

        return arregloPrimos; // se retorna el arreglo de primos
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        if (numero == 2)
            return true; // 2 es el único número par primo
        if (numero % 2 == 0)
            return false; // se ignora números pares

        // solo verifica hasta la raíz cuadrada del número
        int raizCuadrada = (int) Math.sqrt(numero);          

        for (int i = 3; i <= raizCuadrada; i += 2) { // ignora pares, solo considera 3,5,7,9 ....
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void dibujandoCuadrados(Scanner myScanner) {
        int number;

        System.out.println();
        System.out.println("Actividad: dibujando cuadrados.");
        System.out.println();

        try {
            System.out.print("Ingresa un número entero:");
            number = myScanner.nextInt();

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: ingresa un número entero.");
            System.out.println();
        }

    }
}
