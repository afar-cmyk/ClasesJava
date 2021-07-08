import java.util.Scanner;

/*
15. Escribe un programa java que lea una variable de tipo entero y asígnale un valor. 
    A continuación muestra un mensaje indicando si la variable es par o impar.
    Utiliza el operador condicional ( ? : ) para resolverlo.
    Ej: “14 es par” o “15 es impar”
*/

public class Ejercicio_15 {

    public static final Scanner entrada() {
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero: ");
        Integer numero = entrada().nextInt();
        System.out.println("\nEl número " + numero + " es " + (numero % 2 == 0 ? "par." : "impar."));
    }
}