
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadIntegradora {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Desafio 1
        conversionUnidadesTemperatura(myScanner);

        // Desafio 2
        validacionDeContraseña(myScanner);

        myScanner.close();

    }

    private static void conversionUnidadesTemperatura(Scanner myScanner) {

        double temperatura;
        double temperaturaCelcius;
        double temperaturaFahrenheit;
        char unidadMedida;

        System.out.println();
        System.out.println("Desafio I: conversión de unidades de temperatura.");
        System.out.println();

        try {
            System.out.print("Ingresa una temperatura:");
            temperatura = myScanner.nextDouble();
            System.out.print("Ingresa  una unidad de medida - Celsius (C) o Fahrenheit (F):");
            unidadMedida = myScanner.next().charAt(0);

            switch (unidadMedida) {

                case 'C' -> {
                    // conversión a Farenheit
                    temperaturaFahrenheit = (temperatura * 9 / 5) + 32;
                    System.out.println(temperatura + " grados celcius equivale a " + temperaturaFahrenheit
                            + " grados fahrenheit.");
                    System.out.println();
                }

                case 'F' -> {
                    // conversión a celcius
                    temperaturaCelcius = (temperatura - 32) * 5 / 9;
                    System.out.println(
                            temperatura + " grados fahrenheit equivale a " + temperaturaCelcius + " grados celcius.");
                    System.out.println();

                }

                default -> {
                    System.out.println();
                    System.out
                            .println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
                }

            }

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Eror: Temperatura no válida. Ingrese una temperatura numérica.");
            System.out.println();
        }

    }

    private static void validacionDeContraseña(Scanner myScanner) {

        String contraseña;
        String resultado;

        System.out.println();
        System.out.print("Ingrese una contraseña:");
        contraseña = myScanner.nextLine();

        resultado = esContraseñaSegura(contraseña);
        System.out.println(resultado);

    }

    public static String esContraseñaSegura(String contraseña) {
        // Verificar longitud mínima
        if (contraseña.length() < 8) {
            return "Contraseña no segura. Debe tener al menos 8 caracteres.";
        }

        // Verificar que contenga al menos una letra mayúscula
        if (!contraseña.matches(".*[A-Z].*")) {
            return "Contraseña no segura. Debe tener al menos una letra mayúscula.";
        }

        // Verificar que contenga al menos una letra minúscula
        if (!contraseña.matches(".*[a-z].*")) {
            return "Contraseña no segura. Debe tener al menos una letra minúscula.";
        }

        // Verificar que contenga al menos un número
        if (!contraseña.matches(".*\\d.*")) {
            return "Contraseña no segura. Debe tener al menos un número.";
        }

        // Verificar que contenga al menos un carácter especial
        if (!contraseña.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return "Contraseña no segura. Debe tener al menos un carácter especial.";
        }

        return "¡Contraseña segura! Cumple con todos los criterios.";
    }
}
