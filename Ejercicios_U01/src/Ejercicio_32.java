public class Ejercicio_32 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    32. Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E.
    */

    public static void contadorE() {

        // Arreglo de enteros con los números del 1 al 9.
        int[] prueba = {0,1,2,3,4,5,6,7,8,9};
        // Variable que contiene la palabra E, para reemplazar el numero 3.
        String palabra = "E";

        // Ciclo que recorerrá cada indice del arreglo de enteros
        for (int uno = 0; uno <= 9; uno++) { 
            for (int dos = 0; dos <= 9; dos++) {
                for (int tres = 0; tres <= 9; tres++) {
                    for (int cuatro = 0; cuatro <= 9; cuatro++) {
                        for (int cinco = 0; cinco <= 9; cinco++) {

                            // Cuando el iterador sea igual a tres imprimirá la variable que contene la E.
                             System.out.print(prueba[uno] == 3 ? palabra : prueba[uno]);
                             System.out.print(prueba[dos] == 3 ? palabra : prueba[dos]);
                             System.out.print(prueba[tres] == 3 ? palabra : prueba[tres]);
                             System.out.print(prueba[cuatro] == 3 ? palabra : prueba[cuatro]);
                             System.out.println(prueba[cinco] == 3 ? palabra : prueba[cinco]);                                           
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        contadorE();
    }
}
