public class Usuario {
    private String nombre;
    private String correoElectronico;
    private String contrasena;

    // Constructor
    public Usuario(String nombre, String correoElectronico, String contrasena) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    // Otros métodos relevantes...
}