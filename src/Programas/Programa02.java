package Programas;
import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        // Cálculos
        double sueldoBruto = horasTrabajadas * tarifaPorHora;
        double descuento = sueldoBruto * 0.13;
        double sueldoNeto = sueldoBruto - descuento;

        // Resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Descuento (13%): " + descuento);
        System.out.println("Sueldo neto: " + sueldoNeto);

        scanner.close();
    }
}

