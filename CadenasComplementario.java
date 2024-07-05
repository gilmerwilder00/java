import java.util.Scanner;

public class CadenasComplementario {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Actividad 1
        // remplazoDeCaracteres(myScanner);

        // Actividad 2
        // eliminacionEspacioEnBlanco(myScanner);

        // Actividad 3
        // comparacionDeCadenas(myScanner);

        // Actidada 4
        calcularLongitudSinEspacios(myScanner);

        myScanner.close();
    }

    private static void remplazoDeCaracteres(Scanner myScanner) {
        String cadena;
        char caracter1;
        char caracter2;

        System.out.println();
        System.out.println("Actividad: reemplazo de caracteres");
        System.out.print("Ingrese una cadena de caracteres:");
        cadena = myScanner.nextLine();
        System.out.print("Ingrese un caracter de la cadena anterior que desea reemplazar: ");
        caracter1 = myScanner.next().charAt(0);
        System.out.print("Ingrese un caracter de reemplazo: ");
        caracter2 = myScanner.next().charAt(0);

        cadena = cadena.replace(caracter1, caracter2);

        System.out.println();
        System.out.println("La nueva cadena es: " + cadena);
        System.out.println();
    }

    private static void eliminacionEspacioEnBlanco(Scanner myScanner) {
        String cadena;

        System.out.println();
        System.out.println("Actividad: eliminacion de espacios en blanco");
        System.out.println();
        System.out.print("Ingrese una cadena de caracteres:");
        cadena = myScanner.nextLine();

        cadena = cadena.trim();

        System.out.println();
        System.out.println("La nueva cadena es: " + cadena);
        System.out.println();
    }


    private static void comparacionDeCadenas(Scanner myScanner) {
        String cadena1;
        String cadena2;
        boolean iguales;
        boolean iguales2;

        System.out.println();
        System.out.println("Actividad: comparacion de cadenas");
        System.out.println();
        System.out.print("Ingrese una cadena de caracteres:");
        cadena1 = myScanner.nextLine();
        System.out.print("Ingrese una cadena de caracteres:");
        cadena2 = myScanner.nextLine();

        iguales = cadena1.equals(cadena2);

        iguales2 = cadena1.equalsIgnoreCase(cadena2);


        if(iguales){
            System.out.println();
            System.out.println("equals: Las cadenas son iguales.");
        }else{
            System.out.println();
            System.out.println("equals: Las cadenas son diferentes.");
        }


        if(iguales2){
            System.out.println();
            System.out.println("equalsIgnoreCase: Las cadenas son iguales.");
        }else{
            System.out.println();
            System.out.println("equalsIgnoreCase: Las cadenas son diferentes.");
        }

        System.out.println();

    }


    private static void calcularLongitudSinEspacios(Scanner myScanner) {
        String cadena;
        String cadenaSinEspacios;

        System.out.println();
        System.out.println("Actividad: calculando la longitud de cadenas sin espacios");
        System.out.println();
        System.out.print("Ingrese una cadena de caracteres:");
        cadena = myScanner.nextLine();

        // Eliminar todos los espacios
        cadenaSinEspacios = cadena.replace(" ", "");
      
        // Calcular la longitud de la cadena sin espacios
        int longitudSinEspacios = cadenaSinEspacios.length();

        System.out.println();
        System.out.println("La longitud de la cadena sin espacios en blanco es: " + longitudSinEspacios);
        System.out.println("Cadena sin espacios:"+ cadenaSinEspacios);
        System.out.println();
    }
}
