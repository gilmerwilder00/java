import java.util.Scanner;

public class Metodos1 {

    public static Scanner myScanner = new Scanner(System.in);



    public static void main(String[] args) {

        // Actividad 1: Práctica inicial

        // Scanner myScanner = new Scanner(System.in);
        // String name ="Gilmer Cabrera";
        // int age = 27;
        // imprimeNombre(name);
        // imprimeNombreYEdad(name, age);

        // Actividad 2: Manos a la obra

        // String name = obtenerNombre();
        // int age = obtenerEdad();
        // imprimeNombre(name);
        // imprimeNombreYEdad(name, age);

        // Ejercicio complementario 1
        // int number = perdirNumero();
        // imprimirTablaMultiplicar(number);

        // Ejercicio complementario 2
        int[] numeros = new int[3];
        numeros = perdirNumeros();
        imprimirTablasMultiplicar(numeros);
    
        Math.max(0, 0);


    }

    public static void imprimeNombre(String name){
        System.out.println();
        System.out.println("Mi nombre es " +  name);
        System.out.println();
    }

    public static void imprimeNombreYEdad(String nombre, int edad){
        System.out.println();
        System.out.println("Me llamo "+ nombre + " y tengo " + edad + " años.");
        System.out.println();
    }

    // public static String obtenerNombre(Scanner myScanner){
    //     System.out.print("Ingresa tu nombre: ");
    //     String name = myScanner.nextLine();
    //     return name;
    // }

    // public static int obtenerEdad(Scanner myScanner){
    //     System.out.print("Ingresa tu edad: ");
    //     int age = myScanner.nextInt();
    //     return age;
    // }

    public static String obtenerNombre(){
        System.out.print("Ingresa tu nombre: ");
        String name = myScanner.nextLine();
        return name;
    }

    public static int obtenerEdad(){
        System.out.print("Ingresa tu edad: ");
        int age = myScanner.nextInt();
        return age;
    }

    // Ejercicio complementario 1 
    public static int perdirNumero(){
        System.out.print("Ingresa un número: ");
        int number = myScanner.nextInt();
        return number;
    }

    // Ejercicio complementario 1
    public static void imprimirTablaMultiplicar(int number){
        
        System.out.println();

        for(int i=1; i<=12; i++){
            System.out.println(i + " x " + number + " = " + (i*number) );
        }

        System.out.println();
    }


    // Ejercicio complementario 2 
    public static int[] perdirNumeros(){

        int [] numbers = new int[3]; //[0 , 1,  2]

        for(int i = 0; i<3; i++){
            System.out.print("Ingresa un número entero: ");
            numbers[i] = myScanner.nextInt();
            System.out.println();
        }

        return numbers;        
    }


    // Ejercicio complementario 2
    public static void imprimirTablasMultiplicar(int[] number){
        System.out.println();
        for (int num : number) {
            // Ejercicio complementario 1
            imprimirTablaMultiplicar(num);
        }    
        System.out.println();
    }


  

}
