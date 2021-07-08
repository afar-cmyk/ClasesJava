import java.util.Scanner;

/*
08. Realizar un programa que permita controlar el juego de piedra, papel, tijera
    introduciendo P para piedra, L para papel y T para tijera por cada jugador.
    El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
    de cada ronda preguntar si desea volver a jugar.

    p > t
    l > p
    t > l

    p = 5
    l = 7
    t = 8

    Jugador 1
    15 - 8 = -3
    17 - 5 = 2
    18 - 7 = 1

    Jugador 2
    8 - 5 = 3
    5 - 7 = -2
    7 - 8 = -1

*/

public class Ejercicio_08 {

    public static final Scanner entrada(){
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {
        
        String confirmacion = ""; //Declara la variable de repetición vacia

        do{

            //Solicita al jugador 1 ingresar piedra, papel, o tijera
            System.out.println("(Jugador 1): Piedra(P), Papel(L) o Tijera(T): ");
            String jugadorUno = entrada().nextLine(); //Guarda la elección del jugador 1
            Integer valorUno = 0; //Declara la variable de valores vacia
    
            //Asigna un valor numerico a la eleccion del jugador 1
            if(jugadorUno.equals("p")){
                valorUno = 5;
            }else if(jugadorUno.equals("l")){
                valorUno = 7;
            }else if(jugadorUno.equals("t")){
                valorUno = 8;
            }
    
            //Solicita al jugador 2 ingresar piedra, papel, o tijera
            System.out.println("(Jugador 2): Piedra(P), Papel(L) o Tijera(T): ");
            String jugadorDos = entrada().nextLine(); //Guarda la elección del jugador 2
            Integer valorDos = 0; //Declara la variable de valores vacia
    
            //Asigna un valor numerico a la eleccion del jugador 1
            if(jugadorDos.equals("p")){
                valorDos = 5;
            }else if(jugadorDos.equals("l")){
                valorDos = 7;
            }else if(jugadorDos.equals("t")){
                valorDos = 8;
            }
    
            //Condiciones de victoria globales
            if(valorUno - valorDos == 0){
                System.out.println("\n----> ¡¡Empate!!");
            }else if(valorUno - valorDos == -3){
                System.out.println("\n----> El (Jugador 1) Gana con Piedra (P).");
            }else if(valorUno - valorDos == 2){
                System.out.println("\n----> El (Jugador 1) Gana con Papel (L).");
            }else if(valorUno - valorDos == 1){
                System.out.println("\n----> El (Jugador 1) Gana con Tijera (T).");
            }else if(valorUno - valorDos == 3){
                System.out.println("\n----> El (Jugador 2) Gana con Piedra (P).");
            }else if(valorUno - valorDos == -2){
                System.out.println("\n----> El (Jugador 2) Gana con Papel (L).");
            }else if(valorUno - valorDos == -1){
                System.out.println("\n----> El (Jugador 2) Gana con Tijera (T).");
            }            

            //Confirma si desea repetir el juego
            System.out.println("\n¿Desea jugar otra ronda? (S/N): ");
            confirmacion = entrada().nextLine();

        }while(confirmacion.equals("s")); //El juego se repite si el usuario ingresa la letra "s"
    }
}