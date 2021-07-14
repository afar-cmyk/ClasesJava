public class Ejercicio_27 {
    
    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    27. Realizar programa que muestre los números del 1 al 100 que no
    sean múltiplos de 3, utilizando cada una las instrucciones
    repetitivas (while, do while, for)
    */

    public static void condicionalFor() {
        // Estructura For.
        System.out.println("\n--- Números del 1 al 100 que no sean múltiplos de 3 con estructura 'For' ---\n");
        for (int i = 0; i < 100; i++){

            if (! (i % 3 == 0) ){
                System.out.println(i);
            }

        }
        
    }

    public static void estructuraWhile() {
        // Estructura While.
        System.out.println("\n--- Números del 1 al 100 que no sean múltiplos de 3 con estructura 'While' ---\n");
        int i = 0;
        while(i < 101){

            i  += 1;
            if (! (i % 3 == 0) ){
                System.out.println(i);
            }
        }
    }

    public static void estructuraDoWhile() {
        // Estructura Do While.
        System.out.println("\n--- Números del 1 al 100 que no sean múltiplos de 3 con estructura 'Do While' ---\n");
        int i = 0;
        do{
            i  += 1;
            if (! (i % 3 == 0) ){
                System.out.println(i);
            }
        }while(i < 100);
    }

    public static void main(String[] args) {
        condicionalFor();
        estructuraWhile();
        estructuraDoWhile();
    }
}
