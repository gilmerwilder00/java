import java.util.Scanner;

public class Calificacion {

    private static final int VALOR_INICIAL = 0;
    private static final int VALOR_FINAL = 100;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        imprimirMensaje(myScanner);
        
        myScanner.close();
    }


    private static void imprimirMensaje(Scanner  myScanner){
        System.out.print("Ingrese un número entre 0 y 100:");
        float puntuacion = myScanner.nextFloat();

        if (puntuacion > VALOR_INICIAL && puntuacion < VALOR_FINAL) {
           imprimirCasos(puntuacion);
        } else {
            System.out.println("El número ingresado esta fuera del rango válido.");
        }
    }


    private static void imprimirCasos(float puntuacion){
            if (puntuacion >= 90) {
                System.out.println("Su puntuación es A");
            }else if (puntuacion >= 80) {
                System.out.println("Su puntuación es B");
            } else  if (puntuacion >= 70) {
                System.out.println("Su puntuación es C");
            } else if (puntuacion >= 60) {
                System.out.println("Su puntuación es D");
            } else {
                System.out.println("Su puntuacion es F");
            }
    }

}
