import java.util.Scanner;

/*
17. Programa que calcule el precio de venta de un producto conociendo el precio
    por unidad (sin IVA) del producto, el número de productos vendidos y el
    porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
*/

//Solo se puede utilizar la función main() solo para hacer el llamado a las funciones que se quieren probar.

public class Ejercicio_17 {

    public static final Scanner ENTRADA(){
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }

    public static Double precioUnidad() {
        //Mensaje inicial
        System.out.println("\nPrograma para calcular el precio de venta de un producto.\n");

        //Solicita el precio unitario del producto sin IVA.
        System.out.print("Ingrese el precio sin IVA del producto: ");
        Double precioUnidad = ENTRADA().nextDouble();
        return precioUnidad;
    }

    public static Double numeroProductos() {
        //Solicita el numero de productos vendidos.
        System.out.print("Ingrese el número de productos vendidos: ");
        Double numeroProductos = ENTRADA().nextDouble();
        return numeroProductos;
    }

    public static Double cantidadIva() {
        //Solicita la cantidad de IVA que se va a aplicar.
        System.out.print("Ingrese la cantidad de IVA a calcular: ");
        Double cantidadIva = ENTRADA().nextDouble();
        Double ivaFinal = cantidadIva / 100;
        return ivaFinal;
    }

    public static Double calculos() {
        //Se guardan los valores solicitados en variables.
        Double precioUnitario = precioUnidad();
        Double cantidadProductos = numeroProductos();
        Double valorIva = cantidadIva();

        //Se calcula el IVA sobre el valor unitario y se multiplica sobre la cantidad de productos.
        Double precioIva = (precioUnitario * valorIva) + precioUnitario;
        Double resultado = precioIva * cantidadProductos;

        return resultado;
    }

    public static void mensajeFinal() {
        //Se imprime por consola el precio de venta del producto.
        System.out.printf("\n---> El precio de venta con IVA es de: %1$s.",calculos());  
    }
    public static void main(String[] args) {
        mensajeFinal();
    }
}