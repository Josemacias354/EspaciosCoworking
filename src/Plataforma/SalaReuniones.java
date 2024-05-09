package Plataforma;

public class SalaReuniones extends EspacioCoworking {

    private int capacidad;
    private boolean disponible;


    public SalaReuniones(String nombre, int capacidad) {
        super.setNombre(nombre);
        this.capacidad = capacidad;
        this.disponible = true;
    }


    @Override
    public String getNombre() {
        return super.getNombre();
    }


    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public void Disponible() {
        if (disponible) {
            System.out.println("La sala de reuniones " + super.getNombre() + " está disponible");
        } else {
            System.out.println("La sala de reuniones " + super.getNombre() + " no está disponible");
        }
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}