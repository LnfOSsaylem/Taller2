/*
 * Escriba un programa en java que lea dos datos de tipo entero,
 * los almacene en dos variables x y y, y ejecute las siguientes
 * instrucciones, analice los resultados: 
 * a) System.out.printf("x = %d\n", x ); 
 * b) System.out.printf("El valor de %d + %d es %d\n", x, x, ( x + x ) );
 * c) System.out.printf("x= %.4f", x );
 * d) System.out.printf("%d - %d\n", ( x + y ), ( y + x ) );
 */

import java.util.Scanner;

public class PuntoUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\033\143");
        System.out.print("Ingrese un numero: ");
        int x = input.nextInt(); // 7
        System.out.print("Ingrese otro numero: ");
        int y = input.nextInt(); // 3
        System.out.printf("x = %d\n", x); // x = 7
        System.out.printf("El valor de %d + %d es %d\n", x, x, (x + x)); // x = 14
        System.out.printf("x = %.4f\n", (double) x); // x = 7.0000
        System.out.printf("%d - %d\n", (x + y), (y + x)); // 10 - 10
    }
}
