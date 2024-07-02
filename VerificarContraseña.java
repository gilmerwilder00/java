import java.util.Scanner;

public class VerificarContraseña {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String contraseñaActual = "ABC123";

        System.out.print("Ingrese su contraseña:");

        String contraseña = myScanner.nextLine();

        //  dato por valor: Byte, Short, Integer, Long, Float, Double, Boolean y Character
        //  dato por referencia: Objetos

        //contraseñaActual ====>  ref (A) ====> Heap ("ABC123")
        //contraseña ===>  ref(B) ====> Heap ("ABC567")

        // if(contraseña == contreñaActual) ====> Incorrecto
        // contraseña.equals(contraseñaActual) ===> Correcto

        if(contraseña.equals(contraseñaActual) ){
            System.out.println("Acceso concedido.");
        }else{
            System.out.println("Acceso denegado.");
        }

        myScanner.close();
    }

}
