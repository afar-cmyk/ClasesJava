import java.util.Scanner;

public class Ejercicio_30 {
    
    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    30. Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.
    */

    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static void factorial() {
        // Solicita un número por consola
        System.out.print("Ingrese un número para conocer su factorial: ");
        int entrada = ENTRADA().nextInt();

        // Guarda el resultado de la operación
        int numIngresado = entrada;
        double iterador = 1;

        // Se realiza un ciclo de multiplicación desde el número ingresado hasta 1
        while(numIngresado > 0){

            // Multiplica el estado del iterador por el numero ingresado
            iterador = iterador * numIngresado;

            // Reduce en 1 el estado del iterador
            numIngresado = numIngresado - 1;
        }
        System.out.printf("\n ---> El factorial del número %d es: %.0f.", entrada,iterador);
    }

    public static void main(String[] args) {
        factorial();
    }
}
