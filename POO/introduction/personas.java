package POO.introduction;

public class personas {
    // atributos
    public String nombre;
    public int edad;

    // constructores (clic derecho -> source o accion de codigo fuente -> generate constructor using fields)
    public personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo
    public void mostrarDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }

    public void saludar() {
        System.out.println("Hola, " + nombre + "! Tienes " + edad + " años.");
    }

}
