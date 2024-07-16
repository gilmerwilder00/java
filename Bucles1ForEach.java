import java.util.Scanner;

public class Bucles1ForEach {
    public static void main(String[] args) {
        Scanner myScanner =  new Scanner(System.in);
        contandoElementosPares();
        calculandoPromedio();
        concatenandoElementos();
        contarOcurrencias(myScanner);
        myScanner.close();
    }

    private static void contandoElementosPares(){
        int[] numeros  =  new int[10];
        int cantPares=0;

        for(int i=0; i<numeros.length; i++){
            numeros[i] = (int)(Math.random()*100);
        }

        //Imprimiendo elmentos
        System.out.println();
        System.out.print("Elementos del arreglo: ");
        for(int num : numeros){
            System.out.print(num +" ");
        } 
        System.out.println();

        for (int i : numeros) {
            if(i%2==0){
                cantPares++;
            }
        }
        System.out.println();
        System.out.println("La cantidad de elementos pares es: " + cantPares);
        System.out.println();

    }

    private static void calculandoPromedio(){
        float[] numeros = {4 , 6, 2 , 8, 10};
        float suma=0;
        float promedio;

        for (float f : numeros) {
            suma+=f;
        }
        promedio = suma/numeros.length;
        System.out.println();
        System.out.println("La suma es: " +  suma);
        System.out.println("El promedio es: " +  promedio);
        System.out.println();
    }

    private static void concatenandoElementos(){
        String[] arr = {"Hola", "mundo", "como", "estan", "hoy"};
        String cadena = "";

        for (String string : arr) {
            cadena = cadena + " "+ string;
        }
        System.out.println();
        System.out.println("La cadena final es: " + cadena);
        System.out.println();
    }

    private static void contarOcurrencias(Scanner myScanner){
        char[] cadena = {'a', 'p', 'r', 'e', 'n', 'd', 'i', 'e', 'n', 'd', 'o', ' ', 'j', 'a', 'v', 'a'};
        char caracterLeido;
        int apariciones = 0;

        System.out.println();
        System.out.print("Ingresa un caracter: ");
        caracterLeido = myScanner.next().charAt(0);

        for ( char caracter : cadena) {
            if(caracter == caracterLeido){
                apariciones++;
            }
        }

        if(apariciones>0){
            System.out.println("El caracter '" + caracterLeido  + "' aparece " + apariciones + " veces en la frase." );
        }else{
            System.out.println("El caracter '" + caracterLeido  + "' no aparece en la frase." );
        }
        System.out.println();

    }
}
