// Herencia

package POO.Mapa_Temas.Composicion_Herencia;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau!");
    }
}
