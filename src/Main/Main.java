package Main;
import Plataforma.Escritorio;
import Plataforma.Servicio;
import Plataforma.Usuario;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que necesitas?");


// Create a new instance of Servicio
Servicio servicio1 = new Servicio("Impresora", 3.5);
Servicio servicio2 = new Servicio("Cafeteria", 10.0);

// Create instances of Escritorio
        Escritorio escritorio1 = new Escritorio(1);
        Escritorio escritorio2 = new Escritorio(2);
        Escritorio escritorio3 = new Escritorio(3);

    }
}

