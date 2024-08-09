import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Metodos2 {
    // variable global
    public static Scanner myScanner = new Scanner(System.in);

    private static final int VALOR_INICIAL = 0;
    private static final int VALOR_FINAL = 100;

    public static void main(String[] args) {

        // Actividad 1: Es par
        // actividad1();

        // Actividad 2: Calculadora
        // actividad2();

        // Actividad 3 : Ejercicio de calificación
        // actividad3();

        // Actividad 4 : Imprimir Arrays-sobrecarga
        // actividad4();

        // Actividad 5 : Generacion de números aleatoreos
        // actividad5();

        // Actividad 6 : Verificación de contraseña
        // actividad6();

        // Actividad 7: Adivinando Numero
        actividad7();

    }

    // Metodos actividad 1: Es par

    public static void actividad1() {
        int number = pedirNumero();

        if (esPar(number)) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par.");
        }
        System.out.println();
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

    public static boolean esPar(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    // Métodos Actividad 2
    public static void actividad2() {
        Integer option = null;

        do {
            option = pedirOpcion(); // devuelve una opcion válida - menu
            if (option != 5) {
                int number1 = pedirNumero();
                int number2 = pedirNumero();

                if (option == 4 && number2 == 0) {
                    System.out.println("No se puede dividir entre 0.");
                } else {
                    double result = realizarOperacion(option, number1, number2);
                    System.out.println("El resultado de la operacion es: " + result);
                    System.out.println();
                }
            }
        } while (option != 5); // repetir cuando la opcion sea diferente a salir (5);

    }

    public static int pedirOpcion() { //menu
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

                validOption = (option >= 1 && option <= 5); // && - and

                if (!validOption) {
                    System.out.print("Ingrese una opcion válida:");
                }

            } catch (Exception e) {
                myScanner.nextLine();
                System.out.print("No ingresó un número, intente nuevamente:");
            }

        } while (option == null || validOption == false); //  // ||: or

        return option;
    }

    public static double realizarOperacion(int option, int number1, int number2) {
        Double result = null;

        result = switch (option) {
            case 1 -> (double) number1 + (double) number2;
            case 2 -> (double) number1 - (double) number2;
            case 3 -> (double) number1 * (double) number2;
            case 4 -> (double) number1 / (double) number2;
            default -> null;
        };

        return result;
    }

    // Metodos de actividad 3
    public static void actividad3() {
        int puntuacion = obtenerPuntuacion();
        if (puntuacion > VALOR_INICIAL && puntuacion < VALOR_FINAL) {
            String mensaje = obtenerNota(puntuacion);
            System.out.println(mensaje);
        } else {
            System.out.println("El número ingresado esta fuera del rango válido.");
        }
    }

    public static int obtenerPuntuacion() {
        Integer numero = null;
        System.out.print("Por favor ingrese un número entre 0 y 100:");
        
        do {
            try {
                numero = myScanner.nextInt();
            } catch (Exception e) {
                myScanner.nextLine();
                System.out.print("No ingresó un número entero válido, intente nuevamente:");
            }
        } while (numero == null);

        return numero;
    }

    public static String obtenerNota(int puntuacion) {
        String categoria = switch (puntuacion / 10) {
            case 9, 10 -> "A"; // 100, 99, 98, 97.... 90 -> 10, 9, 
            case 8 -> "B"; // 89, 88, ... 80
            case 7 -> "C";
            case 6 -> "D";
            default -> "F"; // 59,58,57 ...... 0
        };

        return "Su puntuación es " + categoria;
    }

    // Métodos de actividad 4
    public static void actividad4() {
        int[] arrayInt = { 23, 34, 23, 4, 2, 3 };
        String[] arrayString = { "Hola", "mundo", "como", "estan" };

        imprimirArray(arrayInt);
        imprimirArray(arrayString);
    }

    public static void imprimirArray(int[] array) {
        System.out.println();
        System.out.print("Arreglo de enteros:");
        System.out.println(Arrays.toString(array));
    }

    // sobrecarga del método imprimirArray
    public static void imprimirArray(String[] array) {
        System.out.println();
        System.out.print("Arreglo de cadenas:");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    // Métodos de actividad 5: Generacion de números aleatoreos
    public static void actividad5() {
        int number = obtenerNumeroAleatoreo();
        System.out.println();
        System.out.println("Número:" + number);
        System.out.println();
    }

    public static int obtenerNumeroAleatoreo() {
        int number = (int) (Math.random() * 355 + 1); // 
        return number;
    }

    // Métodos de actividad 6: Verificación de contraseña

    public static void actividad6() {
        String password = pedirContraseña();
        String resultado = esContraseñaSegura(password);
        System.out.println(resultado);
        System.out.println();
    }

    public static String pedirContraseña() {
        String password = null;
        System.out.println();
        System.out.print("Ingrese una contraseña: ");
        password = myScanner.nextLine();
        return password;
    }

    public static boolean tieneLongitudCorrecta(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }

    public static boolean tieneMayuscula(String password) {
        if (password.matches(".*[A-Z].*")) {
            return true;
        }
        return false;
    }

    public static boolean tieneMinuscula(String password) {
        if (password.matches(".*[a-z].*")) {
            return true;
        }
        return false;
    }

    public static boolean tieneNumero(String password) {
        if (password.matches(".*\\d.*")) {
            return true;
        }
        return false;
    }

    public static boolean tieneCaracterEspecial(String password) {
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return true;
        }
        return false;
    }

    public static String esContraseñaSegura(String password) {
        // Verificar longitud mínima
        if (!tieneLongitudCorrecta(password)) {
            return "Contraseña no segura. Debe tener al menos 8 caracteres.";
        }

        // Verificar que contenga al menos una letra mayúscula
        if (!tieneMayuscula(password)) {
            return "Contraseña no segura. Debe tener al menos una letra mayúscula.";
        }

        // Verificar que contenga al menos una letra minúscula
        if (!tieneMinuscula(password)) {
            return "Contraseña no segura. Debe tener al menos una letra minúscula.";
        }

        // Verificar que contenga al menos un número
        if (!tieneNumero(password)) {
            return "Contraseña no segura. Debe tener al menos un número.";
        }

        // Verificar que contenga al menos un carácter especial
        if (!tieneCaracterEspecial(password)) {
            return "Contraseña no segura. Debe tener al menos un carácter especial.";
        }

        return "¡Contraseña segura! Cumple con todos los criterios.";
    }

    // Métodos de actividad 7: adivinando números
    public static void actividad7(){
        int number=(int)(Math.random()*20 +1);
        //
        // int number =  numeroAleatorio(numMin, numMax)

        int inputNumber=0;


        System.out.println();
        do{
            System.out.print("Ingresa un numero entero entre 1 y 20:");
            inputNumber= myScanner.nextInt();

            if (inputNumber > number){
                System.out.println("El numero a adivinar es menor que " + inputNumber);
            }else if (inputNumber < number){
                System.out.println("El número a adivinar es mayor que "+ inputNumber);
            }else{
                System.out.println("Felicidades adivinaste el número:" + number);
            }

        }while(number != inputNumber);

        System.out.println();

    }

}
