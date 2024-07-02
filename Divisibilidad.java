import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.print("Ingrese un número: ");
        float numero = myScanner.nextFloat();    //10\n
        // System.out.println("EL numero ingresado es: " + numero);
        // myScanner.nextLine();

        // System.out.print("Ingrese una cadena: ");
        // String cadena = myScanner.nextLine();
        // System.out.println("La cadena es: " + cadena);


        // 10 \n nextInt(), nextFloat()
        // Hola\n   nextLine()

        boolean esDivisiblePor5 = (numero % 5 == 0);
        boolean esDivisiblePor3 = (numero % 3 == 0);

        if (esDivisiblePor5 && esDivisiblePor3) {
            System.out.println("El numero ingresado es divisible por 5 y por 3.");
        } else if (esDivisiblePor5) {
            System.out.println("El numero ingresado es divisible por 5.");
        } else if (esDivisiblePor3) {
            System.out.println("El número ingresado es divisible por 3.");
        } else {
            System.out.println("El número ingresado no es divisible por 5 ni por 3.");
        }

        myScanner.close();
    }
}
