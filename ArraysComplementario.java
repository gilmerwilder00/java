import java.util.Scanner;

public class ArraysComplementario {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        sumandoPares();
        sumandoEnPsicionesPares();
        ordenandoCadenas(myScanner);

        myScanner.close();        
    }

    private static void sumandoPares(){
        int[] numeros = {7,1,3,4,5,6};
        int suma=0;
        int contarPares=0;

        if(numeros[0]%2==0){
            suma+= numeros[0];
            contarPares+=1;
        }
        if(numeros[1]%2==0){
            suma+= numeros[1];
            contarPares+=1;
        }
        if(numeros[2]%2==0){
            suma+= numeros[2];
            contarPares+=1;
        }
        if(numeros[3]%2==0){
            suma+= numeros[3];
            contarPares+=1;
        }
        if(numeros[4]%2==0){
            suma+= numeros[4];
            contarPares+=1;
        }
        if(numeros[5]%2==0){
            suma+= numeros[5];
            contarPares+=1;
        }

        System.out.println();
        System.out.println("La cantidad de numeros pares es: " +  contarPares);
        System.out.println("La suma de números pares es: " +  suma);
        System.out.println();
    }

    private static void sumandoEnPsicionesPares(){
        int[] numeros = {7,1,3,4,5,6};
        int suma= numeros[0]+ numeros[2]+ numeros[4];

        System.out.println("La suma de números en posiciones pares es: " +  suma);
        System.out.println();
    }

    private static void ordenandoCadenas(Scanner myScanner){
        String[] cadenas = new String[4];

        System.out.print("Ingrese la primera cadena:");
        cadenas[0] = myScanner.nextLine();
        System.out.print("Ingrese la segunda cadena:");
        cadenas[1] = myScanner.nextLine();
        System.out.print("Ingrese la tercera cadena:");
        cadenas[2] = myScanner.nextLine();
        System.out.print("Ingrese la cuarta cadena:");
        cadenas[3] = myScanner.nextLine();

       
        if(cadenas[0].compareTo(cadenas[1])<0){
            System.out.println("["+cadenas[0] + "] va antes que [" + cadenas[1] + "] en orden alfabético.");
        }else if(cadenas[0].compareTo(cadenas[1])>0){
            System.out.println("["+cadenas[1] + "] va antes que [" + cadenas[0] + "] en orden alfabético.");
        }else{
            System.out.println("["+cadenas[0] + "] es igual a [" + cadenas[1] + "] en orden alfabético.");
        }
        

    }


}
