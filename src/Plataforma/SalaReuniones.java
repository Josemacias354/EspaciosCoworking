package Plataforma;

public class SalaReuniones {
    private String nombre;
    private int capacidad;
    private boolean disponible;

    // Constructor
    public SalaReuniones(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponible = true;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}