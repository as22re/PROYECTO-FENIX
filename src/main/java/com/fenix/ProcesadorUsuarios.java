package com.fenix;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que procesa listas de usuarios separándolos en administradores e invitados.
 */
public class ProcesadorUsuarios {
    private static final int ROL_ADMIN = 1;
    private static final int ROL_INVITADO = 2;
    /**
     * Procesa una lista de usuarios con formato "nombre:rol" y devuelve un resumen.
     *
     * @param dataList Lista de usuarios, cada uno con "nombre:rol".
     * @return Cadena con los nombres de administradores e invitados.
     */
    public String procesarLista(List<String> dataList) {
        String admins = "";
        String invitados = "";

        for (String u : dataList) {
            String[] parts = u.split(":"); // Formato "nombre:rol"
            if (parts.length == 2) {
                String nombre = parts[0];
                int rol = Integer.parseInt(parts[1]);

                if (rol == ROL_ADMIN) {
                    admins += procesarAdmin(nombre);
                }
                else if (rol == ROL_INVITADO) {
                    invitados += procesarInvitado(nombre);
                }
            }
        }
        return "Admins: " + admins + " | Invitados: " + invitados;
    }
    private String procesarAdmin(String nombre){
        return nombre + ",";
    }

    private String procesarInvitado(String nombre){
        return nombre + ",";
    }
}