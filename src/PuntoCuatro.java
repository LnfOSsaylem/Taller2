/*
 * Escriba un programa en Java que le solicite al usuario el
 * valor del radio de una circunferencia y calcule su longitud
 * y área. Imprima los resultados (con dos números decimales)
 */

import java.util.Scanner;

public class PuntoCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\033\143");
        System.out.print("Digite el radio de la circunferencia: ");
        double radio = input.nextDouble();

        System.out.printf("\nLa longitud de la circunferencia es: %.2f\n", 2 * Math.PI * radio);
        System.out.printf("El area de la circunferencia es: %.2f\n", Math.PI * Math.pow(radio, 2));
    }
}