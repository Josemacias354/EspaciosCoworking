package Plataforma;

import Plataforma.Escritorio;
import Plataforma.EspacioCoworking;

import java.time.LocalDateTime;

public class Reserva {
    private Usuario usuario;
    private EspacioCoworking espacio;
    private Escritorio escritorio;
    private SalaReuniones salaReuniones;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;


    public Reserva(Usuario usuario, EspacioCoworking espacio, Escritorio escritorio, SalaReuniones salaReunion, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.usuario = usuario;
        this.espacio = espacio;
        this.escritorio = escritorio;
        this.salaReuniones = salaReunion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public EspacioCoworking getEspacio() {
        return espacio;
    }

    public void setEspacio(EspacioCoworking espacio) {
        this.espacio = espacio;
    }

    public Escritorio getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(Escritorio escritorio) {
        this.escritorio = escritorio;
    }

    public SalaReuniones getSalaReunion() {
        return salaReuniones;
    }

    public void setSalaReunion(SalaReuniones salaReunion) {
        this.salaReuniones = salaReunion;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
}