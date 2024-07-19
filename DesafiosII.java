import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class DesafiosII {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        generandoContraseña(myScanner);
        // estadisticasDeCalificaciones(myScanner);
        // fibonacci(myScanner);
        // numerosPrimos(myScanner);
        myScanner.close();
    }

    private static void generandoContraseña(Scanner myScanner) {
        int passLength, asciiValue;
        int numUppercaseLetters, numLowercaseLetters, numDigits;
        boolean rightPass = false;
        char charater;

        System.out.println();
        System.out.println("Actividad: generando contraseña.");
        System.out.println();

        try {
            System.out.print("Ingresa un número entero para la longitud de la contraseña:");

            passLength = myScanner.nextInt();// posible excepción

            // se instancia un arreglo
            char[] passArr = new char[passLength];

            do {
                // se inicializa variables
                numUppercaseLetters = 0;
                numLowercaseLetters = 0;
                numDigits = 0;
                int i = 0;
                // se genera la contraseña
                while (i < passLength) {
                    // se defienen el rango de numero ascii a emplear
                    int min = 35;
                    int max = 122;

                    // se obtiene un numero ascii aleatorio
                    asciiValue = (int) (Math.random() * (max - min) + 1) + min;
                    // se convierte a caracter
                    charater = (char) (asciiValue);

                    // se actualiza la cantidad de letras mayusculas
                    if (Character.isUpperCase(charater)) {
                        numUppercaseLetters++;
                    }
                    // se actualiza la cantidad de letras minúsculas
                    if (Character.isLowerCase(charater)) {
                        numLowercaseLetters++;
                    }
                    // se actualiza la cantidad de dígitos
                    if (Character.isDigit(charater)) {
                        numDigits++;
                    }

                    // se guarda en el arreglo en el índice i
                    passArr[i] = charater;
                    // se aumenta en índice en 1;
                    i++;
                }
                // Se veririca si se ha generado un contraseña correcta
                if (numDigits > 0 && numLowercaseLetters > 0 && numUppercaseLetters > 0) {

                    rightPass = true; // fundamental actualizar condición para salida de doWhile

                    String password = new String(passArr);
                    
                    System.out.println();
                    System.out.println("La contraseña generada es:" + password);
                    System.out.println();
                }

            } while (!rightPass);

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: debes ingresar un numero entero para la longitud de la contraseña.");
            System.out.println();
        }


    }

    private static void estadisticasDeCalificaciones(Scanner myScanner) {
        int arrLength;
        int grade;
        String stringGrade;
        int arrLenDesa, arrLenAprob, arrLenExel;
        double notaDouble, sumaDesaprobados, sumaAprobados, sumaExelentes, sumaArr;
        int j;

        System.out.println();
        System.out.println("Actividad:Estadísticas de calificaciones");
        System.out.println();

        try {
            System.out.print("Ingrese un número entero como la cantidad de calificaciones:");
            arrLength = myScanner.nextInt();

            // se crea un arreglo de cadenas de longitud ingresada
            String[] grades = new String[arrLength];

            // se llena el arreglo con notas aleatorias

            for (int i = 0; i < arrLength; i++) {
                // se obtiene una calificación entera entre 0 y 10 (incluido)
                grade = (int) (Math.random() * 11);
                // se convierte a un cadena la calicación
                stringGrade = String.valueOf(grade);
                // se guarda en la nota como cadena en el índice respectivo
                grades[i] = stringGrade;
            }

            // se crean 3 nuevos arreglos
            arrLenDesa = 0;
            arrLenAprob = 0;
            arrLenExel = 0;

            // se obtiene las longitudes de cada uno de los arreglos y suma
            sumaArr = 0;
            for (String notaString : grades) {
                notaDouble = Double.valueOf(notaString);
                sumaArr += notaDouble;

                if (notaDouble < 4) {
                    arrLenDesa++;
                }
                if (notaDouble >= 4 && notaDouble < 10) {
                    arrLenAprob++;
                }
                if (notaDouble >= 10) {
                    arrLenExel++;
                }
            }

            // se crean los arreglos:
            double[] arrDesa = new double[arrLenDesa];
            double[] arrApro = new double[arrLenAprob];
            double[] arrExel = new double[arrLenExel];

            // se llena el arreglo de desaprobados.
            j = 0;
            sumaDesaprobados = 0;
            for (String notaString : grades) {
                notaDouble = Double.valueOf(notaString);
                if (notaDouble < 4) {
                    arrDesa[j] = notaDouble;
                    sumaDesaprobados += notaDouble;
                    j++;
                }
            }

            // se llena el arreglo de aprobados.
            j = 0;
            sumaAprobados = 0;
            for (String notaString : grades) {
                notaDouble = Double.valueOf(notaString);
                if (notaDouble >= 4 && notaDouble < 10) {
                    arrApro[j] = notaDouble;
                    sumaAprobados += notaDouble;
                    j++;
                }
            }

            // se llena el arreglo de execelentes.
            j = 0;
            sumaExelentes = 0;
            for (String notaString : grades) {
                notaDouble = Double.valueOf(notaString);
                if (notaDouble >= 10) {
                    arrExel[j] = notaDouble;
                    sumaExelentes += notaDouble;
                    j++;
                }
            }

            System.out.println();

            // Impresion de arreglos

            // Se imprime el arreglo orifinal
            System.out.println();
            System.out.print("Notas:");
            System.out.println(Arrays.toString(grades));
            if (arrLength > 0) {
                System.out.println("Promedio:  " + (sumaArr / arrLength));
            }
            System.out.println();
            System.out.print("Desaprobados:");
            System.out.println(Arrays.toString(arrDesa));
            if (arrLenDesa > 0) {
                System.out.println("Promedio: " + sumaDesaprobados / arrLenDesa);
            }

            System.out.println();
            System.out.print("Aprobados:");
            System.out.println(Arrays.toString(arrApro));
            if (arrLenAprob > 0) {
                System.out.println("Promedio: " + sumaAprobados / arrLenAprob);
            }
            System.out.println();

            System.out.print("Excelentes:");
            System.out.println(Arrays.toString(arrExel));
            if (arrLenExel > 0) {
                System.out.println("Promedio: " + sumaExelentes / arrLenExel);
            }
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: debes ingresar un numero entero como cantidad de calificaciones");
            System.out.println();
        } catch (Exception e) {
            System.out.println();
            System.out.println(e);
            System.out.println();
        }
    }

    private static void fibonacci(Scanner myScanner) {
        int number;

        System.out.println();
        System.out.println("Actividad: generando serie fibonacci.");
        System.out.println();

        try {
            System.out.print("Ingresa la cantidad de numeros en la serie fibonacci que deseas generar:");

            number = myScanner.nextInt();

            if (number > 0) {

                int[] fibonacci = new int[number];

                if (number == 1) {
                    fibonacci[0] = 0;
                }
                if (number == 2) {
                    fibonacci[0] = 0;
                    fibonacci[1] = 1;
                }

                if (number > 2) {
                    fibonacci[0] = 0;
                    fibonacci[1] = 1;
                    for (int i = 2; i < number; i++) {
                        fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
                    }
                }

                System.out.println();
                System.out.println("Los primeros " + number + " numeros de la serie fibonacci son:");
                for (int i : fibonacci) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.println();
                System.out.println("Debes ingresar un número entero mayor a 0");
                System.out.println();
            }

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: debes ingresar un numero entero.");
            System.out.println();
        }
    }

    private static void numerosPrimos(Scanner myScanner) {
        int number = 0;
        int numDivisors;

        System.out.println();
        System.out.println("Actividad: Números primos");
        System.out.println();

        do {

            try {

                System.out.print("Ingresa un número entero para verificar si es primo:");
                number = myScanner.nextInt();

                if (number > 1) {
                    numDivisors = 0;
                    // se obtiene la cantidad de divisores;
                    for (int i = number; i > 0; i--) {
                        if (number % i == 0) {
                            numDivisors++;
                        }
                    }

                    if (numDivisors == 2) {
                        System.out.println("El numero ingresado es primo.");
                        System.out.println();
                    } else {
                        System.out.println("El numero ingresado no es primo.");
                        System.out.println();
                    }

                } else {
                    System.out.println("El numero ingresado no es un número primo");
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Ingresa un numero entero.");
                System.out.println();
            }

        } while (number != 0);
    }
}
