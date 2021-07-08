/*
05. Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
    adivinar introduciendo el número por teclado. En el caso que el número a
    adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
    mayor”, de lo contrario, “El número que busca es menor”. El programa
    finalizará cuando se introduzca el número correcto. Nota: usar la clase
    Random para generar el número aleatorio.
*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_05 {

    public static final Scanner entrada(){
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {
        //Genera un numero aleatorio entre el 1 y el 100
        Random numeroAzar = new Random();
        Integer numero = numeroAzar.nextInt(100 - 1);
        
        System.out.println("A continuacion debe de adivinar un numero entre el 1 y el 100.\n");

        //Define variable para el numero que sera ingresado
        Integer numIngresado = 0; 

        //Loop infinito mientras el numero ingresado no sea igual al numero al azar
        do{
            System.out.println("Ingrese un numero entre el 1 y el 100: ");
            numIngresado = entrada().nextInt();

            if(numIngresado > numero){
                System.out.println("\n----> El número que busca es menor\n");
            }else{
                System.out.println("\n----> El número que busca es Mayor\n");
            }    
        }while(numIngresado != numero);

        //Respuesta final al adivinar el numero
        System.out.printf("Muy bien!, el número era: %1$s.",numero);
    }
}