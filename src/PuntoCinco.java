/* Escriba un programa en Java que lea un carácter e
 * imprima su correspondiente valor numérico (utilizar
 * la conversión de tipos).
 */

import java.util.Scanner;

public class PuntoCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        char c = input.next().charAt(0);
        System.out.printf("El caracter ingresado fue %c y su valor numérico es %d\n", c, (int) c);
    }
}
