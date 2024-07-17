import java.util.Scanner;
import java.util.Arrays;

public class ClaseArraysComplementario {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println();

        // Se solicita  el tamaño del arreglo;
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = myScanner.nextInt();

        //Se crea el arreglo con el tamaño ingresado;
        int[] arreglo = new int[tamaño];

        // Se incializa en indice anterior;
        int indiceAnterior = 0;

        while (indiceAnterior < tamaño - 1) {

            // Se solicita el número para rellenar el arreglo;
            System.out.print("Ingrese un número para rellenar el arreglo:");
            int numero = myScanner.nextInt();

            // se solicita el índice hasta el cual se quiere rellenar el arreglo
            System.out.print("Ingrese el índice hasta el cual quiere rellenar el arreglo entre 0 y "+ (tamaño-1) + ":" );
            int indice = myScanner.nextInt();

            // Se valida que el índice es mayor que el índice anterior y menor que el tamaño del arreglo
            
            if (indice > indiceAnterior && indice < tamaño) {

                // Se rellena el arreglo desde el índice anterior hasta el índice ingresado
                Arrays.fill(arreglo, indiceAnterior, indice + 1, numero);

                // se actualiza el índice anterior
                indiceAnterior = indice;

            } else {
                System.out.println("El índice ingresado no es válido. Debe ser mayor que el último índice ingresado ("+ indiceAnterior + ") y menor que el tamaño del arreglo ("+ tamaño +").");
            }
            System.out.println();
        }

        //se imprime el arreglo
        System.out.println();
        System.out.println(Arrays.toString(arreglo));
        System.out.println();

        myScanner.close();
    }
}
