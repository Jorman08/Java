package POO.Mapa_Temas.Static_Final;

public class Producto {
    private String nombre;
    private double precio;

    public static final double IVA = 0.19; // Constante
    private static int contador = 0; // Contador de instancias

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        contador++;
    }

    public double precioConIVA() {
        return precio * (1 + IVA);
    }

    public static int getContador() { // Método estático
        return contador;
    }

    public static Producto crearProductoGenerico() { // Método de fábrica estático
        return new Producto("Genérico", 10.0);
    }

    public String getNombre() {
        return nombre;
    }
}

