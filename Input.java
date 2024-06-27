import java.util.Scanner;


public class Input {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");

        String miNombre = myScanner.nextLine();

        System.out.print("Ingrese su edad: ");

        int miEdad = myScanner.nextInt();

        System.out.println(miNombre + " tiene "+ miEdad + " años.");

        myScanner.close();

    }
}
