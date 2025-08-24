package POO.Mapa_Temas.Abstraccion;

public class CirculoConInterface implements Calculable {
    private double radio;

    public CirculoConInterface(double radio) {
        this.radio = radio;
    }

    @Override
    public void mostrarCalculo() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}
