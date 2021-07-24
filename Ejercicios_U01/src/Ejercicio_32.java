import java.util.ArrayList;
import java.util.List;

public class Ejercicio_32 {

    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    32. Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E.
    */

    public static void contadorE() {

        //Colección de objetos de tipo Lista.
        List<Object> lista = new ArrayList<>();

        //Agrega a la lista los números del 1 al 9.
        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add("E"); // En vez del 3 se pone un String con la letra "E".
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);

        // Ciclo que recorerrá cada indice de la lista hasta llegar a 99999.
        for(Object uno : lista){
            for (Object dos : lista) {
                for (Object tres : lista) {
                    for (Object cuatro : lista) {
                        for (Object cinco : lista) {
                            System.out.print(uno);
                            System.out.print(dos);
                            System.out.print(tres);
                            System.out.print(cuatro);
                            System.out.println(cinco);
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
