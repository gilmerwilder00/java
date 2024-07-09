import java.util.InputMismatchException;
import java.util.Scanner;


public class ClaseMath {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int opcion = 0;

        System.out.println();
        System.out.println("1. Calcular valor absoluto");
        System.out.println("2. Redondeo de un número");
        System.out.println("3. Generando un número aleatoreo");
        System.out.println("4. Calculando una potencia");
        System.out.println("5. Calculando la raiz cuadrada: ");
        System.out.println();
        System.out.print("Ingresa un número entero para seleccionar una opción: ");

        try {
            opcion = myScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Se debe ingresar una número entero de las opciones mostradas.");
            System.out.println();
        }

        switch (opcion) {
            case 1 -> calculandoValorAbsoluto(myScanner);
            case 2 -> redondeDeNumeros(myScanner);
            case 3 -> generandoNumerosAleatoreos();
            case 4 -> calculandoLaPotencia(myScanner);
            case 5 -> caculandoLaRaizCuadrada(myScanner);
            default -> {
                System.out.println("Debe seleccionar una opción válida");
                System.out.println();
            }
        }

        myScanner.close();

    }

    private static void calculandoValorAbsoluto(Scanner myScanner) {
        int numero;
        int valorAbsoluto;

        System.out.println();
        System.out.println("Actividad: Calculando valor absoluto");
        System.out.println();

        try {
            System.out.print("Ingresa un número entero:");
            numero = myScanner.nextInt();

            valorAbsoluto = Math.abs(numero);

            System.out.println("En valor absoluto es: " + valorAbsoluto);
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Se debe ingresar un número entero.");
            System.out.println();
        }

    }

    private static void redondeDeNumeros(Scanner myScanner) {
        double numero;
        double valorRedondeado;

        System.out.println();
        System.out.println("Actividad: Redondeo de números");
        System.out.println();

        try {
            System.out.print("Ingresa un número decimal:");
            numero = myScanner.nextDouble();

            valorRedondeado = Math.round(numero);

            System.out.println("En valor redondeado es: " + valorRedondeado);
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Se debe ingresar un número.");
            System.out.println();
        }

    }

    private static void generandoNumerosAleatoreos() {
        int numeroAleatoreo;

        System.out.println();
        System.out.println("Actividad: Calculando numero aleatoreo");
        System.out.println();

        numeroAleatoreo = (int)(Math.random()*355 + 1) ;  // [1.0 - 356 > 355.6   

        System.out.println("El número aleatoreo generado es: " + numeroAleatoreo);
        System.out.println();
    }

    private static void calculandoLaPotencia(Scanner myScanner) {
        int base;
        int exponente;
        double potencia;

        System.out.println();
        System.out.println("Actividad: calculando la potencia");
        System.out.println();

        try {
            System.out.print("Ingresa un número entero (base):");
            base = myScanner.nextInt();
            System.out.print("Ingresa un número entero (exponente):");
            exponente = myScanner.nextInt();

            potencia =  Math.pow(base, exponente);

            System.out.println();
            System.out.println("El resultado de la potencia es: " + potencia);

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Se debe ingresar un número entero.");
            System.out.println();
        }

    }

    private static void caculandoLaRaizCuadrada(Scanner myScanner) {
        double numero;
        double raizCuadrada;

        System.out.println();
        System.out.println("Actividad: calculando la raiz cuadrada");
        System.out.println();

        try {
            System.out.print("Ingresa un número: ");
            numero = myScanner.nextDouble();
            if (numero < 0) {
                System.out.println("Debe ingresar un número positivo");
                System.out.println();
            } else {
                raizCuadrada = Math.sqrt(numero);
                System.out.println("La raiz cuadra es: " + raizCuadrada);
            }

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Se debe ingresar un número entero.");
            System.out.println();
        }

    }
}
