package Ejercicios;

import java.util.Scanner;

public class ivaCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la categoria (A, B, C): ");
        String categoria = sc.nextLine().toUpperCase(); // Convertir a mayúsculas para evitar errores
        System.out.print("Ingrese el precio base: ");
        double precioBase = sc.nextDouble();
        double iva = 0.0;
        double subtotal = 0.0;
        double total = 0.0;
        switch (categoria) {
            case "A":
                iva = precioBase * 0.19; // 19% de IVA
                subtotal = precioBase + iva;
                total = subtotal;
                break;
            case "B":
                iva = precioBase * 0.05; // 5% de IVA
                subtotal = precioBase + iva;
                total = subtotal;
                break;
            case "C":
                iva = 0.0; // Sin IVA
                subtotal = precioBase;
                total = subtotal;
                break;
            default:
                System.out.println("Categoria no valida");
                return; // Salir del programa si la categoria es invalida
        }

        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("IVA: %.2f\n", iva);
        System.out.printf("Total: %.2f\n", total);

        sc.close();
    }
}
