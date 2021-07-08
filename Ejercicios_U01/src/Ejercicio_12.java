import java.util.Scanner;

/*
12. Implemente un algoritmo que reciba un número por
    teclado y cuente cuántas cifras (o dígitos) contiene e
    imprima el mensaje en consola.
*/

public class Ejercicio_12 {

    public static final Scanner entrada(){
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static String mensajeFinal(String numero, Integer contarDigitos) {
        return "\nEl numero " + numero + " tiene " + contarDigitos + " dígitos.";
    }
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para contar sus dígitos: ");
        String numero = entrada().nextLine();
        Integer contarDigitos = numero.length();
        System.out.println(mensajeFinal(numero,contarDigitos));
    }
}