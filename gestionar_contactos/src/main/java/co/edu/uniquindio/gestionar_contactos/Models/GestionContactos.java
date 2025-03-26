package co.edu.uniquindio.gestionar_contactos.Models;

import javafx.scene.image.Image;
import lombok.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class GestionContactos {
    private List<Contacto> listaContactos;

    public GestionContactos() {
        this.listaContactos = new LinkedList<>();
    }

    public void registrarContacto(String nombre, String apellido, String telefono, String correo, LocalDate diaCumpleanos, Image fotoPerfil) throws Exception{

        if(nombre == null || nombre.isEmpty()){
            throw new Exception("El id es obligatorio");
        }

        if(apellido == null || apellido.isEmpty()){
            throw new Exception("El nombre es obligatorio");
        }

        if(telefono == null || telefono.isEmpty()){
            throw new Exception("La dirección es obligatoria");
        }

        if(correo == null || correo.isEmpty()){
            throw new Exception("El email es obligatorio");
        }

        if(diaCumpleanos == null){
            throw new Exception("La contraseña es obligatoria");
        }

        if(buscarContacto(telefono) != null){
            throw new Exception("El usuario ya existe");
        }

        Contacto contacto = new Contacto(nombre, apellido, telefono, correo, diaCumpleanos, fotoPerfil);
        // Se agrega el usuario a la lista de usuarios
        listaContactos.add(contacto);
    }

    public Contacto buscarContacto(String telefono){
        return listaContactos.stream()
                .filter(contacto -> contacto.getTelefono().equals(telefono))
                .findFirst()
                .orElse(null);
    }

}
