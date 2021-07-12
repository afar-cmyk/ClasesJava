import java.util.Scanner;

public class Ejercicio_21 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.
       
    /*
    21. Programa que lea un número entero y muestre si el número es múltiplo de 10.
    */

    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner (System.in);
        return entrada;
    }

    public static void calculos() {
        // Informa el funcionamiento del programa.
        System.out.println("\n--- Programa que determina si el numero ingresado es multiplo de 10. ---");
        
        // Solicita un numero entero por consola.
        System.out.println("\nIngrese un numero entero: ");
        int numero = ENTRADA().nextInt();

        // Operador condicional ternario que indica si es multiplo de 10 o no.
        System.out.println("\nEl número " + numero + (numero % 10 == 0 ? " Sí es" : " No es") + " multiplo de 10.");
    }

    public static void main(String[] args) {
        calculos();
    }
}