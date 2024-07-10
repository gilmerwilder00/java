import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Actividad 1
        longitudDeCadena(myScanner);

        // Activiad 2
        concatenacionDeCadenas(myScanner);

        //Actividad 3
        extraccionDeSubcadena(myScanner);

        //Actividad 4
        busquedaDeCaracteres(myScanner);

        // Actividad 5
        mayusculasYMinusculas(myScanner);

        myScanner.close();
    }

    private static void longitudDeCadena(Scanner myScanner) {
        String cadena;

        System.out.println();
        System.out.println("Actividad: Longitud de Cadena");
        System.out.println();
        System.out.print("Ingrese una cadena:");
        cadena = myScanner.nextLine();
        System.out.println();
        System.out.println("La longitud de la cadena es: " + cadena.length());
        System.out.println();
    }

    private static void concatenacionDeCadenas(Scanner myScanner) {
        String nombre;
        String apellidos;
        String nombreCompleto;

        System.out.println();
        System.out.println("Actividad: Concatenación de cadenas");

        System.out.print("Ingrese su nombre: ");
        nombre = myScanner.nextLine();
        System.out.print("Ingrese sus apellidos:");
        apellidos = myScanner.nextLine();

        // nombreCompleto = nombre.concat(apellidos);
        nombreCompleto = nombre.concat(" ").concat(apellidos);

        nombreCompleto = nombreCompleto + 5 ;


// 
        System.out.println("Su nombre completo es: " + nombreCompleto);
        System.out.println();

    }

    private static void extraccionDeSubcadena(Scanner myScanner) {
        String cadena;
        String subcadena;
        int indice1;
        int indice2;

        System.out.println();
        System.out.println("Actividad: Extraccion de subcadena");
        System.out.print("Ingrese una cadena:");
        cadena = myScanner.nextLine();

        try {
            System.out.println();
            System.out.print("Ingrese un numero entero como indice inicial:");
            indice1 = myScanner.nextInt();// excepcion 
            System.out.print("Ingrese un numero entero como indice final:");
            indice2 = myScanner.nextInt(); // excepcion
            
            subcadena = cadena.substring(indice1, indice2);// excepcion
            
            System.out.println("La subcadena es: " + subcadena);

        }catch( StringIndexOutOfBoundsException e){
            System.out.println();
            System.out.println("Índices ingresados fuera de rango.");
            System.out.println("El rango de indices de la cadena anterior debio ser entre indice1: 0  e indice 2: " + cadena.length());
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: debe ingresar números enteros");
        } catch (Exception e) {
            System.out.println();
            System.out.println(e);
        }
    }


    private static void busquedaDeCaracteres(Scanner myScanner){
        
        String cadena;
        char caracter;
        int indice;

        System.out.println();
        System.out.println("Actividad: busqueda de caracteres");
        System.out.println();
        System.out.print("Ingresa una cadena:");
        cadena = myScanner.nextLine();
        System.out.print("Ingresa un caracter:");
        caracter =  myScanner.next().charAt(0);

        indice = cadena.indexOf(caracter);

        if(indice!=-1){
            System.out.println("En indice del caracter ingresado es: " +  indice);
        }else{
            System.out.println("En caracter ingresado no se encuentra en la cadena.");
        }

        System.out.println();

    }

    private static void mayusculasYMinusculas(Scanner myScanner){
        String cadena;
        System.out.println();
        System.out.println("Actividad: Mayúsculas y minúsculas");
        System.out.println();

        System.out.print("Ingrese una cadena:");
        cadena = myScanner.nextLine();

        System.out.println("Cadena mayúsculas: " + cadena.toUpperCase());
        System.out.println("Cadena minúsculas: " + cadena.toLowerCase());
        System.out.println();

    }


}
