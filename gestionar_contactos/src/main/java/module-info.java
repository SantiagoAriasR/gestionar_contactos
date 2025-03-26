module co.edu.uniquindio.gestionar_contactos {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.desktop;


    opens co.edu.uniquindio.gestionar_contactos to javafx.fxml;
    opens co.edu.uniquindio.gestionar_contactos.Controller to javafx.fxml;
    exports co.edu.uniquindio.gestionar_contactos.App;
}