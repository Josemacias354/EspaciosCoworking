package Plataforma;

public class Escritorio extends EspacioCoworking{
    private int numero;
    private boolean disponible;

    public Escritorio(int numero) {
        this.numero = numero;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}