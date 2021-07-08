import java.util.Scanner;

/*
04. Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.
*/

public class Ejercicio_04 {
    
    public static final Scanner entrada(){
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 10: "); //Solicitar un numero al usuario
        Integer numeroIngresado = entrada().nextInt(); //Captura del numero 

        //mostrar la tabla de multiplicar de ese numero del 0 al 10
        System.out.printf("\nLa tabla de multiplición del %1$s es: \n", numeroIngresado);
        for(int x = 0;x < 10; x++){
            Integer y = numeroIngresado * (x + 1);
            String enunciado = String.format("%1$s x %2$s = %3$s", numeroIngresado,(x+1),y);
            System.out.println(enunciado);
        }
    }
}