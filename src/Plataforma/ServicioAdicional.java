package Plataforma;

public class ServicioAdicional {
    private String nombre;
    private double precio;

    // Constructor
    public ServicioAdicional(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}