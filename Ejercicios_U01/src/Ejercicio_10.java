import java.util.Scanner;

/*
10.Muestra la serie de fibonacci hasta un número pedido por teclado. Por
    ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
    1, 2, 3, 5, 8, 13, 21, 34, 55, 89.
*/

public class Ejercicio_10 {

    public static final Scanner entrada(){
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {
        System.out.println("Ingrese el numero que quiere aproximar:\n");
        Integer numeroIngresado = entrada().nextInt();

        Integer numeroUno = 0;
        Integer numeroDos = 1;
        Integer numeroTres = 0;

        while (numeroUno + numeroDos <= numeroIngresado){
            
            numeroTres = numeroUno;
            numeroUno = numeroDos;
            numeroDos = numeroTres + numeroUno;
            System.out.println(numeroDos);
        }
    }
}
