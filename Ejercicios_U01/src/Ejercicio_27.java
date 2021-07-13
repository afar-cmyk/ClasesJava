public class Ejercicio_27 {
    
    //Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

    /*
    27. Realizar programa que muestre los números del 1 al 100 que no
    sean múltiplos de 3, utilizando cada una las instrucciones
    repetitivas (while, do while, for)
    */

    public static void condicionalFor() {

        for (int i = 0; i < 100; i++){

            if (! (i % 3 == 0) ){
                System.out.println(i);
            }

        }
        
    }

    public static void estructuraWhile() {

        int i = 0;
        while(i < 101){
            System.out.println((! (i % 3 == 0) ));
            i  += 1; 
        }
        
    }

    public static void main(String[] args) {

        estructuraWhile();

    }

}
