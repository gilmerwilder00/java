import java.util.InputMismatchException;
import java.util.Scanner;

// Autoboxing: Es el proceso automático de convertir un tipo primitivo (por ejemplo, double) a su correspondiente objeto wrapper (por ejemplo, Double).

// Unboxing: Es el proceso automático de convertir un objeto wrapper (por ejemplo, Double) a su correspondiente tipo primitivo (por ejemplo, double).


public class Wrappers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // verificandoCadenaEsNumero(myScanner);
        // conversionCadenaANumero(myScanner);
        // verificandoCadena(myScanner);
        // verificandoEspaciosEnCadena(myScanner);
        // sumaDeNumeros(myScanner);
        contandoDigitosDeUnNumero(myScanner);

        myScanner.close();
    }

    private static void verificandoCadenaEsNumero(Scanner myScanner) {
        String numeroCadena;
        Double numeroObjeto; // objeto, no es el tipo de dato primitivo double

        System.out.println();
        System.out.println("Actividad: Verificando si una cadena representa un número");
        System.out.println();

        try {
            System.out.print("Ingresa un cadena que represente un número:");
            numeroCadena = myScanner.nextLine();

            numeroObjeto = Double.valueOf(numeroCadena);// posible excepción

            System.out.println("La cadena ingresada si representa un numero:" + numeroObjeto);
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Error: no se ha ingresado un número válido.");
            System.out.println();
        }

        // Diferencia entre Double.parseDouble() y Double.valueOf()
        // Double.parseDouble(String s): Convierte una cadena en un valor primitivo
        // double.
        // Double.valueOf(String s): Convierte una cadena en un objeto Double.
    }

    private static void conversionCadenaANumero(Scanner myScanner) {
        String numeroCadena;
        Integer numeroObjeto; // objeto, no es el tipo de dato primitivo int

        System.out.println();
        System.out.println("Actividad: Conversión de cadena a número");
        System.out.println();

        try {
            System.out.print("Ingresa un cadena que respresente un número entero:");
            numeroCadena = myScanner.nextLine();

            numeroObjeto = Integer.valueOf(numeroCadena);// posible excepción

            System.out.println("La cadena ingresada si representa un numero entero:" + numeroObjeto);
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Error: no se ha ingresado un número válido.");
            System.out.println();
        }

    }

    private static void verificandoCadena(Scanner myScanner) {
        String cadena;
        char caracter;
        boolean isLetter;
        int numNoChar=0;

        System.out.println();
        System.out.println("Actividad: Verificando si una cadena contiene solo letras");
        System.out.println();

        System.out.print("Ingresa un cadena:");
        cadena = myScanner.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            isLetter = Character.isLetter(caracter);
            if (!isLetter) {
                numNoChar++;
            }
        }

        if (numNoChar == 0) {
            System.out.println("La cadena tiene solo letras.");
            System.out.println();
        } else {
            System.out.println("La cadena no contiene solo letras.");
            System.out.println();
        }

    }

    private static void verificandoEspaciosEnCadena(Scanner myScanner) {
        String cadena;
        char caracter;
        boolean isWhiteSpace;
        int numWhiteSpaces = 0;

        System.out.println();
        System.out.println("Actividad: Verificando espacio en blanco en cadena");
        System.out.println();

        System.out.print("Ingresa un cadena:");
        cadena = myScanner.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            isWhiteSpace = Character.isWhitespace(caracter);
            if (isWhiteSpace) {
                numWhiteSpaces++;
            }
        }

        System.out.println("La cadena tiene " + numWhiteSpaces + " espacios en blanco");
        System.out.println();
    }

    private static void sumaDeNumeros(Scanner myScanner) {
        String numero1Cadena;
        String numero2Cadena;

        int numero1;
        double numero2;

        double suma;

        System.out.println();
        System.out.println("Actividad: Sumando números");
        System.out.println();

        try {
            System.out.print("Ingresa un cadena que respresente un número entero:");
            numero1Cadena = myScanner.nextLine();
            numero1 = Integer.valueOf(numero1Cadena);// posible excepción

            System.out.print("Ingresa un cadena que respresente un número decimal:");
            numero2Cadena = myScanner.nextLine();
            numero2 = Double.valueOf(numero2Cadena);// posible excepción

            suma = numero1 + numero2;

            System.out.println("La suma es igual a: " + suma);
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Error: no se ha ingresado un número válido.");
            System.out.println();
        }

    }

    private static void contandoDigitosDeUnNumero(Scanner myScanner) {
        int number;
        int numDigits = 0;
        String numeroCadena;
        char caracter;
        boolean isDigit;

        System.out.println();
        System.out.println("Actividad: Contanto dígitos de un número entero");
        System.out.println();

        try {
            System.out.print("Ingresa un numero entero:");
            number = myScanner.nextInt();
            
            numeroCadena = Integer.toString(number);

            for (int i = 0; i < numeroCadena.length(); i++) {
                caracter = numeroCadena.charAt(i);
                isDigit = Character.isDigit(caracter);
                if (isDigit) {
                    numDigits++;
                }
            }

            System.out.println("La cantidad de dígitos del número es: " + numDigits);

        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar un numero entero.");
            System.out.println();
        }
        System.out.println();

    }

}
