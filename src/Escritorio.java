public class Escritorio {
    private int numero;
    private boolean disponible;

    // Constructor
    public Escritorio(int numero) {
        this.numero = numero;
        this.disponible = true;
    }

      // Métodos getter y setter
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