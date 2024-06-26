public class App {
    public static void main(String[] args) {
        //        [0 ,   1 ,  2]  
        // args = ["a", "b", "c"]

        // System.out.println("Hola mundo");
        // System.out.println("Bienvenido a tu curso de Java!");
        // System.out.println("Mi nombre es Gilmer Cabrera");
        // System.out.println("Mi edad es 27");

        // boolean tengoHermanos = true;
        // char inicialNombre = 'G';
        // String miNombre = "Gilmer Wilder Cabrera García";
        // int miEdad = 27;
        // long poblacionPeru = 33725844;

        // System.out.println(tengoHermanos);
        // System.out.println("La inicial de mi nombre es : " + inicialNombre);
        // System.out.println(miNombre);
        // System.out.println(miEdad);
        // System.out.println(poblacionPeru);
        // System.out.println("-----------------------------------------------------------");
        // System.out.println("Mi nombre es " + miNombre + " y tengo " + miEdad + " años.");

        // String mensajeDeBienvenida = "Bienvenido a Java";
        // float temperaturaActual = 19.0f;
        // boolean datoLogico = true;

        // System.err.println();
        // System.out.println("Valor de la variable mensajeDeBienvenida: " + mensajeDeBienvenida);
        // System.out.println("Valor de la variable temperaturaActual: " + temperaturaActual);
        // System.out.println("Valor de la variable datoLogico: " + datoLogico);

        // Args
        if (args.length > 0) {
            System.out.println("Parámetros pasados desde la línea de comandos:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Parámetro " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No se pasó ningún parámetro desde la línea de comandos.");
        }

    }
}

// 1. La temperatura media de una ciudad durante el verano (en grados Celsius).
// Tipo de dato: double
// Justificación: se permite decimal y cubre un amplio rango de valores posibles para la temperatura

// 2. El precio de un producto en una tienda (en dólares y centavos).
// Tipo de dato: double
// Justificación: se permite decimales y cubre un amplio rango de valores
// posibles

// 3. El nombre completo de una persona.
// Tipo de dato: String
// Justificación: Se trata de una cadena de caracteres

// 4. La fecha de nacimiento de una persona.
// Tipo de dato: LocalDate
// Justificación: Se trata de fechas.

// 5. El número de habitantes de una ciudad.
// Tipo de dato: Long
// Justificación: Se trata de un valor entego y puede se grande

// 6. La duración de una película (en minutos).
// Tipo de dato: short
// Justificación: se trata de un valor entero mediano

// 7. Si un artículo está disponible o no en una tienda (true/false).
// Tipo de dato: boolean
// Justificación: se trata de un valor booleano

// 8. La distancia entre dos ciudades (en kilómetros).
// Tipo de dato: Double
// Justificación: permite decimales y permite números grandes

// 9. El número de teléfono de una persona.
// Tipo de dato: String
// Justificación: se trata de una cadena de caracteres por ejemplo: +51

// 10. La cantidad de existencias de un producto en una tienda.
// Tipo de dato: int
// Justificación: se trata de número enteros