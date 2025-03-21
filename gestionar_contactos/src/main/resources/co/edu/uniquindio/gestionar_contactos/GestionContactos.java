package co.edu.uniquindio.gestionar_contactos.Models;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class GestionContactos {

    private List<Contacto> contactos;

    public GestionContactos() {
        this.contactos = new LinkedList<>();
    }

    public Contacto crearContacto (String nombre, String apellido, String email, String telefono, String direccion, LocalDate fechaNacimiento) {

        1
    }


}
