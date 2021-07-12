import java.util.Scanner;

public class Ejercicio_19 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    19. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee porteclado.
    */
    
    public static final Scanner ENTRADA(){
        //Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static Double conversion() {
        //Solicita la velocidad en KM/h
        System.out.println("Ingrese la velocidad en Km/h: ");
        Double velocidadKxmh = ENTRADA().nextDouble(); //Guarda la velocidad en tipo Double.
        Double conversion = velocidadKxmh * 0.2778; //Formula de conversión.
        return conversion;
    }

    public static void mensajeFinal(){
        double resultado = conversion(); //Guarda el resultado en una variable de tipo double.
        int resultadoFinal = (int) resultado; //Convierte el resultado a Integer

        //Mensaje por consola con el resultado final.
        System.out.printf("\n---> El resultado es: %1$s m/s.",resultadoFinal);
    }

    public static void main(String[] args) {
        mensajeFinal();
    }
}