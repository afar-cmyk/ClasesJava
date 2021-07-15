import java.util.Scanner;

public class Ejercicio_29 {
    
    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    29. Mostrar los N primeros términos de la serie de Fibonacci.
    */
  
    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static void primerosFibonacci() {
        // Mensaje inicial
        System.out.print("\n--- Programa que imprime la cantidad ingresada de números de la serie de fibonacci ---\n");

        // Solicita un número.
        System.out.print("\nIngrese la cantidad de números que desea generar: ");
        int numeroIngresado = ENTRADA().nextInt();

        // Variables iniciales
        Integer numeroUno = 0;
        Integer numeroDos = 1;
        Integer numeroTres = 0;

        // Imprime la cantidad ingresada antes de imprimir la serie de fibonacci.
        System.out.printf("Los primeros %1$s números de la serie de fibonacci son:",numeroIngresado);

        for (int i = 0; i < numeroIngresado; i++) {

            // Imprime en pantalla la secuencia de números concatenada por espacios.
            System.out.print(" " + numeroUno + " ");

            // Secuencia de fibonacci
            numeroTres = numeroUno + numeroDos;
            numeroUno = numeroDos;
            numeroDos = numeroTres;
        }
    }

    public static void main(String[] args) {
        primerosFibonacci();
    }
}
