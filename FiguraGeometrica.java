import java.util.Scanner;


public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double area;
        int opcion;

        System.out.println();
        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println();
        System.out.print("Opcion: ");

        opcion = myScanner.nextInt();
        
        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el radio del círculo (en cm):");
                double radio = myScanner.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area + " cm2");
            }
            case 2 -> {
                System.out.print("Ingrese el lado del cuadrado (en cm):");
                double lado =myScanner.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + area + " cm2");
            }
            case 3 -> {
                System.out.print("Ingrese la base del triángulo (en cm):");
                double base =myScanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo (en cm):");
                double altura =myScanner.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area + " cm2");
            }
            default -> {
                System.out.println("Opción inválida");
            }
        }
        System.out.println();

        myScanner.close();
    }
}

// Clases que forman parte del núcleo de Java (paquete java.lang):

// 1.Object: La clase base de todas las clases en Java.
// 2.String: Para manipulación de cadenas de caracteres.    
// 3.Integer, Long, Double, Float, Short, Byte: Clases envolventes para tipos primitivos.
// 4.Boolean: Clase envolvente para el tipo primitivo booleano.
// 5.Character: Clase envolvente para el tipo primitivo char.
// 6.System: Proporciona métodos estáticos para la entrada y salida estándar, entre otros.
// 7.Math: Proporciona métodos matemáticos estáticos para operaciones comunes.
// 8.Enum: Soporte para tipos enumerados en Java.
// 9.Throwable: La clase base para todas las excepciones y errores.
// 10.Exception, RuntimeException, Error: Clases base para excepciones y errores.

// Están disponibles globalmente en cualquier aplicación Java sin necesidad de importaciones explícitas.