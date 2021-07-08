import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
02. Realizar un programa que realice el promedio de las notas de un alumno,
    para ello el programa va a tener que solicitar el nombre del alumno y las
    notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
    3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
    “Reprobado” . Requisitos: Las notas que se ingresan pueden tener
    decimales.
*/

public class Ejercicio_02 {

    public static Scanner entrada() {
        //Scanner    
        Scanner entr = new Scanner(System.in);
        return entr;
    }
    
public static String calcPromedio() {
    System.out.println("Ingrese el nombre del Alumno: ");
    String nombre = entrada().nextLine();

    System.out.println("Ingrese la pimer nota: ");
    double notaUno = entrada().nextDouble();

    System.out.println("Ingrese la segunda nota: ");
    double notaDos = entrada().nextDouble();

    System.out.println("Ingrese la tercera nota: ");
    double notaTres = entrada().nextDouble();

    double prom = (notaUno + notaDos + notaTres) / 3;

    Double bd = new BigDecimal(String.valueOf(prom)).setScale(2,RoundingMode.HALF_UP).doubleValue();

    String aprobado = "Aprobado";
    String reprobado = "Reprobado";
    String resAprob = String.format("El promedio de las notas de %1$s es de %2$s y su estado es: %3$s.",nombre,bd,aprobado);
    String resRepro = String.format("El promedio de las notas de %1$s es de %2$s y su estado es: %3$s.",nombre,bd,reprobado);
    
    if (prom >= 3.0){
        return resAprob;
    }else{
        return resRepro;
    }
}
public static void main(String[] args) {
    System.out.println(calcPromedio());
}
}
