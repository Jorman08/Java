package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class estadistLecturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de lecturas: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("El número de lecturas debe ser mayor que 0.");
            return; // Salir del programa si N es inválido
        }

        List<Double> lecturas = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la lectura " + (i + 1) + ": ");
            double lectura = sc.nextDouble();
            lecturas.add(lectura);
        }
        double suma = 0.0;
        double maximo = Double.NEGATIVE_INFINITY; // Inicializar con el valor más bajo
        double minimo = Double.POSITIVE_INFINITY; // Inicializar con el valor más alto
        for (double lectura : lecturas) {
            suma += lectura;
            if (lectura > maximo) {
                maximo = lectura; // Actualizar máximo
            }
            if (lectura < minimo) {
                minimo = lectura; // Actualizar mínimo
            }
        }
        double promedio = suma / n; // Calcular el promedio
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.printf("Máximo: %.2f\n", maximo);
        System.out.printf("Mínimo: %.2f\n", minimo);
        if (lecturas.isEmpty()) {
            System.out.println("No se ingresaron lecturas.");
        } else {
            System.out.println("Lecturas ingresadas: " + lecturas);
        }
        if (n > 0) {
            System.out.println("Gracias por usar el sistema de estadísticas de lecturas.");
        } else {
            System.out.println("No se procesaron lecturas debido a un número inválido.");
        }
        if (sc != null) {
            System.out.println("Fin del programa.");
            // Cerrar el scanner al final del uso
        }

        
        sc.close();
    }
}
