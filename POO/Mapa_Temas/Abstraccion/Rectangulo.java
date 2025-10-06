package POO.Mapa_Temas.Abstraccion;

public class Rectangulo extends FiguraAbstracta{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
 
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
