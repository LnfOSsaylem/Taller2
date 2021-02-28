/*
 * Escriba una aplicación que reciba tres valores
 * decimales del usuario y muestre la suma, promedio,
 * producto, cociente y modulo. Los resultados se deben
 * imprimir en formato decimal con dos cifras significativas.
 */

import java.util.Scanner;

public class PuntoTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\033\143");
        System.out.print("Digite primer valor: ");
        double a = input.nextDouble();
        System.out.print("Digite segundo valor: ");
        double b = input.nextDouble();
        System.out.print("Digite tercer valor: ");
        double c = input.nextDouble();
        System.out.printf("\nLa suma es: %.2f", a + b + c);
        System.out.printf("\nEl promedio es: %.2f", (a + b + c) / 3);
        System.out.printf("\nEl producto es: %.2f", a * b * c);
        System.out.printf("\nEl cociente es: %.2f", (a / b) / c);
        System.out.printf("\nEl modulo es: %.2f", (a % b) % c);
    }
}
