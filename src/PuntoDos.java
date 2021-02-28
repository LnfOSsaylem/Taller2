/*
 * Escriba una aplicación que pida al usuario que escriba dos enteros,
 * que obtenga los números del usuario e imprima la suma, producto,
 * diferencia de los números. 
 */

import java.util.Scanner;

public class PuntoDos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\033\143");
        System.out.print("Ingresa primer numero: ");
        int a = input.nextInt();
        System.out.print("\nIngresa segundo numero: ");
        int b = input.nextInt();
        System.out.printf("\nLa suma es %d", a + b);
        System.out.printf("\nLa diferencia es %d", a - b);
        System.out.printf("\nEl producto es %d", a * b);
    }
}
