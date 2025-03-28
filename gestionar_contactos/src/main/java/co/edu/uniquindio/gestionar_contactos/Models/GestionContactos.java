package co.edu.uniquindio.gestionar_contactos.Models;

import javafx.scene.control.Alert;
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
            Exception nombreVacio = new Exception("El nombre es obligatorio");
            manejarExcepciones(nombreVacio);
            throw nombreVacio;
        }

        if(contacto.getApellido() == null || contacto.getApellido().isEmpty()){
            Exception apellidoVacio = new Exception("El apellido es obligatorio");
            manejarExcepciones(apellidoVacio);
            throw apellidoVacio;
        }

        if(contacto.getTelefono() == null || contacto.getTelefono().isEmpty() || contacto.getTelefono().length() < 10){
            Exception telefonoVacio = new Exception("El telefono es obligatorio");
            manejarExcepciones(telefonoVacio);
            throw telefonoVacio;
        }

        if(contacto.getCorreo() == null || contacto.getCorreo().isEmpty()){
            Exception correoVacio = new Exception("El email es obligatorio");
            manejarExcepciones(correoVacio);
            throw correoVacio;
        }

        if(contacto.getDiaCumpleanos() == null){
            Exception cumpleanosVacio = new Exception("La cumpleaños es obligatorio");
            manejarExcepciones(cumpleanosVacio);
            throw cumpleanosVacio;
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

    public void manejarExcepciones(Exception e){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("No puedes dejar espacios vacios");
        alert.setContentText(e.getMessage());
        alert.showAndWait();
    }
}
