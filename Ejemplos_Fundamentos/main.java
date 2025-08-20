import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Hola, mundo!");
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



        // Condicionales
        /* System.out.println("Ingrese su edad:");
        int age = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        int age_parameter = 18; */

        // boolean tieneBoleta = true;

        // if (! (age < age_parameter || !tieneBoleta)) {
        //     System.out.println("Puede ingresar.");
        // } else {
        //     System.out.println("No puede ingresar.");
        // }

        /* if (age >= 18 && tieneBoleta) {
            System.out.println("Puede ingresar.");
        } else if (age < 18 && !tieneBoleta) {
            System.out.println("No puede ingresar.");
        } else if (age < 18 && tieneBoleta) {
            System.out.println("Puede ingresar, pero debe ir acompañado de un adulto.");
        } else {
            System.out.println("No puede ingresar.");
        } */


        // operador ternario
        /* String mensaje = age >= 18 ? "Eres mayor de edad." : "Eres menor de edad.";
        System.out.println(mensaje);

        mensaje = age >= 18 && tieneBoleta ? "Puede ingresar." : "No puede ingresar.";
        System.out.println(mensaje); */



        /* int edad = 19;
        boolean tieneBoleta = true;
        java.time.LocalDate fechaEvento = java.time.LocalDate.parse("2025-08-14");
        String mensaje = "";

        if (edad >= 18) {
            if (tieneBoleta) {
                if (fechaEvento.isAfter(java.time.LocalDate.now())) { // .isAfter compara si la fecha del evento es posterior a la fecha actual
                    mensaje = "Puede ingresar al evento.";            // .isEqual compara si la fecha del evento es igual a la fecha actual
                } else {
                    mensaje = "El evento ya ha pasado.";
                }
            } else {
                mensaje = "No puede ingresar, necesita una boleta.";
            }
        } else {
            mensaje = "No puede ingresar, es menor de edad.";
        }

        System.out.println(mensaje); */


        /* int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");                
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
                break;
        }


        // Desde java 14 se puede usar switch como expresión
        String diaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Otro día";
        };

        System.out.println(diaSemana); */



        // Ejemplo de estructura repetitiva for (con break); detiene la ejecución del ciclo, pero no del programa. Es importatne tener en cuenta que el break solo se detiene el ciclo más cercano. Y se usa en casos como cuando se cumple una condición y no se desea continuar con el ciclo. Un caso es cuando se busca un elemento en un arreglo y se desea detener la búsqueda al encontrarlo.

        //sintaxis
        /* for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Iteración: " + i);
        } */


        /* int[] numeros = {1, 2, 3, 4, 5};
        int numeroBuscando = 3;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscando) {
                encontrado = true;
                break; // Detiene el ciclo si encuentra el número
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado.");
        } else {
            System.out.println("Número no encontrado.");
        } */


        // Ejemplo de estructur re repetitiva for (con continue); detiene la iteración actual y continúa con la siguiente iteración del ciclo. Se usa en casos como cuando se desea omitir un elemento específico en un ciclo.

        //sintaxis
        /* for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Omitir la iteración actual si i es igual a 5
            }
            System.out.println("Iteración: " + i);
        } */


        // Estructura peretitiva for (con continue) para el caso real cuando se desea omitir un elemento en un arreglo.

        /* int [] numeros = {1, 2, 3, 4, 5};
        int numeroOmitido = 3;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroOmitido) {
                continue; // Omitir la iteración actual si el número es igual al número omitido
            }
            System.out.println("Número: " + numeros[i]);
        } */


        /* String[] comportamiento = {"Disciplinado", "serio", "Indisciplinado", "juicio", "amable"};
        String comportamientoOmitido = "Indisciplinado";
        
        for (int i = 0; i < comportamiento.length; i++) {
            if (comportamiento[i].equals(comportamientoOmitido)) {
                continue; // Omitir la iteración actual si el nombre es igual al nombre omitido
            }
            System.out.println("Comportamiento: " + comportamiento[i]);
        } */



        // while con break y continue
        /* int contador = 0;
        while (contador < 10) {
            contador++;
            if (contador == 5) {
                continue; // Omitir la iteración cuando contador es 5
            }
            if (contador == 8) {
                break; // Salir del ciclo cuando contador es 8
            }
            System.out.println("Contador: " + contador);
        }
 */

        // do while con break y continue
        /* int contador2 = 0;
        do {
            contador2++;
            if (contador2 == 5) {
                continue; // Omitir la iteración cuando contador2 es 5
            }
            if (contador2 == 8) {
                break; // Salir del ciclo cuando contador2 es 8
            }
            System.out.println("Contador2: " + contador2);
        } while (contador2 < 10); */



        // El foreach en JAVA se escribe como "for", pero utiliza diferentes parámentros al for normal
        // Sintaxis
        /* for (TipoElemento variable : colleción) {
            // Instrucciones
        } */


        // Ejemplo con array
        /* String[] frutas = {"manzana", "banano", "pera"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        } */


        // Ejemplos con ArrayList
        /* ArrayList<String> colores = new ArrayList<>();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Rojo");
        for (String color : colores) {
            System.out.println("color: " + color);
        }
 */

        // Ejemplo list
        /* List<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Foreach clásico
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }


        // Alternativa con foreach de Java 8 usando lambda
        frutas.forEach(fruta -> System.out.println(" ->: " + frutas)); */

        sc.close(); // Cerrar el scanner para liberar recursos
    }
}

