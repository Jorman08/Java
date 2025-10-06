package POO.Mapa_Temas.Metodos_Objetos;

import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobrescribimos toString para mostrar la información de forma legible
    @Override 
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }

    // Sobrescribimos equals para comparar contenido (nombre y edad)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Si es el mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }

    // Sobrescribimos hashCode para que sea consistente con equals
    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    /* // ejemplo hashCode
    int num1 = hashCode(); */
}
