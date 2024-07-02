import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto (en $):");
        float precio = myScanner.nextFloat();
        if(precio>=100){
            float precioDescuento = precio*(1f-0.1f);
            System.out.println("El precio final es  $." + precioDescuento);
        }else{
            System.out.println("El precio final es $.: " +  precio);
        }

        myScanner.close();
    }
}
