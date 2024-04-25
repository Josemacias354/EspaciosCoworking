package Plataforma;

public class Usuario {
    private String nombre;
    private String correoElectronico;
    private String contrasena;


    public Usuario(String nombre, String correoElectronico, String contrasena) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public <string> void setNombre() {
        this.nombre = nombre;

    }


}