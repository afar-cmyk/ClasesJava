import java.util.Scanner;

public class Ejercicio_20 {
   
    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    20. Programa que lea la longitud de los catetos de un triángulo rectángulo y
        calcule la longitud de la hipotenusa según el teorema de Pitágoras.
    */

    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static int hipotenusa() {
        // Solicita las longitudes de los catetos
        System.out.print("Ingrese la longitud del primer cateto: ");
        Double catetoA = ENTRADA().nextDouble();
        System.out.print("Ingrese la longitud del segundo cateto: ");
        Double catetoB = ENTRADA().nextDouble();

        // Formula para calcular la hipotenusa
        double hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));

        // Conversión de los valores a integer.
        int hipotenusaInt = (int) hipotenusa; 
        return hipotenusaInt;
    }

    public static void mensajeFinal() {
        // Mensaje final de la operación por consola.
        System.out.printf("\n---> El valor redondeado de la hipotenusa es de: %1$s.", hipotenusa());        
    }

    public static void main(String[] args) {
        mensajeFinal();
    }
}
