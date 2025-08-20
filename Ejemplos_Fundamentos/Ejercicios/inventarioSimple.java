package Ejercicios;

import java.util.Scanner;

public class inventarioSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de productos: ");
        int m = sc.nextInt();
        if (m <= 0) {
            System.out.println("El número de productos debe ser mayor que 0.");
            return; // Salir del programa si M es inválido
        }
        java.util.Map<String, Integer> inventario = new java.util.HashMap<>();
        for (int i = 0; i < m; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String nombre = sc.next();
            System.out.print("Ingrese el stock del producto " + (i + 1) + ": ");
            int stock = sc.nextInt();
            inventario.put(nombre, stock);
        }
        int totalUnidades = 0;
        String productoMayorStock = null;
        int maxStock = Integer.MIN_VALUE; // Inicializar con el valor más bajo
        for (java.util.Map.Entry<String, Integer> entry : inventario.entrySet()) {
            String nombre = entry.getKey();
            int stock = entry.getValue();
            totalUnidades += stock; // Sumar al total de unidades
            if (stock > maxStock) {
                maxStock = stock; // Actualizar máximo
                productoMayorStock = nombre; // Actualizar producto con mayor stock
            }
        }
        System.out.println("Inventario:");
        for (java.util.Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.printf("Producto: %s, Stock: %d\n", entry.getKey(), entry.getValue());
        }
        System.out.printf("Total de unidades en inventario: %d\n", totalUnidades);
        if (productoMayorStock != null) {
            System.out.printf("Producto con mayor stock: %s (%d unidades)\n", productoMayorStock, maxStock);
        } else {
            System.out.println("No se ingresaron productos.");
        }
        
        sc.close();
    }
}
