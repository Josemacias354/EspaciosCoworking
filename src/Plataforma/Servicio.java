package Plataforma;

public class Servicio {
    private String nombreServicio;
    private double precioServicio;

    public Servicio(String nombreServicio, double precioServicio) {
        this.nombreServicio = nombreServicio;
        this.precioServicio = precioServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(double precioServicio) {
        this.precioServicio = precioServicio;
    }
}