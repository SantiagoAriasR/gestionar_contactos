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
    //Atributos
    private List<Contacto> listaContactos;

    // Constructor
    public GestionContactos() {
        this.listaContactos = new LinkedList<>();
    }

    // Agregar contacto a la lista
    public void registrarContacto(Contacto contacto) throws Exception{

        if(contacto.getNombre() == null || contacto.getNombre().isEmpty()){
            throw new Exception("El id es obligatorio");
        }

        if(contacto.getApellido() == null || contacto.getApellido().isEmpty()){
            throw new Exception("El nombre es obligatorio");
        }

        if(contacto.getTelefono() == null || contacto.getTelefono().isEmpty()){
            throw new Exception("La dirección es obligatoria");
        }

        if(contacto.getCorreo() == null || contacto.getCorreo().isEmpty()){
            throw new Exception("El email es obligatorio");
        }

        if(contacto.getDiaCumpleanos() == null){
            throw new Exception("La contraseña es obligatoria");
        }

        if(buscarContacto(contacto.getTelefono()) != null){
            throw new Exception("El usuario ya existe");
        }

        listaContactos.add(contacto);
    }

    // Funcion para buscar si el contacto existe dependiendo el numero de telefono
    public Contacto buscarContacto(String telefono){
        return listaContactos.stream()
                .filter(contacto -> contacto.getTelefono().equals(telefono))
                .findFirst()
                .orElse(null);
    }

    // Funcion para eliminar Contactos
    public boolean eliminarContacto(String telefono){
        boolean centinela = false;
        for(Contacto contacto: listaContactos){
            if(contacto.getTelefono().equals(telefono)){
                listaContactos.remove(contacto);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarContacto(String telefono, Contacto actualizado){
        boolean centinela = false;
        for(Contacto contacto : listaContactos){
            if(contacto.getTelefono().equals(telefono)){
                contacto.setNombre(actualizado.getNombre());
                contacto.setApellido(actualizado.getApellido());
                contacto.setCorreo(actualizado.getCorreo());
                contacto.setTelefono(actualizado.getTelefono());
                contacto.setDiaCumpleanos(actualizado.getDiaCumpleanos());
                contacto.setFotoPerfil(actualizado.getFotoPerfil());
                centinela = true;
                break;
            }
        }
        return centinela;
    }
}
