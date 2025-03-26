package co.edu.uniquindio.gestionar_contactos.App;

import co.edu.uniquindio.gestionar_contactos.Controller.GestionarContactosController;
import co.edu.uniquindio.gestionar_contactos.Models.GestionContactos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    // Creamos nuestra empresa ya que se instancia una sola vez
    public static GestionContactos gestionContactos = new GestionContactos();
    private Stage primaryStage;

    public GestionContactos getGestionContactos() {
        return gestionContactos;
    }


    // Metodo start
        @Override
        public void start(Stage primaryStage) throws IOException {
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("Gestionar Contactos");
            openViewGestionarContactos();
        }

    // Open View Gestionar Contactos
    public void openViewGestionarContactos() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/gestionar_contactos/GestionarContactos.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            GestionarContactosController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch();
    }
}

