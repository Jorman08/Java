package POO.Mapa_Temas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import POO.Mapa_Temas.Clases_Objetos.Vehiculo;
import POO.Mapa_Temas.Encapsulamiento.CuentaBancaria;
import POO.Mapa_Temas.Constructores.Libro;
import POO.Mapa_Temas.Composicion_Herencia.Perro;
import POO.Mapa_Temas.Polimorfismo.*;
import POO.Mapa_Temas.Abstraccion.*;
import POO.Mapa_Temas.Static_Final.Producto;
import POO.Mapa_Temas.Paquetes_Organizacion.Empleado;
import POO.Mapa_Temas.Metodos_Objetos.Persona;
import POO.Mapa_Temas.Composicion_Herencia.Carro;
import POO.Mapa_Temas.Herencia.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Clases Objetos 
        /* System.out.println("=== Clases y Objetos ===");
        Vehiculo auto = new Vehiculo(); 
        auto.marca = "Toyota";
        auto.velocidad = 120;
        auto.acelerar(); */





        // Encapsulamiento
        /* System.out.println("=== Encapsulamiento ===");
        CuentaBancaria cuenta = new CuentaBancaria("Laura", 1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Titular: " + cuenta.getTitular() + ", Saldo: " + cuenta.getSaldo()); */




        // Constructores
        /* System.out.println("=== Constructores ===");
        Libro libro1 = new Libro("Cien Años de Soledad");
        Libro libro2 = new Libro("El Quijote", "Cervantes");
        libro1.mostrarInfo();
        libro2.mostrarInfo(); */




        // Herencia y super
        /* System.out.println("=== Herencia y super ===");
        Animal a = new Animal("");
        a.Sonido();
        Perro p = new Perro("Firulais");
        p.Sonido(); */




        // Polimorfismo
        /* System.out.println("=== Polimorfismo ===");
        Figura f1 = new Circulo();
        Figura f2 = new Cuadrado();
        f1.dibujar();
        f2.dibujar(); */



        // Abstracción
        /* System.out.println("=== Abstracción ===");
        FiguraAbstracta rect = new Rectangulo(5, 3);
        System.out.println("Área del rectángulo: " + rect.calcularArea());

        CirculoConInterface circ = new CirculoConInterface(4);
        circ.mostrarCalculo(); */




        // Static Final
        /* System.out.println("=== Static y Final ===");
        Producto p1 = new Producto("Laptop", 3000);
        Producto p2 = new Producto("Mouse", 50);

        System.out.println("Precio con IVA de " + p1.getNombre() + ": " + p1.precioConIVA());
        System.out.println("Productos creados: " + Producto.getContador());

        Producto generico = Producto.crearProductoGenerico();
        System.out.println("Producto genérico: " + generico.getNombre());
        System.out.println("Productos creados: " + Producto.getContador()); */




        // Paquetes, organización del código
        /* System.out.println("=== Paquetes y organización del código ===");
        Empleado emp = new Empleado("Carlos", 30, "Bogotá", "12345", 2500.0);

        emp.mostrarEmpleado();
        System.out.println("Nombre público: " + emp.nombre); */
        // System.out.println(emp.edad);    // ERROR (protected)
        // System.out.println(emp.ciudad);  // ERROR (package-private)




        // Metodos Objetos ( toString, Equals, hashCode)
        /* System.out.println("=== Métodos de Objetos ===");
        Persona p1 = new Persona("Carlos", 30);
        Persona p2 = new Persona("Carlos", 30);
        Persona p3 = new Persona("Ana", 25);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("\np1.equals(p2)? " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3)? " + p1.equals(p3)); // false

        System.out.println("\nHashCodes: ");
        System.out.println("p1: " + p1.hashCode());
        System.out.println("p2: " + p2.hashCode());
        System.out.println("p3: " + p3.hashCode());

        System.out.println("\nUsando en un HashSet:");
        Set<Persona> personas = new HashSet<>();
        personas.add(p1);
        personas.add(p2);
        System.out.println(personas.size()); // Será 1, no 2, gracias a equals y hashCode */




        // HERENCIA
        /* System.out.println("=== Herencia ===");
        Perro miPerro = new Perro("Firulais");
        miPerro.hacerSonido();

        System.out.println();

        // COMPOSICIÓN
        System.out.println("=== Composición ===");
        Carro miCarro = new Carro();
        miCarro.encender();

        sc.close(); */
    }
}
