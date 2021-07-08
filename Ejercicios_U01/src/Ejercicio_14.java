import java.util.Scanner;

/*
14. Escribe un programa que lea una cantidad de grados centígrados 
    y la pase a grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)
*/

public class Ejercicio_14 {
    /*
    Programa para convertir una temperatura 
    en grados centígrados a grados Fahrenheit.
    */

    public static final Scanner entrada() {
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {
        System.out.println("Ingrese una temperatura en grados centígrados: ");
        Double temperaturaCentigrados = entrada().nextDouble();
        Double temperaturaFahrenheit = 32 + (9 * temperaturaCentigrados / 5);
        System.out.printf("\nLa conversión a grados Fahrenheit es: %1$s°F",temperaturaFahrenheit);
    }
}
