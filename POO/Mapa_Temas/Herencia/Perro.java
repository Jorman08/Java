package POO.Mapa_Temas.Herencia;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void Sonido() {
        System.out.println(nombre + " hace ¡Guau! ¡Guau!");
    }
}
