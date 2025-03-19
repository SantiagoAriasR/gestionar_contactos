module co.edu.uniquindio.gestionar_contactos {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.gestionar_contactos to javafx.fxml;
    exports co.edu.uniquindio.gestionar_contactos;
}