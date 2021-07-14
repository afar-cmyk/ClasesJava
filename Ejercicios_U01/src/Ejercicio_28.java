import java.util.Scanner;

public class Ejercicio_28 {
    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    28. Programa que pase de pesos a dólares y viceversa.
    */

    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static void conversionDivisas() {
        // Mensaje inicial.
        System.out.println("\nPrograma para convertir Divisas: \n1. Convertir de Dolares a Pesos Colombianos.\n2. Convertir de Pesos Colombianos a Dolares.");

        // Solicita seleccionar el numero de la operación.
        System.out.print("\nIngrese el numero que corresponde a la conversion que desea realizar:");
        Integer solicitud = ENTRADA().nextInt();

        // Condicional respectivo al numero ingresado.
        if (solicitud == 1) {
            // Solicita el valor que desea convertir.
            System.out.print("\nIngrese el monto que desea convertir (USD -> Cop):");
            double valorIngresado = ENTRADA().nextDouble(); // Guarda el valor en una variable.
            double dolaresAPesos = valorIngresado * 3797.97; // Formula de conversion.
            System.out.println(dolaresAPesos + " COP."); // Imprime en consola el monto en Pesos Colombianos.

        } else if(solicitud == 2) {
            // Solicita el valor que desea convertir.
            System.out.print("\nIngrese el monto que desea convertir (Cop -> USD):");
            double valorIngresado = ENTRADA().nextDouble(); // Guarda el valor en una variable.
            double pesosADolares = valorIngresado * 0.000260;  // Formula de conversion.
            System.out.println(pesosADolares + " USD.");// Imprime en consola el monto en Dolares.
        }
    }

    public static void main(String[] args) {
        conversionDivisas();
    }
}
