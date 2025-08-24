// Composición

package POO.Mapa_Temas.Composicion_Herencia;

public class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void encender() {
        System.out.println("Encendiendo el carro...");
        motor.arrancar();
    }
}
