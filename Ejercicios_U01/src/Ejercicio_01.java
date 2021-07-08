import java.util.Scanner;

/*
01. Realizar la suma, la resta, la división y 
    la multiplicación de dos números leídos por teclado y 
    mostrar en pantalla “La <operación> de <número 1>
    y <número 2> es igual a <resultado> ”.
*/

public class Ejercicio_01 {
    
    public static Scanner entrada() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    public static int numUno() {
        System.out.println("Ingrese el primer número: ");
        int numeroUno = entrada().nextInt();
        return numeroUno;
    }

    public static int numDos() {
        System.out.println("Ingrese el segundo número: ");
        int numeroDos = entrada().nextInt();
        return numeroDos;
    }

    public static String operaciones(int numUno, int numDos){
        int resSuma = numUno + numDos; //Suma
        int resRest = numUno - numDos; //Resta
        int resMult = numUno * numDos; //Multiplicación
        int resDivi = numUno / numDos; //División
        String resFinal = String.format("\nLa Suma de %1$s y %2$s es igual a %3$s.\nLa Resta de %1$s y %2$s es igual a %4$s.\nLa Multiplicación de %1$s y %2$s es igual a %5$s.\nLa División de %1$s y %2$s es igual a %6$s.", numUno,numDos,resSuma,resRest,resMult,resDivi);
        return resFinal;
    }
    public static void main(String[] args) {
        System.out.println(operaciones(numUno(), numDos()));
    }
}