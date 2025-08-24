// Herencia

package POO.Mapa_Temas.Composicion_Herencia;

public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido");
    }
}
