import java.util.Scanner;

public class Ejercicio_24 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.
       
    /*
    24. El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres.
    */

    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static void numeroMayor() {
        // Mensaje inicial por consola.
        System.out.println("--- Programa que solicita tres números y retorna cual de los tres es el mayor. ---");
        
        // Solicita tres números al usuario.
        System.out.print("\nIngrese el primer número: ");
        Double numeroUno = ENTRADA().nextDouble();

        System.out.print("Ingrese el segundo número: ");
        Double numeroDos = ENTRADA().nextDouble();

        System.out.print("Ingrese el tercer número: ");
        Double numeroTres = ENTRADA().nextDouble();

        // Condiciones para definir cual numero es mayor.
        if (numeroUno > numeroDos & numeroUno > numeroTres){
            System.out.printf("\n---> El Número %1$s es el mayor de los tres numeros ingresados.",numeroUno);
        }else if(numeroDos > numeroUno & numeroDos > numeroTres){
            System.out.printf("\n---> El Número %1$s es el mayor de los tres numeros ingresados.",numeroDos);
        }else if(numeroTres > numeroUno & numeroTres > numeroDos){
            System.out.printf("\n---> El Número %1$s es el mayor de los tres numeros ingresados.",numeroTres);
        }
    }

    public static void main(String[] args) {
        numeroMayor();
    }
}
