package co.edu.uniquindio.gestionar_contactos.Models;

import javafx.scene.image.Image;
import lombok.*;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private LocalDate diaCumpleaños;
    private Image fotoPerfil;
}



