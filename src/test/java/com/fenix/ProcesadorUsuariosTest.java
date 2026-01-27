package com.fenix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ProcesadorUsuariosTest {

    @Test
    public void testProcesarLista() {
        ProcesadorUsuarios pu = new ProcesadorUsuarios();

        List<String> usuarios = Arrays.asList("Ana:1", "Luis:2", "Pedro:1");

        String resultado = pu.procesarLista(usuarios);

        assertEquals("Admins: Ana,Pedro, | Invitados: Luis,", resultado);
    }
}
