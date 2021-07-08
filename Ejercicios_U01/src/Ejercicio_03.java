import java.util.Scanner;

/*
03. Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.
*/

public class Ejercicio_03 {
    //Programa que calcule el sueldo de un trabajador
    
    public static final Scanner entrada() {
        //Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static Integer calcularSalario() {
        //Solicitar el numero de horas que ha trabajado en el mes
        System.out.println("Ingrese el numero de horas trabajadas en el mes: ");
        Integer horasTrabajadas = entrada().nextInt();
        
        //Multiplicar el numero de horas totales por el precio por hora.
        Integer Salario = horasTrabajadas * 30000; //Las horas se pagan a $30.000.

        return Salario;
    }
    public static void main(String[] args) {
        String mensajeFinal = String.format("El Salario del trabajador es de: $%1$s Pesos.", calcularSalario());
        System.out.println(mensajeFinal);
    }
}