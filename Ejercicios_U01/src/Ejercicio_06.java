import java.util.Scanner;

/*
06. Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
    que calcule el peso ideal.
    - peso ideal mujeres = altura - 120
    - peso ideal hombres = altura - 110

    Cálculo: peso ÷ (altura)2 = IMC
*/

public class Ejercicio_06 {
    //Scanner llamado entrada.
    public static final Scanner entrada(){
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static void main(String[] args) {
      
        System.out.println("Escriba la letra que corresponde a su sexo (H/M): ");
        String sexo = entrada().nextLine();
    
        System.out.println("Ingrese la altura en centimetros: ");
        Integer altura = entrada().nextInt();
    
        Integer pesoIdealHombre = altura - 110;
        Integer pesoIdealMujer = altura - 120;

        if(sexo.equals("h")){
            System.out.println(pesoIdealHombre);
        }else if(sexo.equals("m")){
            System.out.println(pesoIdealMujer);
        }
    }
}
