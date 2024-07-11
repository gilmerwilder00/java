import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        sumandoElementos();
        promediandoNumero(myScanner);
        encontrandoMaximo(myScanner);
        buscandoNumero(myScanner);
        copiandoElementos(myScanner);

        myScanner.close();
    }

    private static void sumandoElementos() {
        int[] arrayNumeros = { 8, 2, 10 };
        int sumaNumeros=0;
        
        sumaNumeros = arrayNumeros[0] + arrayNumeros[1] + arrayNumeros[2];

        // for( int i = 0; i<arrayNumeros.length; i++ ){
        //     sumaNumeros += arrayNumeros[i];
        // }

        // for(int item  : arrayNumeros){
        //     sumaNumeros += item;
        // }


        System.out.println();
        System.out.println("Actividad: Sumando números");
        System.out.println("La suma del arreglo de números es: " + sumaNumeros);
        System.out.println();
    }

    private static void promediandoNumero(Scanner myScanner) {

        int[] numeros = new int[4];
        int suma = 0;
        double promedio = 0;

        System.out.println();
        System.out.println();
        System.out.print("Ingrese el primer número:");
        numeros[0] = myScanner.nextInt();
        System.out.print("Ingrese el segundo número:");
        numeros[1] = myScanner.nextInt();
        System.out.print("Ingrese el tercer número:");
        numeros[2] = myScanner.nextInt();
        System.out.print("Ingrese el cuarto número:");
        numeros[3] = myScanner.nextInt();

         suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];

        // for(int numero : numeros){
        //     suma += numero;
        // }

        promedio =  (double)suma / numeros.length;

        System.out.println();
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        System.out.println();
    }

    private static void encontrandoMaximo(Scanner myScanner) {
        int[] numeros = new int[5];
        int maximo;

        // lectura de enteros
        System.out.print("Ingrese el primer número:");
        numeros[0] = myScanner.nextInt();
        System.out.print("Ingrese el segundo número:");
        numeros[1] = myScanner.nextInt();
        System.out.print("Ingrese el tercer número:");
        numeros[2] = myScanner.nextInt();
        System.out.print("Ingrese el cuarto número:");
        numeros[3] = myScanner.nextInt();
        System.out.print("Ingrese el quinto número:");
        numeros[4] = myScanner.nextInt();

        // Encontrando el maximo

        maximo = numeros[0];

        if (numeros[1] > maximo) {
            maximo = numeros[1];
        }
        if (numeros[2] > maximo) {
            maximo = numeros[2];
        }
        if (numeros[3] > maximo) {
            maximo = numeros[3];
        }
        if (numeros[4] > maximo) {
            maximo = numeros[4];
        }

        // for(int i= 1; i<numeros.length; i++){
        //     if(numeros[i]>maximo){
        //         maximo = numeros[i];
        //     }
        // }


        System.out.println();
        System.out.println("El número máximo es: " + maximo);

    }

    private static void buscandoNumero(Scanner myScanner) {

        int[] numeros = { 3, 4, 5 };

        boolean encontrado = false;

        System.out.print("Ingrese un número a buscar:");
        int numeroBuscado = myScanner.nextInt();

        if (numeros[0] == numeroBuscado) {
            encontrado = true;
        }
        if (numeros[1] == numeroBuscado) {
            encontrado = true;
        }
        if (numeros[2] == numeroBuscado) {
            encontrado = true;
        }

        // for(int numero: numeros){
        //     if (numero == numeroBuscado){
        //         encontrado=true;
        //     }
        // }


        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " si se encuentra en el array.");
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el array.");
        }
    }

    private static void copiandoElementos(Scanner myScanner) {

        int[] numeros = { 5, 4, 3 };

        int[] numeros2 = new int[numeros.length + 2];

        //copiar valores existentes del arreglo de numeros
        numeros2[0] = numeros[0];
        numeros2[1] = numeros[1];
        numeros2[2] = numeros[2];

        System.out.println();
        System.out.print("Ingrese el primer número:");
        int numeroExtra1 = myScanner.nextInt();
        System.out.print("Ingrese el segundo número:");
        int numeroExtra2 = myScanner.nextInt();

        numeros2[numeros.length] = numeroExtra1;
        numeros2[numeros.length + 1] = numeroExtra2;

        System.out.println();
        System.out.println("Contenido del array2: ");
        System.out.print("[ " + numeros2[0] + " ");
        System.out.print(numeros2[1] + " ");
        System.out.print(numeros2[2] + " ");
        System.out.print(numeros2[3] + " ");
        System.out.println(numeros2[4]+" ]");
        System.out.println();
    }
}
