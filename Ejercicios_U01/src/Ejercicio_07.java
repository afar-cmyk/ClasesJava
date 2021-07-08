import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
07. Pedir un número, comprobar si es primo y preguntar si quiere introducir más
    (S/N) y volver a pensar.
*/

public class Ejercicio_07 {

    public static final Scanner entrada(){
        //Scanner llamado entrada.
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    public static void main(String[] args) {

        //Define una lista de todos los numeros primos del 1 al 1000
        List<Integer> listaPrimos;
        listaPrimos = new ArrayList<>();

        listaPrimos.add(2);
        listaPrimos.add(3);
        listaPrimos.add(5);
        listaPrimos.add(7);
        listaPrimos.add(11);
        listaPrimos.add(13);
        listaPrimos.add(17);
        listaPrimos.add(19);
        listaPrimos.add(23);
        listaPrimos.add(29);
        listaPrimos.add(31);
        listaPrimos.add(37);
        listaPrimos.add(41);
        listaPrimos.add(43);
        listaPrimos.add(47);
        listaPrimos.add(53);
        listaPrimos.add(59);
        listaPrimos.add(61);
        listaPrimos.add(67);
        listaPrimos.add(71);
        listaPrimos.add(73);
        listaPrimos.add(79);
        listaPrimos.add(83);
        listaPrimos.add(89);
        listaPrimos.add(97);
        listaPrimos.add(101);
        listaPrimos.add(103);
        listaPrimos.add(107);
        listaPrimos.add(109);
        listaPrimos.add(113);
        listaPrimos.add(127);
        listaPrimos.add(131);
        listaPrimos.add(137);
        listaPrimos.add(139);
        listaPrimos.add(149);
        listaPrimos.add(151);
        listaPrimos.add(157);
        listaPrimos.add(163);
        listaPrimos.add(167);
        listaPrimos.add(173);
        listaPrimos.add(179);
        listaPrimos.add(181);
        listaPrimos.add(191);
        listaPrimos.add(193);
        listaPrimos.add(197);
        listaPrimos.add(199);
        listaPrimos.add(211);
        listaPrimos.add(223);
        listaPrimos.add(227);
        listaPrimos.add(229);
        listaPrimos.add(233);
        listaPrimos.add(239);
        listaPrimos.add(241);
        listaPrimos.add(251);
        listaPrimos.add(257);
        listaPrimos.add(263);
        listaPrimos.add(269);
        listaPrimos.add(271);
        listaPrimos.add(277);
        listaPrimos.add(281);
        listaPrimos.add(283);
        listaPrimos.add(293);
        listaPrimos.add(307);
        listaPrimos.add(311);
        listaPrimos.add(313);
        listaPrimos.add(317);
        listaPrimos.add(331);
        listaPrimos.add(337);
        listaPrimos.add(347);
        listaPrimos.add(349);
        listaPrimos.add(353);
        listaPrimos.add(359);
        listaPrimos.add(367);
        listaPrimos.add(373);
        listaPrimos.add(379);
        listaPrimos.add(383);
        listaPrimos.add(389);
        listaPrimos.add(397);
        listaPrimos.add(401);
        listaPrimos.add(409);
        listaPrimos.add(419);
        listaPrimos.add(421);
        listaPrimos.add(431);
        listaPrimos.add(433);
        listaPrimos.add(439);
        listaPrimos.add(443);
        listaPrimos.add(449);
        listaPrimos.add(457);
        listaPrimos.add(461);
        listaPrimos.add(463);
        listaPrimos.add(467);
        listaPrimos.add(479);
        listaPrimos.add(487);
        listaPrimos.add(491);
        listaPrimos.add(499);
        listaPrimos.add(503);
        listaPrimos.add(509);
        listaPrimos.add(521);
        listaPrimos.add(523);
        listaPrimos.add(541);
        listaPrimos.add(547);
        listaPrimos.add(557);
        listaPrimos.add(563);
        listaPrimos.add(569);
        listaPrimos.add(571);
        listaPrimos.add(577);
        listaPrimos.add(599);
        listaPrimos.add(593);
        listaPrimos.add(601);
        listaPrimos.add(607);
        listaPrimos.add(613);
        listaPrimos.add(617);
        listaPrimos.add(619);
        listaPrimos.add(631);
        listaPrimos.add(641);
        listaPrimos.add(643);
        listaPrimos.add(647);
        listaPrimos.add(653);
        listaPrimos.add(659);
        listaPrimos.add(661);
        listaPrimos.add(673);
        listaPrimos.add(677);
        listaPrimos.add(683);
        listaPrimos.add(691);
        listaPrimos.add(701);
        listaPrimos.add(709);
        listaPrimos.add(719);
        listaPrimos.add(727);
        listaPrimos.add(733);
        listaPrimos.add(739);
        listaPrimos.add(743);
        listaPrimos.add(751);
        listaPrimos.add(757);
        listaPrimos.add(761);
        listaPrimos.add(769);
        listaPrimos.add(773);
        listaPrimos.add(787);
        listaPrimos.add(797);
        listaPrimos.add(809);
        listaPrimos.add(811);
        listaPrimos.add(821);
        listaPrimos.add(823);
        listaPrimos.add(827);
        listaPrimos.add(829);
        listaPrimos.add(839);
        listaPrimos.add(853);
        listaPrimos.add(857);
        listaPrimos.add(859);
        listaPrimos.add(863);
        listaPrimos.add(877);
        listaPrimos.add(881);
        listaPrimos.add(883);
        listaPrimos.add(887);
        listaPrimos.add(907);
        listaPrimos.add(911);
        listaPrimos.add(919);
        listaPrimos.add(929);
        listaPrimos.add(937);
        listaPrimos.add(941);
        listaPrimos.add(947);
        listaPrimos.add(953);
        listaPrimos.add(967);
        listaPrimos.add(971);
        listaPrimos.add(977);
        listaPrimos.add(983);
        listaPrimos.add(991);
        listaPrimos.add(997); 								

        //Variable vacia para las repeticiones.
        String confirmacion = ""; 

        do {
            //Solicita un numero del 1 al 1000
            System.out.println("\nIntroduzca un número del 1 al 1000: ");
            Integer numero = entrada().nextInt();

        //Comprueba si el numero ingresado esta en la lista de numeros primos.
        if(listaPrimos.contains(numero)) {
            System.out.printf("\n---> El numero %1$s es primo.\n", numero); //Respuesta positiva.
        }else{
            System.out.printf("\n---> El numero %1$s NO es primo.\n", numero); //Respuesta negativa.
        }
            //Confirma si quiere volver a ingresar otro numero.
            System.out.println("\n¿Desea ingresar otro numero? (S/N): ");
            confirmacion = entrada().nextLine();

        }while(confirmacion.equals("s"));
    }
}