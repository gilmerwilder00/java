
public class Operators {
    public static void main(String[] args) {

        // Definir variables
        int a = 10;
        int b = 5;

        System.out.println("----------------------------------------------------------------------------");
        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma); // Salida: 15
        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta); // Salida: 5
        // Multiplicación
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion); // Salida: 50
        // División
        int division = a / b;
        System.out.println("División: " + division); // Salida: 2
        // Módulo
        int modulo = a % b;
        System.out.println("Módulo: " + modulo); // Salida: 0
        System.out.println("----------------------------------------------------------------------------");

        // Definir variables
        int a1 = 10;
        int b1;
        // Asignacion
        b1 = a1;
        System.out.println("Asignación: " + b1);
        // Suma y asignación
        a1 += 1;
        System.out.println("Suma y asignación:" + a1);

        // Resta y asignación
        a1 -= 1;
        System.out.println("Resta y asignación: " + a1);

        // Multiplicación y asignaición
        a1 *= 2;
        System.out.println("Multiplicación y asignación: " + a1);

        // División y asignación
        a1 /= 2;
        System.out.println("División: " + a1);

        // Módulo y asignación
        a1 %= 2;
        System.out.println("Módulo: " + a1);

        System.out.println("----------------------------------------------------------------------------");

        // Definir una variable
        int numero = 5;
        // Operador de incremento (++): aumenta el valor de la variable en 1
        numero++; // Equivalente a numero = numero + 1;
        System.out.println("Después del incremento: " + numero); // Salida: 6
        // Operador de decremento (--): disminuye el valor de la variable en 1
        numero--; // Equivalente a numero = numero - 1;
        System.out.println("Después del decremento: " + numero); // Salida: 5
        // Usar el operador de incremento/decremento en una expresión
        int resultado = numero++ * 2; // Incrementa 'numero' después de usar su valor en la expresión
        System.out.println("Resultado: " + resultado); // Salida: 10
        // El valor de 'numero' ha sido incrementado
        System.out.println("Valor de número después de la operación: " + numero);
        // Salida: 6

        System.out.println("----------------------------------------------------------------------------");
        // Igual a (==)
        System.out.println("a == b: " + (a == b)); // Salida: false
        // No igual a (!=)
        System.out.println("a != b: " + (a != b)); // Salida: true
        // Mayor que (>)
        System.out.println("a > b: " + (a > b)); // Salida: false
        // Menor que (<)
        System.out.println("a < b: " + (a < b)); // Salida: true
        // Mayor o igual que (>=)
        System.out.println("a >= b: " + (a >= b)); // Salida: false
        // Menor o igual que (<=)
        System.out.println("a <= b: " + (a <= b)); // Salida: true

        System.out.println("----------------------------------------------------------------------------");
        int edad= 15;

        String mensaje = edad>18 ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mensaje);

    }
}
