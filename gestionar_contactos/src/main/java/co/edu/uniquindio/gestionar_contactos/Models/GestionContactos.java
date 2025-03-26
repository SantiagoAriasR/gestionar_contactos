package co.edu.uniquindio.gestionar_contactos.Models;

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

        if(direccion == null || direccion.isEmpty()){
            throw new Exception("La dirección es obligatoria");
        }

        if(email == null || email.isEmpty()){
            throw new Exception("El email es obligatorio");
        }

        if(password == null || password.isEmpty()){
            throw new Exception("La contraseña es obligatoria");
        }

        if(buscarUsuario(id) != null){
            throw new Exception("El usuario ya existe");
        }

        Usuario usuario = new Usuario(id, nombre, direccion, email, password);
        // Se agrega el usuario a la lista de usuarios
        usuarios.add(usuario);
        // Se registra la billetera del usuario
        registrarBilletera(usuario);
    }

}
