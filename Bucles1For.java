public class Bucles1For {
    public static void main(String[] args) {
        imprimiendoElementos();
        encontrarValorMinimo();
        imprimiendoEnOrdenInverso();
        invirtiendoArreglo();
        calcularSumaAcumulada();
    }

    private static void imprimiendoElementos(){
        int[] numeros = {9,2,3,4,5};

        System.out.println();
        for(int i=0; i<numeros.length; i++){
            System.out.println("El elemento "+ i + " del arreglo es: "+ numeros[i]);
        }
        System.out.println();
    }

    private static void encontrarValorMinimo(){
        int[] numeros = {9,2,3,4,5};
        int minimo = numeros[0];

        System.out.println();
        for(int i=1; i<numeros.length; i++){
           if(numeros[i]<minimo){
            minimo = numeros[i];
           }
        }
        System.out.println("El numero minimo del arreglo es: " + minimo);
        System.out.println();
    }

    private static void imprimiendoEnOrdenInverso(){
        int[] numeros = {9,2,3,4,5};

        System.out.println();
        for(int i=numeros.length-1; i>=0; i--){
            System.out.println("El elemento "+ i + " del arreglo es: "+ numeros[i]);
        }
        System.out.println();
    }

    private static void invirtiendoArreglo(){
        int[] numeros = {9,2,3,4,5};
        int[] numeroAux = new int[numeros.length];

        System.out.println();
        for(int i=0; i<numeros.length; i++){
           numeroAux[numeros.length-1-i] = numeros[i];             
        }

        System.out.print("Arreglo original: ");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.print("Arreglo invertido: ");
        for (int i=0; i<numeroAux.length; i++) {
            System.out.print(numeroAux[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void calcularSumaAcumulada(){
        int[] numeros = {9,2,3,4,5};
        int suma=0;

        System.out.println();
        for(int i=0; i<numeros.length; i++){
            suma+= numeros[i];
        }
        System.out.println("La suma total es: " + suma);
        System.out.println();
    }
}
