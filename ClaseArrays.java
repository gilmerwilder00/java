import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseArrays {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // ordenandoNumeros();
        // busquedaBinaria(myScanner);
        // comparandoArreglos();
        // copiandoParteDeUnArreglo(myScanner);
        rellenadoUnArreglo(myScanner);

        myScanner.close();
    }

    private static void ordenandoNumeros(){
        int[] numeros  = new int[10];

        for(int i= 0; i<numeros.length; i++){
            numeros[i] =(int)(Math.random()*100+1);
        }

        System.out.println();
        System.out.println("Actividad: Ordenando numeros");
        System.out.println();
        System.out.print("Arreglo inicial: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println();

        //ordenamiento ascendente    
        Arrays.sort(numeros);

        System.out.print("Arreglo ordenado ascendentemente: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println();

        //ordenamiento descendente

        for (int i = 0; i < numeros.length / 2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temporal;
        }

        System.out.println();
        System.out.print("Arreglo ordenado descendentemente:");
        System.out.println(Arrays.toString(numeros));
        System.out.println();
    }

    private static void busquedaBinaria(Scanner myScanner){
        int[] numeros= {5,6,7,8,9,10};
        int numeroBuscado;
        int indice;


        System.out.println();
        System.out.println("Actividad: búsqueda binaria");
        System.out.println();

        try {
            System.out.print("Ingrese el numero buscado entre el 5 y 10: ");
            numeroBuscado =  myScanner.nextInt();

            indice = Arrays.binarySearch(numeros, numeroBuscado);

            if(indice>=0){
                System.out.println("El número ingresado se encuentra en la posicion " + indice  + " del arreglo.");
                System.out.println();
            }else{
                System.out.println("El número ingresado no se encuentra en el arreglo.");
                System.out.println();
            }


        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Debe ingresar un número entero entre el 5 y 10.");
            System.out.println();
        }
    }


    private static void comparandoArreglos(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {2,3,4,5};


        System.out.println();
        System.out.println("Actividad: comparando arreglos");
        System.out.println();

        if(Arrays.equals(arr1, arr2)){
            System.out.println("El arr1 y el arr2 son iguales");
        }else{
            System.out.println("El arr1 y arr2 son diferentes.");
        }

        if(Arrays.equals(arr1, arr3)){
            System.out.println("El arr1 y el arr3 son iguales");
        }else{
            System.out.println("El arr1 y arr3 son diferentes.");
        }   

       System.out.println();
    }


    private static void copiandoParteDeUnArreglo(Scanner myScanner){
        int[] arr = {4,5,6,7,8,9};
        int a, b;
        boolean condicion;

        System.out.println();
        System.out.println("Actividad: copiando parte de un arreglo.");
        System.out.println();

        //imprimiendo indices

        System.out.print("Indices: [");
        for (int i=0; i<arr.length; i++){
            System.out.print(i);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //imprimiendo arr
        System.out.print("Arreglo: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        try {
            do{
                System.out.print("Ingresa un indice inferior (a):");
                a =myScanner.nextInt();
                System.out.print("Ingresa un índice superior (b):");
                b = myScanner.nextInt();

                condicion = (a>=0) && (a<=arr.length-1) && 
                            (b>=0) && (b<=arr.length-1) &&
                            (b>=a);

                if(condicion){
                    int[] newArr = Arrays.copyOfRange(arr, a, b+1);
                    System.out.println();
                    System.out.print("Nuevo arreglo:");
                    System.out.println(Arrays.toString(newArr));
                    System.out.println();
                }else{
                    System.out.println();
                    System.out.println("Debe ingresar los indices en un rango correcto [a,b]");
                    System.out.println();
                }

            }while(!condicion);
            
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Debe ingresar un indice entero entre 0 y " + (arr.length-1));
            System.out.println();
        }


        System.out.println();
    }


    private static void rellenadoUnArreglo(Scanner myScanner){
        int arrSize;
        int number;

        System.out.println();
        System.out.println("Actividad: rellenado un arreglo");
        System.out.println();

        try {
            System.out.print("Ingresa un numero entero para indicar el tamaño de un arreglo:");
            arrSize = myScanner.nextInt();
            System.out.println();
            System.out.print("Ahora ingresa un numero entero para rellenar el arreglo:");
            number = myScanner.nextInt();

            if(arrSize>0){
                int[] arr = new int[arrSize];

                Arrays.fill(arr,number);

                System.out.println();
                System.out.print("Arreglo: ");
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }else{

                System.out.println();
                System.out.println("Debe ingresar un numero entero mayor a cero para en tamaño del arreglo.");
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println();
            System.out.println("Debe ingresar un numero entero.");
            System.out.println();
        }
    }
}
