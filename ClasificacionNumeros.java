import java.util.Scanner;

public class ClasificacionNumeros {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        float numero = myScanner.nextFloat();

        if(numero>0){
            System.out.println("El número ingresado el positivo.");
        }else if (numero ==0){
            System.out.println("El número ingresado el igual a 0.");
        }else{
            System.out.println("El número  ingresado es negativo.");
        }

        myScanner.close();
    }
}
