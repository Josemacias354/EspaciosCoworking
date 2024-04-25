package Main;
import Plataforma.Usuario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public void testNombreUsuario() {
        Usuario usuario = new Usuario("Jose", "jose@gmail.com", "1234");
        usuario.setNombre();
        assertEquals("Jose", usuario.getNombre());
    }

    // Aquí puedes agregar más métodos de prueba para los otros métodos en la clase Usuario
}