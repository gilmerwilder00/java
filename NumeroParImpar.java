import java.util.Scanner;


public class NumeroParImpar {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in); 

        System.out.println();
        System.out.print("Ingrese un número entero: ");
        int numero = myScanner.nextInt();
        String mensaje = numero % 2 == 0 ?
                         "El número " + numero  + " es par" :
                         "En número " + numero + " es impar";  
        System.out.println();                 
        System.out.println(mensaje); 
        System.out.println();                
                         
        myScanner.close();
    }
}