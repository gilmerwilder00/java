import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Ingrese un numero (n1):");
        float numero1 = myScanner.nextFloat();
        System.out.print("Ingrese otro numero (n2):");
        float numero2 = myScanner.nextFloat();
        myScanner.nextLine(); // consumir el caracter de cambio de linea
        // 1 \n
        // "Hola\n"

        boolean next = true;

        while (next) {

            System.out.println();
            System.out.print("¿Desea realizar una operación? (Ingrese SI o NO) :");
            String respuesta = myScanner.nextLine(); // \n

            // respuesta =====> ref --------> Heap "NO"

            // if (respuesta == "NO")) {
            // System.out.println(respuesta);

            if (respuesta.equalsIgnoreCase("NO")) {
                break;
            }

            System.out.println("Seleccionar una de las siguiente operaciones:");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");

            int option = myScanner.nextInt();

            myScanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("La suma de " + numero1 + " y " + numero2 + " es : " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta de " + numero1 + " y " + numero2 + " es : " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println(
                            "La multiplicación de " + numero1 + " y " + numero2 + " es : " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println(
                            "La multiplicación de " + numero1 + " y " + numero2 + " es : " + (numero1 * numero2));
                    break;

                default:
                    System.out.println("No ingreso una opcion correcta");
                    next = false;
                    break;
            }

        }

        myScanner.close();
    }

}
