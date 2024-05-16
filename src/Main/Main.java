package Main;


import Plataforma.Escritorio;
import Plataforma.SalaReuniones;
import Plataforma.Servicio;
import Plataforma.Usuario;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int eleccion;
        Scanner objeto = new Scanner(System.in);

        Servicio servicio1 = new Servicio("Impresora", 3.5);
        Servicio servicio2 = new Servicio("Cafeteria", 10.0);

        Usuario usuario1 = new Usuario("Juan", "someValue" , "12345678");

        Usuario usuario2 = new Usuario("Pedro", "destino@gmail.com", "12345678");
        Escritorio escritorio1 = new Escritorio(1);
        Escritorio escritorio2 = new Escritorio(2);
        Escritorio escritorio3 = new Escritorio(3);

        SalaReuniones SalaStream = new SalaReuniones("SalaStreaming", 10);
        SalaReuniones Salaproyecto = new SalaReuniones("Salaproyecto", 20);





        System.out.println("Que necesitas?");
        System.out.println("1. Escritorio");
        System.out.println("2. Sala de reuniones");


         eleccion =objeto.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Escritorios disponibles: ");
                System.out.println("Escritorio 1");
                System.out.println("Escritorio 2");
                System.out.println("Escritorio 3");
                int eleccion2  ;

                    eleccion2 = objeto.nextInt();
                    switch (eleccion2) {
                        case 1:
                            escritorio1.Disponible();
                            break;
                        case 2:
                            escritorio2.Disponible();
                            break;
                        case 3:
                            escritorio3.Disponible();
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                break;
            case 2:
                System.out.println("Salas disponibles:");
                System.out.println("1. Seleccionaste la sala de reuniones SalaStreaming.");
                System.out.println("2. Seleccionaste la sala de reuniones Salaproyecto.");
                int eleccion3 = objeto.nextInt();
                switch (eleccion3) {
                    case 1:
                        SalaStream.Disponible();
                        break;
                    case 2:
                        Salaproyecto.Disponible();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                break;
            default:

                System.out.println("Opción no válida.");
                break;
        }

    }

    }

