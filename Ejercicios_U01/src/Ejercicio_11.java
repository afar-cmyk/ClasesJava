/*
11. Implemente un algoritmo que dado un
    nombre en una variable de tipo cadena,
    imprima un saludo en consola
*/

public class Ejercicio_11{
    public static void main(String[] args) {
        String nombre = "Carlos";
        System.out.printf(saludoConsola(nombre),nombre);
    }

    public static String saludoConsola(String nombre){
        return "Buenos días %1$s.";
    }
}