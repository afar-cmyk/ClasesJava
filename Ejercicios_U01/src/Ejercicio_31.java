

public class Ejercicio_31 {
    
    // Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    31. Programa que muestre en líneas separadas lo siguiente:
    ZYWXVUTSRQPONMLKJIHGFEDCBA
    YWXVUTSRQPONMLKJIHGFEDCBA
    WXVUTSRQPONMLKJIHGFEDCBA
    ....
    DCBA
    CBA
    BA
    A.
    */

    public static void iterarCadena() {
        // Cadena de caracteres ingresada.
        String cadena = "ZYWXVUTSRQPONMLKJIHGFEDCBA";

        // Numero que iterará sobre la cadena de caracteres.
        int iterador = 0;

        // Agrega un salto de linea antes de imprimir la cadena de caracteres.
        System.out.println(" ");

        // Ciclo que se repetira sobre el tamaño de la cadena de caracteres.
        for (int i = 0; i < cadena.length(); i++) {

            // Imprime por consola el estado actual de la cadena
            System.out.println(cadena.substring(iterador, cadena.length()));

            // Añade 1 al contador que iterará sobre la cadena
            iterador += 1;
        }
    }

    public static void main(String[] args) {
        iterarCadena();
    }
}
