package POO.Mapa_Temas.Paquetes_Organizacion;

public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, String ciudad, String documento, double salario) {
        super(nombre, edad, ciudad, documento);
        this.salario = salario;
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre); // OK (public)
        System.out.println("Edad: " + edad);     // OK (protected)
        System.out.println("Ciudad: " + ciudad); // OK (package-private)
        // System.out.println("Documento: " + documento); // ERROR (private)
        System.out.println("Salario: " + salario);
    }
}
