import java.util.Scanner;

public class DeterminacionEdades {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        

        System.out.print("Ingrese su edad:");
        int edad = myScanner.nextInt();

        if(edad < 0){
            System.out.println("La edad debe ser un número positivo.");
        }else if(edad <18){
            System.out.println("Eres menor de edad.");
        }else if (edad>=18 && edad <=64){
            System.out.println("Eres adulto.");
        }else{
            System.out.println("Eres un adulto mayor");
        }

       

        myScanner.close();
    }

}
