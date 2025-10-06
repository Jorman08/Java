// 1. ¿Qué es la Abstracción en Java?
// Concepto: Consiste en ocultar la implementación interna y mostrar solo lo esencial al usuario.
// Objetivo: Que el programador use la clase o interfaz sin preocuparse por cómo está implementada internamente.

// Cómo se logra en Java:
// Con clases abstractas.
// Con interfaces.



// 2. Clases Abstractas
// Son clases que no se pueden instanciar directamente y que pueden contener:
// Métodos abstractos (sin implementación).
// Métodos con implementación normal.

// ¿Dónde se usan?
// Cuando tienes una jerarquía de clases donde varias comparten comportamiento común, pero cada subclase debe implementar algunos métodos específicos.

// ¿Cómo se definen?

/* abstract class Figura {
    abstract void dibujar(); // Método abstracto
    void descripcion() {     // Método normal
        System.out.println("Soy una figura");
    }
} */



// 3. Interfaces
// Una interfaz es un contrato que define métodos abstractos (por defecto) y, desde Java 8, también métodos default y static.

// ¿Dónde se usan?
// Para definir comportamientos que pueden compartir clases no relacionadas.
// Para lograr polimorfismo múltiple (Java no soporta herencia múltiple de clases, pero sí de interfaces).

// ¿Cómo se definen?

/* interface Dibujable {
    void dibujar(); // Método abstracto por defecto
} */



// 4. Métodos default en Interfaces
// Métodos en interfaces que sí tienen implementación por defecto (desde Java 8).

// ¿Para qué sirven?
// Para agregar nuevas funcionalidades a interfaces sin romper el código existente que las implementa.

// ¿Cómo se definen?

/* interface Saludo {
    default void saludar() {
        System.out.println("Hola desde la interfaz");
    } 
} */
