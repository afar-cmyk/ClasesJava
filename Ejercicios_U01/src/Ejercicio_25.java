import java.util.Scanner;

public class Ejercicio_25 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.
       
    /*
    25. Programa que lea por teclado tres números enteros H, M, S correspondientes a 
    hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
    */

    public static final Scanner ENTRADA() {
        // Objeto Scanner llamado Entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static int horaMil() {
        // Mensaje inicial.
        System.out.println("--- Programa que recibe tres valores e identifica si es una hora valida ---\n");

        // Solicita la hora en formato militar.
        System.out.print("Ingrese la hora en formato militar (24h): ");
        int horaMil = ENTRADA().nextInt();
        return horaMil;
    }

    public static int horaPM(int horaMilitar) {
        // Convierte la hora en formato Militar a formato Standard.
        int horaMil = horaMilitar;
        int horaPM = 0;
        
        if (horaMil > 12){
            horaPM = horaMil - 12;
        }else if (horaMil == 0){
            horaPM = 12;
        }else{
            horaPM = horaMil;
        }
        return horaPM;
    }

    public static int minutos() {
        //Solicita ingresar los minutos.
        System.out.print("Ingrese el valor que corresponde a minutos (59m): ");
        int ingresoMinutos = ENTRADA().nextInt();
        return ingresoMinutos;

    }

    public static int segundos() {
        //Solicita ingresar los segundos.
        System.out.print("Ingrese el valor que corresponde a segundos (59s): ");
        int ingresoSegundos = ENTRADA().nextInt();
        return ingresoSegundos;
    }

    public static void operacion() {
        // Guarda en variables los valores ingresados.
        int entradaH = horaMil();
        int entradaM = minutos();
        int entradaS = segundos();
        int horaPM = horaPM(entradaH);

        // Comprueba si los valores ingresados son inválidos.
        int error = 0;

        //Mensaje de comprobación.
        System.out.println("\n--- Comprobación de los valores ingresados ---");

        //Validación de los valores ingresados.
        if (entradaH >= 0 & entradaH <= 24){
            System.out.println("Hora ingresada: --->Valida.");
        }else if (entradaH < 0 | entradaH > 24){
            System.out.println("Hora ingresada: --->Invalida.");
            error = error + 1;
        }

        if (entradaM >= 0 & entradaM <= 59){
            System.out.println("Minutos ingresados: --->Validos.");
        }else if (entradaM < 0 | entradaM > 59){
            System.out.println("Minutos ingresados: --->Inválidos.");
            error = error + 1;
        }

        if (entradaS >= 0 & entradaS <= 59){
            System.out.println("Segundos ingresados: --->Validos.");
        }else if (entradaS < 0 | entradaS > 59){
            System.out.println("Segundos ingresados: --->Inválidos.");
            error = error + 1;
        }
        System.out.println("----------------------------------------------");

        // Mensaje final de acuerdo a el informe de errores.
        if (error > 0){
            System.out.println("\nValores ingresados inválidos, ingrese los valores de nuevo.");
        }else {
            // Devuelve la hora en formato Standard e indica si es AM. o PM.
            System.out.printf("\nLa hora ingresada es: %1$s Horas : %2$s Minutos : %3$s Segundos "+(entradaH > 12 ? "PM." : "AM."),horaPM,entradaM,entradaS);
        }
    }

    public static void main(String[] args) {
        operacion();
    } 
}
