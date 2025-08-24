package POO.Mapa_Temas.Paquetes_Organizacion;

public class Persona {
    public String nombre;          // Público
    protected int edad;            // Protegido
    String ciudad;                 // Package-private (sin modificador)
    private String documento;      // Privado

    public Persona(String nombre, int edad, String ciudad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.documento = documento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Documento: " + documento);
    }
}
