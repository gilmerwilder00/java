import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileDoWhileComplementario {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        tablaMultiplicar(myScanner);
        myScanner.close();

    }

    private static void tablaMultiplicar(Scanner myScanner){
        int numero=0;

        try {

            do{
                System.out.println();
                System.out.print("Ingresa un numero entero:");
                numero = myScanner.nextInt();

                if(numero>0){
                    for(int i=1; i<=12; i++){
                        System.out.println(numero + " x " + (i) + "=" + (numero*i));
                    }
                }
               
            }while(numero!=0);

            
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Debes ingresar un número entero.");
            System.out.println();
        }

    }
}
