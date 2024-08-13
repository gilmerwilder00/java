import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos3 {
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Actividad 1: fibonacci recursivo;
        // fibonacciMejorada();

        // Actividad 2: Factorial recursivo
        // calculoDeFactorial();

        // Actividad 3: Números primos recursivo
        // numerosPrimos();

        // Ejercicio complementario
        adivinarPalabra();
    }

    // Métodos de actividad
    // 1-----------------------------------------------------------------
    public static void fibonacciMejorada() {
        int position;
        long fiboNumber = 0;

        System.out.println();
        System.out.println("Actividad: serie fibonacci mejorada.");
        System.out.println();

        try {
            System.out.print("Ingresa la posición de un número en la serie fibonacci que deseas saber:");

            position = myScanner.nextInt();

            if (position >= 0) {

                // fiboNumber = fibonacci(position);
                fiboNumber = fibonacciRecursivo(position);

                System.out.println();
                System.out.println(
                        "El numero en la posición " + position + " de la serie fibonacci es: " + fiboNumber);
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

    // fibonacci utilizando bucle FOR
    public static long fibonacci(int position) {
        long fiboNumber = 0; // valor en posicion 0

        if (position == 1) {
            fiboNumber = 1;
        }

        if (position > 1) {

            long[] fibonacci = new long[position + 1];

            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i <= position; i++) {
                fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            }

            fiboNumber = fibonacci[position];
        }

        return fiboNumber;
    }

    // fibonacci utilizando recursividad
    public static long fibonacciRecursivo(int position) {
        
        if (position == 0) {
            return 0;
        }

        if (position == 1) {
            return 1;
        }

        return fibonacciRecursivo(position - 2) + fibonacciRecursivo(position - 1);
    }

    // Métodos de actividad
    // 2-----------------------------------------------------------------

    private static void calculoDeFactorial() {
        int number, factorial;

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
                // factorial = obtenerFactorial(number);
                factorial = obtenerFactorialRecursivo(number);

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

    // Cálculo de factorial usando bucle DO-WHILE
    public static int obtenerFactorial(int number) {
        int factorial = 1;
        int i = 0;

        if (number > 1) {

            i = 2;

            do {
                factorial = factorial * (i);
                i++;
            } while (i <= number);
        }

        return factorial;
    }

    // Cálculo de factorial usando recursividad
    public static int obtenerFactorialRecursivo(int number) {

        if (number == 0) {
            return 1;
        }

        return number * obtenerFactorialRecursivo(number - 1);

    }

    // Métodos de actividad 3 ----------------------------------------------------

    private static void numerosPrimos() {
        int number = 0;
        boolean esNumeroPrimo = false;

        System.out.println();
        System.out.println("Actividad: Números primos");
        System.out.println();

        do {

            try {

                System.out.print("Ingresa un número entero para verificar si es primo:");
                number = myScanner.nextInt();

                if (number > 1) {

                    // esNumeroPrimo = esPrimo(number);

                    int divisor = (int) Math.sqrt(number);

                    esNumeroPrimo = esPrimoRecursivo(number, divisor);

                    if (esNumeroPrimo) {
                        System.out.println("El numero ingresado es primo.");
                        System.out.println();
                    } else {
                        System.out.println("El numero ingresado no es primo.");
                        System.out.println();
                    }

                } else {
                    System.out.println("El numero ingresado no es un número primo");
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Ingresa un numero entero.");
                System.out.println();
            }

        } while (number != 0);
    }

    public static boolean esPrimo(int number) {
        boolean esNumeroPrimo = false;
        int numDivisors = 0;

        int divisor = (int) Math.sqrt(number);

        // se obtiene la cantidad de divisores;
        for (int i = divisor; i > 0; i--) { // 4,3,2,1
            if (number % i == 0) {
                numDivisors++;
            }
        }

        if (numDivisors == 1) {
            esNumeroPrimo = true;
        }

        return esNumeroPrimo;
    }

    public static boolean esPrimoRecursivo(int n, int divisor) { // 7, 2
        // Caso base: si el divisor es 1, significa que no se encontraron divisores, por
        // lo tanto, es primo
        if (divisor == 1) { //6,5,4,3,2,1
            return true;
        }

        // Si el número es divisible por el divisor actual, no es primo
        if (n % divisor == 0) {
            return false;
        }

        // Llamada recursiva con el siguiente divisor (divisor - 1)
        return esPrimoRecursivo(n, divisor - 1); //  pr(7, 1) 
    }

    public static void adivinarPalabra() {
        // Seleccionar una palabra aleatoria
        String palabraSecreta = seleccionarPalabra();
        int intentosRestantes = 5;
        char[] pista = generarPista(palabraSecreta.length());

        while (intentosRestantes > 0 && !palabraSecreta.equals(String.valueOf(pista))) {
            System.out.println();
            System.out.println("Pista: " + String.valueOf(pista));
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Ingresa una letra: ");
            char letra = myScanner.nextLine().charAt(0);

            // Comprobar si la letra está en la palabra
            if (verificarLetra(palabraSecreta, pista, letra)) {
                System.out.println("¡Buen intento!");
            } else {// si la letra no esta se resta un intento
                intentosRestantes--;
                System.out.println("La letra ingresada no esta presente.");
            }
        }

        if (palabraSecreta.equals(String.valueOf(pista))) {
            System.out.println("¡Felicidades! Adivinaste la palabra: " + palabraSecreta);
        } else {
            System.out.println("Te has quedado sin intentos. La palabra era: " + palabraSecreta);
        }
    }

    public static String seleccionarPalabra() {
        String[] palabras = { "programa", "bosque", "estrella", "java", "desierto", "odio", "océano", "tierra",
                "viento", "lluvia" };
        int number = (int) (Math.random() * 10);
        return palabras[number];
    }

    public static char[] generarPista(int longitud) {
        char[] pista = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            pista[i] = '_';
        }
        return pista;
    }

    private static boolean verificarLetra(String palabraSecreta, char[] pista, char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                pista[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }
}
