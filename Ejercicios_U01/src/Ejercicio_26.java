import java.util.Scanner;

public class Ejercicio_26 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    26. Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, 
    de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. 
    Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
    */

    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    static void nuevo() {
        // Solicita el mes que desea analizar.
        System.out.print("\nIngrese el numero que corresponde al mes (1 - 12): ");
        int numeroEntrada = ENTRADA().nextInt();

        // Guarda en una lista de cadenas los nombres de los 12 meses.
        String listaMeses[] = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
        };
        
        // Retorna por consola el nombre del mes correspondiente al numero ingresado 
        // Informa el numero de días del mes. 
        System.out.println("\nEl mes " + listaMeses[numeroEntrada-1]+ "," + " es un mes de: " + (numeroEntrada == 2 ? "28" : "31" ) + " días." );

    }

    public static void main(String[] args) {
        nuevo();
    }
}
