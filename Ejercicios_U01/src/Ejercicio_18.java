import java.util.Scanner;

public class Ejercicio_18 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    18. Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras.
        Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.
    */
    
    public static final Scanner ENTRADA(){
        //Objeto Scanner llamado entrada.
        Scanner entrada = new Scanner (System.in);
        return entrada;
    }

    public static String numero() {
        //Explica el fincionamiento del programa y solicita un primer número.
        System.out.print("\tPrograma que recibe dos numeros a y b,\nen donde b es el numero de digitos que desea remover de a.\n"); 
        System.out.print("\n1. Ingrese un numero entero(a): "); 
        Integer numero = ENTRADA().nextInt();
        String numeroString = Integer.toString(numero);//Convierte el número ingresado a String.
        return numeroString;
    }

    public static int numResta() {
        //Solicita el segundo número.
        System.out.print("2. Ingrese un numero entero (b): ");
        Integer numResta = ENTRADA().nextInt();
        return numResta;
    }

    public static String numeroFinal() {
        //Logica del programa.

        //Se guardan los valores solicitados en variables
        String numero = numero(); 
        Integer resta = numResta();

        //Se resta en el index del String el largo del numero menos el segundo numero ingresado.
        String nFinal = numero.substring(0, numero.length()-resta);
        return nFinal;
    }

    public static void mensajeFinal(){
        //Mensaje final por consola con el resultado de la operación.
        System.out.printf("\n---> El resultado es: %1$s.",numeroFinal());
    }

    public static void main(String[] args) {
        mensajeFinal();
    } 
}
