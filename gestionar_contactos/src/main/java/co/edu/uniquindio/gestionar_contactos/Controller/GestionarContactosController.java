package co.edu.uniquindio.gestionar_contactos.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.gestionar_contactos.App.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class GestionarContactosController {
    App app;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="DatePickerFechaCumpleaños"
    private DatePicker DatePickerFechaCumpleaños; // Value injected by FXMLLoader

    @FXML // fx:id="btnRealizarBusqueda"
    private Button btnRealizarBusqueda; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizarContacto"
    private Button btnActualizarContacto; // Value injected by FXMLLoader

    @FXML // fx:id="btnAgregarCliente"
    private Button btnAgregarCliente; // Value injected by FXMLLoader

    @FXML // fx:id="btnEliminarContacto"
    private Button btnEliminarContacto; // Value injected by FXMLLoader

    @FXML // fx:id="btnSeleccionarFotoPerfil"
    private Button btnSeleccionarFotoPerfil; // Value injected by FXMLLoader

    @FXML // fx:id="choiseBoxSeleccionarTipoBusqueda"
    private ChoiceBox<?> choiseBoxSeleccionarTipoBusqueda; // Value injected by FXMLLoader

    @FXML // fx:id="tbcApellido"
    private TableColumn<?, ?> tbcApellido; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCumpleanos"
    private TableColumn<?, ?> tbcCumpleanos; // Value injected by FXMLLoader

    @FXML // fx:id="tbcEmail"
    private TableColumn<?, ?> tbcEmail; // Value injected by FXMLLoader

    @FXML // fx:id="tbcNombre"
    private TableColumn<?, ?> tbcNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tbcNumero"
    private TableColumn<?, ?> tbcNumero; // Value injected by FXMLLoader

    @FXML // fx:id="tblContactos"
    private TableView<?> tblContactos; // Value injected by FXMLLoader

    @FXML // fx:id="txtApellido"
    private TextField txtApellido; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroTelefono"
    private TextField txtNumeroTelefono; // Value injected by FXMLLoader

    @FXML // fx:id="txtRealizarBusqueda"
    private TextField txtRealizarBusqueda; // Value injected by FXMLLoader

    @FXML
    void onActualizarContactoAction(ActionEvent event) {

    }

    @FXML
    void onAgregarContactoAction(ActionEvent event) {

    }

    @FXML
    void onEliminarContactoAction(ActionEvent event) {

    }

    @FXML
    void onSeleccionarFotoAction(ActionEvent event) {

    }

    @FXML
    void onRealizarBusquedaAction(ActionEvent event) {
        System.out.println("Olarte es gay");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert DatePickerFechaCumpleaños != null : "fx:id=\"DatePickerFechaCumpleaños\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert btnActualizarContacto != null : "fx:id=\"btnActualizarContacto\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert btnAgregarCliente != null : "fx:id=\"btnAgregarCliente\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert btnEliminarContacto != null : "fx:id=\"btnEliminarContacto\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert btnRealizarBusqueda != null : "fx:id=\"btnRealizarBusqueda\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert btnSeleccionarFotoPerfil != null : "fx:id=\"btnSeleccionarFotoPerfil\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert choiseBoxSeleccionarTipoBusqueda != null : "fx:id=\"choiseBoxSeleccionarTipoBusqueda\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert tbcApellido != null : "fx:id=\"tbcApellido\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert tbcCumpleanos != null : "fx:id=\"tbcCumpleanos\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert tbcEmail != null : "fx:id=\"tbcEmail\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert tbcNombre != null : "fx:id=\"tbcNombre\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert tbcNumero != null : "fx:id=\"tbcNumero\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert tblContactos != null : "fx:id=\"tblContactos\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert txtNumeroTelefono != null : "fx:id=\"txtNumeroTelefono\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        assert txtRealizarBusqueda != null : "fx:id=\"txtRealizarBusqueda\" was not injected: check your FXML file 'GestionarContactos.fxml'.";

    }

    // Función para el poder instancia sobre app
    public void setApp(App app) {
        this.app = app;
    }

}

