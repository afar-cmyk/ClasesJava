import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_22 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    22. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
    */

    public static final Scanner ENTRADA() {
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static void comprobarMayusculas() {
        // Solicita una letra por consola.
        System.out.println("Ingrese una letra: ");
        String letra = ENTRADA().nextLine();

        // Convierte la letra ingresada a char.
        char letraChar = letra.charAt(0);

        // Arreglo con todas las letras del abecedario en mayusculas
        char[] listaLetras = new char[26];
        for (int i = 0; i < 26; i++){
            listaLetras[i] = (char) (65 + i);
        }

        // Condicional para definir si la letra ingresada es mayusculas o minusculas.
        if (Arrays.binarySearch(listaLetras, letraChar) >= 0) {
            System.out.println("El caracter ingresado esta en mayusculas.");
        }else{
            System.out.println("El caracter ingresado esta en minusculas o es un simbolo.");
        }
    }

    public static void main(String[] args) {
        comprobarMayusculas();
    }
}
