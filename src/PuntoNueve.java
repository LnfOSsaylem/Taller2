/*
Se desea construir un programa en java que permita calcular el costo total de un viaje que tiene 
una duración en días. Para ello, se requiere los siguientes datos: Número de días del viaje, 
Total de kilómetros conducidos por día, costo por litro de gasolina, promedio de kilometro por 
litro de gasolina, pago por estacionamiento por día, pago de peajes por día.Imprima en consola 
el resultado.
*/

import java.util.Scanner;

public class PuntoNueve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite la cantidad de dias del viaje: ");
        int n_Dias = input.nextInt();
        System.out.print("Digite el total de Km (Kilometros) conducidos por dia: ");
        double n_Kilo = input.nextDouble();
        System.out.print("Digite el costo por litro de gasolina: ");
        double n_Costo = input.nextDouble();
        System.out.print("Digite el promedio de km por litro de gasolina: ");
        double n_Kmgas = input.nextDouble();
        System.out.print("Digite el pago por estacionamiento por dia: ");
        double n_Esta = input.nextDouble();
        System.out.print("Digite el pago de peajes por dia: ");
        double n_Peaje = input.nextDouble();
        System.out.printf("Costo total del viaje: %.2f\n",(((n_Kilo/n_Kmgas)*n_Costo)+(n_Esta*n_Dias)+(n_Peaje*n_Dias)));
    }
}
