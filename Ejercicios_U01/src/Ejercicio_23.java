import java.util.Scanner;

public class Ejercicio_23 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.
       
    /*
    23. Programa que lea dos números por teclado y muestre el resultado de la división del primer número 
    por el segundo. Se debe comprobar que el divisor no puede ser cero.
    */

    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static void dividirDosNumeros() {
        // Mensaje inicial.
        System.out.println("--- Programa que dos números ---");

        // Solicita dos números al usuario.
        System.out.print("\nIngrese el primero numero: ");
        Double numeroUno = ENTRADA().nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        Double numeroDos = ENTRADA().nextDouble();

        Double division = numeroUno / numeroDos;

        if(numeroUno == 0 | numeroDos == 0){
            System.out.printf("\n---> ¡Error!, No se puede dividir sobre cero.");
        }else{
            System.out.printf("\nLa división entre %1$s y %2$s es: %3$s.",numeroUno,numeroDos,division); 
        }
    }

    public static void main(String[] args) {
        dividirDosNumeros();
    }
}
