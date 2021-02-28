
/*Desarrolle un programa en java que lea una cantidad 
 * numérica entre cero y mil (0 y 1000) 
 * e imprima la cifra correspondiente a sus unidades,
 * decenas y centenas.
*/
import java.util.Scanner;

public class PuntoOnce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad numérica: ");
        int x = input.nextInt();

        if (x <= 0 && x >= 1000) {
            System.out.println("Numero invalido rango (1 - 999)");
        } else {
            int centenas = x / 100;
            int decenas = (x % 100) / 10;
            int unidades = (x % 100) % 10;
            System.out.println("Cantidades que componen al número:");
            System.out.printf("\n%d Centena(s)", centenas);
            System.out.printf("\n%d Decena(s)", decenas);
            System.out.printf("\n%d Unidad(es)\n", unidades);
        }

    }
}
