package co.edu.uniquindio.gestionar_contactos.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.gestionar_contactos.App.App;
import co.edu.uniquindio.gestionar_contactos.Models.Contacto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GestionarContactosController {

    App app;

    // Crear la lista de la tabla
    ObservableList<Contacto> listaContactos = FXCollections.observableArrayList();
    Contacto selectedContacto;

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
    private ChoiceBox<String> choiseBoxSeleccionarTipoBusqueda; // Value injected by FXMLLoader

    @FXML // fx:id="tbcApellido"
    private TableColumn<Contacto, String> tbcApellido; // Value injected by FXMLLoader

    @FXML // fx:id="tbcCumpleanos"
    private TableColumn<Contacto, String> tbcCumpleanos; // Value injected by FXMLLoader

    @FXML // fx:id="imageFotoPerfil"
    private ImageView imageFotoPerfil; // Value injected by FXMLLoader

    @FXML // fx:id="tbcEmail"
    private TableColumn<Contacto, String> tbcEmail; // Value injected by FXMLLoader

    @FXML // fx:id="tbcNombre"
    private TableColumn<Contacto, String> tbcNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tbcNumero"
    private TableColumn<Contacto, String> tbcNumero; // Value injected by FXMLLoader

    @FXML // fx:id="tblContactos"
    private TableView<Contacto> tblContactos; // Value injected by FXMLLoader

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
        actualizarContacto();
    }

    @FXML
    void onAgregarContactoAction(ActionEvent event) {
        agregarContacto();
    }

    @FXML
    void onEliminarContactoAction(ActionEvent event) {
        eliminarContacto();
    }

    @FXML
    void onSeleccionarFotoAction(ActionEvent event) {
        //seleccionarFotoPerfil();
    }

    @FXML
    void onRealizarBusquedaAction(ActionEvent event) {
        //realizarBusqueda();
    }

    // Función para el poder instancia sobre app
    public void setApp(App app) {
        this.app = app;
        initView();
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
        assert imageFotoPerfil != null : "fx:id=\"imageFotoPerfil\" was not injected: check your FXML file 'GestionarContactos.fxml'.";
        configurarChoiceBoxBusqueda();
    }

    // Metodo para agregar los datos quemados a nuestros ChoiceBox
    public void configurarChoiceBoxBusqueda() {
        // Obtener la lista de clientes (ahora LinkedList) de la empresa
        choiseBoxSeleccionarTipoBusqueda.setItems(FXCollections.observableArrayList("Telefono", "Nombre"));
    }


    private void initView() {
        // Traer los datos a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerContactos();

        // Limpiar la tabla
        tblContactos.getItems().clear();

        // Agregar los elementos a la tabla
        tblContactos.setItems(listaContactos);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    // Configuración de la tabla (celdas,filas,tipo de datos...)
    private void initDataBinding() {
        tbcNombre
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre().toString()));
        tbcApellido
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido().toString()));
        tbcEmail
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo().toString()));
        tbcNumero
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono().toString()));
        tbcCumpleanos
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDiaCumpleanos().toString()));
    }

    // Función para obtener los alquileres
    private void obtenerContactos() {
        listaContactos.addAll(app.getGestionContactos().getListaContactos());
    }

    // Función para seleccionar elementos de la tabla (Escuchado ó Listener)
    public void listenerSelection() {
        tblContactos.getSelectionModel().selectedItemProperty()
                .addListener((obs, oldSelection, newSelection) -> {
                    selectedContacto = newSelection;
                    mostrarInformacionContacto(selectedContacto);
                });
        ;
    }

    // Función para mostrar información en los elementos una vez seleccionado uno de
    // la tabla
    private void mostrarInformacionContacto(Contacto contacto) {
        if (contacto != null) {
            txtNombre.setText(contacto.getNombre().toString());
            txtApellido.setText(contacto.getApellido().toString());
            txtEmail.setText(contacto.getCorreo());
            txtNumeroTelefono.setText(contacto.getTelefono().toString());
            DatePickerFechaCumpleaños.setValue(contacto.getDiaCumpleanos());
        }
    }

    // Funcion agregar Empleado a la tabla
    private void agregarContacto() {
        try {
            Contacto contacto = buildContacto();
            app.getGestionContactos().registrarContacto(contacto);
            limpiarCamposContactos();
            listaContactos.add(contacto);
            System.out.println("Contacto agregado con éxito.");
        } catch (Exception e) {
            System.out.println("Error al agregar contacto: " + e.getMessage());
        }
    }

    // Función para construir un nuevo Contacto
    private Contacto buildContacto() {
        return Contacto.builder()
                .nombre(txtNombre.getText())
                .apellido(txtApellido.getText())
                .telefono(txtNumeroTelefono.getText())
                .correo(txtEmail.getText())
                .diaCumpleanos(DatePickerFechaCumpleaños.getValue())
                .fotoPerfil(imageFotoPerfil.getImage())
                .build();
    }

    // Funcion para elimiar contacto de la tabla
    public void eliminarContacto() {
        if (app.getGestionContactos().eliminarContacto(txtNumeroTelefono.getText())) {
            listaContactos.remove(selectedContacto);
            limpiarCamposContactos();
            limpiarSeleccion();
        }
    }

    // Funcion para actualizar Alquiler
    private void actualizarContacto() {
        if (selectedContacto != null &&
                app.getGestionContactos().actualizarContacto(selectedContacto.getTelefono(), buildContacto())) {

            int index = listaContactos.indexOf(selectedContacto);
            if (index >= 0) {
                listaContactos.set(index, buildContacto());
            }

            tblContactos.refresh();
            limpiarSeleccion();
            limpiarCamposContactos();
        }
    }

    // Función para limpiar la selección
    private void limpiarSeleccion() {
        tblContactos.getSelectionModel().clearSelection();
        limpiarCamposContactos();
    }
    // Función limpiar campos compra
    private void limpiarCamposContactos() {
        txtEmail.clear();
        txtNumeroTelefono.clear();
        txtApellido.clear();
        txtNombre.clear();
        DatePickerFechaCumpleaños.setValue(null);
    }
}

