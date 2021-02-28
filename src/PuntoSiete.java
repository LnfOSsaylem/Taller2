/*
 *Juan conoce el precio de compra y de venta de unos de los productos de su tienda y 
 *requiere conocer cuál es su % de utilidad. Desarrolle un programa en java que lo ayude con ese cálculo.
*/

import java.util.Scanner;

public class PuntoSiete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\033\143");
        System.out.print("Ingrese el costo del producto: ");
        double costo = input.nextDouble();
        System.out.print("Ingrese el precio de venta: ");
        double venta = input.nextDouble();
        System.out.printf("\nEl porcentaje de utilidad es: %.2f", ((venta - costo) / venta) * 100);
    }
}
