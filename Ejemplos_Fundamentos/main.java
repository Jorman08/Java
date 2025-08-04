import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");
        /* System.out.print("Otro salduo");
        System.out.println("Programación Java");
        System.out.print("jajajaja"); */

        // Manejo de variables

        /* int edad = 25; //Entero

        // Maneras de concatenar
        System.out.println("La edad es: " + edad); // Concatenación con el operador +
        System.out.printf("La edad es: %d%n", edad); // Formato 
        //"%d%n" es un marcador de posición para enteros y "%n" es un salto de línea

        double precio = 99.99; //Decimal
        char inicial = 'J'; //Caracter
        boolean esMayor = true; //Booleano
        String nombre = "Juan"; //Cadena de texto

        int numero1 = 10;
        int numero2 = 15;

        int resultado = numero1 + numero2; 

        System.out.print("El resultado de la suma es: " + resultado); */

        // Uso de scanner para capturar datos desde la consola

        /* java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine(); // Captura de cadena de texto

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt(); // Captura de entero

        System.out.print("Ingrese su altura: ");
        double altura = sc.nextDouble(); // Captura de decimal
        System.out.println("Altura: " + altura);

        System.out.print("Ingrese su inicial: ");
        char inicial = sc.next().charAt(0); // Captura de caracter
        System.out.println("Inicial: " + inicial);

        System.out.println("¿Eres mayor de edad? (true/false): ");
        boolean esMayor = sc.nextBoolean(); // Captura de booleano
        System.out.println("Mayor de edad: " + esMayor);

        System.out.println("\n--- Datos capturados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad); */

        // Precación con nextLine() después de nextInt(), nextDouble() o nextBoolean()
        // Cuando se usa nextLine() o nextDouble(),  queda un salto de línea (\n) en el buffer,
        // Lo que puede causar que nextLine() se salte la entrada del usuario.
        // Para esto evitar usar un scanner nextLine() después de nextInt() o nextDouble() para limpiar el buffer

        /* // Capturar un string
        System.out.println("Ingrese su nombre: ");
        string name = sc.nextLine();

        // Capturar un entero
        System.out.println("Ingrese su edad: ");
        int age = sc.nextInt(); */

        sc.close(); // Cerrar el scanner para liberar recursos
    }
}

