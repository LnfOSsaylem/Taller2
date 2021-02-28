/*Escriba un programa en Java que lea el peso de un objeto (en kilogramos)
 e imprima su equivalencia en: gramos, libras, toneladas.
*/

import java.util.Scanner;

public class PuntoDiez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digita el peso del objeto (kg): ");
        double peso = input.nextDouble();
        System.out.printf("El peso del objeto en Gramos es: %.2f\n", (peso * 1000));
        System.out.printf("El peso del objeto en Libras es: %.2f\n", (peso * 2.205));
        System.out.printf("El peso del objeto en Toneladas es: %.2f\n", (peso / 1000));
    }
}
