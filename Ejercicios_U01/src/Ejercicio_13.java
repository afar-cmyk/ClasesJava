import java.util.Scanner;
import java.lang.Math;

/*
13. Escribe un programa Java que lee un número entero por teclado y obtiene y
    muestra por pantalla el doble y el triple de ese número.
*/

public class Ejercicio_13 {
    
    public static final Scanner entrada(){
        //Metodo para iniciar el objeto Scanner llamado entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {
        //Solicita un número entero al usuario por consola.
        System.out.println("\nIngrese un número entero: ");
        Integer numero = entrada().nextInt(); //Guarda el entero en una variable llamada numero

        //Operaciones sobre el numero entero ingresador
        Integer numeroDoble = numero * numero; //numero al cuadrado
        Integer numeroTriple = (int) Math.pow(numero, 3); //numero al cubo con el metodo Math.pow()

        //Resultado final impreso por consola
        System.out.printf("\nEl doble de %1$s es: %2$s.\nEl triple de %1$s es: %3$s.\n",numero,numeroDoble,numeroTriple);
    }
}