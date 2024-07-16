import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args) {
        Scanner myScanner =  new Scanner(System.in);
        menuInteractivo(myScanner);
        adivinandoNumero(myScanner);
        validacionContaseña(myScanner);
        cantidaDeDigitos(myScanner);
        myScanner.close();
    }

    private static void menuInteractivo(Scanner myScanner){
        int opcion=0;
        boolean condicion = true;

        
        System.out.println();
        
        System.out.println("1.Comprar un propucto");
        System.out.println("2.Realizar devolucion");
        System.out.println("3.Ver mis pedidos");
        System.out.println("4.Preguntas frecuentes");
        System.out.println("5.Salir");
        System.out.println();


        while (condicion) {

            System.out.print("Ingresa un numero para selecionar una de las opciones anteriores: ");
            try {
                opcion =  myScanner.nextInt();

                if (opcion==5){
                    condicion=false; // ahora es verdadera
                }              
    
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Debe ingreser un número entero del 1 al 5.");
                System.out.println();
                condicion=false;
            }
        }

        System.out.println("La opcion seleccionada es la " + opcion);
        System.out.println();
        
    }

    private static void adivinandoNumero(Scanner myScanner){
        int number=(int)(Math.random()*20 +1);
        int inputNumber=0;

        System.out.println();
        do{
            System.out.print("Ingresa un numero entero entre 1 y 20:");
            inputNumber=myScanner.nextInt();

            if (inputNumber > number){
                System.out.println("El numero a adivinar es menor que " + inputNumber);
            }else if (inputNumber < number){
                System.out.println("El número a adivinar es mayor que "+ inputNumber);
            }else{
                System.out.println("Felicidades adivinaste el número:" + number);
            }


        }while(number != inputNumber);

        System.out.println();

    }

    private static void validacionContaseña(Scanner myScanner){
        String  password ="secreto";
        String inputPassword="";

        do{
            System.out.print("Ingresa una contraseña:");
            inputPassword = myScanner.nextLine();
            System.out.println();
        }while(!password.equals(inputPassword));
        System.out.println("Contraseña ingresada correcta.");
        System.out.println();

    }

    private static void cantidaDeDigitos(Scanner myScanner){
        int numero=0;
        int numDigits=0;
        System.out.println();
        try {
            System.out.print("Ingresa un número entero:");
            numero= myScanner.nextInt();

            while( numero > 0){
                numero = numero/10;
                numDigits++;
            }
    
            System.out.println();
            System.out.println("El número ingresado tiene "+ numDigits + " digitos.");
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Debes ingresar un numero entero.");
            System.out.println();
        }

    
    }
}
