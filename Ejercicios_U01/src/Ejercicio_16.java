import java.util.Scanner;

/*
16. Programa que pida por teclado la fecha de nacimiento de una persona 
    (día, mes, año) y calcule su número de la suerte.
    El número de la suerte se calcula sumando el día, mes y año de la fecha 
    de nacimiento y a continuación sumando las cifras obtenidas en la suma.
        Por ejemplo:
    Si la fecha de nacimiento es 12/07/1980 
    Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 
*/

//Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

public class Ejercicio_16 {

    public static final Scanner entrada(){
        //Objeto Scanner como metodo de nombre entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static int dia() {
        //Solicita el día de nacimiento.
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = entrada().nextInt();
        return dia;
    }

    public static int mes() {
        //Solicita el mes de nacimiento.
        System.out.println("Ingrese numero del mes de nacimiento: ");
        int mes = entrada().nextInt();
        return mes;
    }

    public static int anho() {
        //Solicita el año de nacimiento.
        System.out.println("Ingrese el año de nacimiento: ");
        int anho = entrada().nextInt();
        return anho;
    }

    public static String sumaFecha() {
        //Suma de los valores ingresados por el usuario
        int sumaFecha = dia() + mes() + anho();

        //el resultado es convertido a un cadena de caracteres.
        String sumaFechaString = Integer.toString(sumaFecha);
        return sumaFechaString;
    }

    public static Integer numeroSuerte() {
        //Calcula el numero de la suerte iterando por cada uno de los caracteres de la cadena sumaFecha()
        String cadenaFecha = sumaFecha();
        Integer numeroSuerte = 0;

        for ( int i = 0; i < cadenaFecha.length(); i++){
            numeroSuerte = numeroSuerte + Character.getNumericValue(cadenaFecha.charAt(i));
        }
        return numeroSuerte;
    }

    public static void mensajeFinal() {
        //Mensaje final
        System.out.printf("\n---> Su número de la suerte es: %1$s.",numeroSuerte());
    }

    public static void main(String[] args) {
        mensajeFinal();
    }
}