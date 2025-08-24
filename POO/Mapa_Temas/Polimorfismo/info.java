package POO.Mapa_Temas.Polimorfismo;
// El polimorfismo es la capacidad que tienen los objetos para comportarse de diferentes maneras, aun cuando comparten una misma interfaz o herencia.

// Existen dos tipos principales:

// Polimorfismo en tiempo de compilación (Sobrecarga de métodos)
// Ocurre cuando hay varios métodos con el mismo nombre pero diferentes parámetros (overloading).

// Polimorfismo en tiempo de ejecución (Sobrescritura de métodos)
// Ocurre cuando una subclase sobrescribe un método de la superclase (overriding), pero se accede a través de una referencia del tipo padre.


// Ejemplo conceptual
//Un método hacerSonido() puede ser implementado diferente en clases Perro y Gato, pero ambos se comportan distinto al invocarse.



// 2. Métodos abstractos

// Un método abstracto es un método declarado sin implementación en una clase abstracta.

// Clase abstracta: No puede instanciarse directamente.

// Método abstracto: Obliga a las subclases a implementarlo.

// Sintaxis
// abstract class Animal {
//     abstract void hacerSonido();
// }