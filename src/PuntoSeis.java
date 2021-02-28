/*
 *Desarrolle un programa en java que calcule el índice de masa corporal BMI el cual 
 *está dado por la formula (pesoenKg/alturaenmetros*alturaenmetros)
 */

import java.util.Scanner;

public class PuntoSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\033\143");
        System.out.print("Digite su peso (kg): ");
        double peso = input.nextDouble();
        System.out.print("Digite su altura (m): ");
        double altura = input.nextDouble();
        System.out.printf("Su IMC (indice de masa corporal) es %.1f: ", peso / (altura * altura));
    }
}
