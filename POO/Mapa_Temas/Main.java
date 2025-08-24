package POO.Mapa_Temas;

import java.util.HashSet;
import java.util.Scanner;


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


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Clases Objetos 
        /* Vehiculo auto = new Vehiculo();
        auto.marca("Toyota");
        auto.velocidad(80);
        auto.acelerar(); */




        // Encapsulamiento
        /* CuentaBancaria cuenta = new CuentaBancaria("Laura", 1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Titular: " + cuenta.getTitular() + ", Saldo: " + cuenta.getSaldo()); */




        // Constructores
        /* Libro libro1 = new Libro("Cien Años de Soledad");
        Libro libro2 = new Libro("El Quijote", "Cervantes");
        libro1.mostrarInfo();
        libro2.mostrarInfo(); */




        // Herencia y super
        /* Perro p = new Perro("Firulais");
        p.hacerSonido(); */




        // Polimorfismo
        /* Figura f1 = new Circulo();
        Figura f2 = new Cuadrado();
        f1.dibujar();
        f2.dibujar(); */



        // Abstracción
        /* FiguraAbstracta rect = new Rectangulo(5, 3);
        System.out.println("Área del rectángulo: " + rect.calcularArea());

        CirculoConInterface circ = new CirculoConInterface(4);
        circ.mostrarCalculo(); */




        // Static Final
        /* Producto p1 = new Producto("Laptop", 1500);
        Producto p2 = Producto.crearProductoGenerico();

        System.out.println("Precio con IVA: " + p1.precioConIVA());
        System.out.println("Contador: " + Producto.getContador()); */




        // Paquetes, organización del código
        /* Empleado emp = new Empleado("Carlos", 30, "Bogotá", "12345", 2500.0);

        emp.mostrarEmpleado();
        System.out.println("Nombre público: " + emp.nombre); */
        // System.out.println(emp.edad);    // ERROR (protected)
        // System.out.println(emp.ciudad);  // ERROR (package-private)




        // Metodos Objetos ( toString, Equals, hashCode)
        /* Persona p1 = new Persona("Carlos", 30);
        Persona p2 = new Persona("Carlos", 30);
        Persona p3 = new Persona("Ana", 25);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("\np1.equals(p2)? " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3)? " + p1.equals(p3)); // false

        HashSet<Persona> personas = new HashSet<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        System.out.println("\nContenido del HashSet:");
        for (Persona p : personas) {
            System.out.println(p);
        } */




        // HERENCIA
        /* Perro miPerro = new Perro("Firulais");
        miPerro.hacerSonido();

        System.out.println(); */

        // COMPOSICIÓN
        /* Carro miCarro = new Carro();
        miCarro.encender(); */

        sc.close();
    }
}
