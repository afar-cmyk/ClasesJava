import java.util.Scanner;

/*
09. Pide por teclado el nombre, edad y salario y muestra el salario
    - Si es menor de 16 no tiene edad para trabajar
    - Entre 19 y 50 años el salario es un 5 por ciento más
    - Entre 51 y 60 años el salario es un 10 por ciento más
    - Si es mayor de 60 el salario es un 15 por ciento más
*/

public class Ejercicio_09 {
    
    public static final Scanner entrada(){
        //Define metodo entrada de tipo Scanner
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {

        //Solicita los datos al usuario
        System.out.println("Ingrese su nombre: "); //Solicita Nombre
        String nombre = entrada().nextLine();

        System.out.println("Ingrese su edad: "); //Solicita Edad
        Integer edad = entrada().nextInt();

        System.out.println("Ingrese su salario: "); //Solicita Salario
        Integer salario = entrada().nextInt();

        //Condicionales de salario correspondientes a la edad ingresada
        if(edad <= 16){
            // No se puede calcular en esa edad
            System.out.println("Error! Usted no tiene la edad suficiente para trabajar.");
            
        }else if(edad >= 17 && edad <= 18){
            // El salario es el mismo en este rango de edad
            System.out.printf("%1$s, el salario correspondiente a su edad es de: %2$s",nombre,salario);

        }else if(edad >= 19 && edad <= 50){
            //El salario se incrementa en un 5%
            Integer nuevoSalario = ((salario / 100) * 5) + salario;
            System.out.printf("%1$s, el salario correspondiente a su edad es de: %2$s",nombre,nuevoSalario);

        }else if(edad >= 51 && edad <= 60){
            //El salario se incrementa en un 10%
            Integer nuevoSalario = ((salario / 100) * 10) + salario;
            System.out.printf("%1$s, el salario correspondiente a su edad es de: %2$s",nombre,nuevoSalario);

        }else if(edad > 60){
            //El salario se incrementa en un 15%
            Integer nuevoSalario = ((salario / 100) * 15) + salario;
            System.out.printf("%1$s, el salario correspondiente a su edad es de: %2$s",nombre,nuevoSalario);
        }
    }
}
