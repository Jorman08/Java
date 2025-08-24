package POO.Mapa_Temas.Metodos_Objetos;
// 1. toString()

// Es un método heredado de la clase Object.
// Devuelve una representación en texto del objeto.
// Se sobrescribe para mostrar información útil en lugar de la dirección de memoria.

// Ejemplo

/* @Override
public String toString() {
    return "Nombre: " + nombre + ", Edad: " + edad;
}*/




// 2. equals(Object obj)

// Sirve para comparar dos objetos y determinar si son "lógicamente" iguales.
// Por defecto, compara referencias (si son el mismo objeto en memoria).
// Se sobrescribe para comparar atributos.

// Ejemplo

/* @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Persona persona = (Persona) obj;
    return edad == persona.edad && nombre.equals(persona.nombre);
} */




// 3. hashCode()

// Devuelve un número entero que representa el objeto en estructuras hash (como HashMap, HashSet).
// Si sobrescribes equals, debes sobrescribir hashCode() para mantener la coherencia.
// Se usa para optimizar búsquedas en colecciones.

// Ejemplo

/* @Override
public int hashCode() {
    return Objects.hash(nombre, edad);
} */


// ¿Por qué importan en colecciones?
// Cuando usas HashSet, HashMap o HashTable, estas colecciones dependen de hashCode para agrupar objetos.
// Si sobrescribes equals pero no hashCode, podrías tener duplicados o errores al buscar.