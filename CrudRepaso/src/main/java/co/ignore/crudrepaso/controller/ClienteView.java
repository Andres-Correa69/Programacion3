package co.ignore.crudrepaso.controller;

import co.ignore.crudrepaso.clases.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ClienteView {

    @FXML
    private MenuItem InPerEnva;

    @FXML
    private Button addCliente;

    @FXML
    private Button addEnva;

    @FXML
    private Button addPere;

    @FXML
    private Button addRefri;

    @FXML
    private Button deleteCliente;

    @FXML
    private Button deleteEnva;

    @FXML
    private Button deletePere;

    @FXML
    private Button deleteRefri;

    @FXML
    private Button editCliente;

    @FXML
    private Button editEnva;

    @FXML
    private Button editPere;

    @FXML
    private Button editRefri;

    @FXML
    private TextField inApellido;

    @FXML
    private TableColumn<Cliente, String> inApellidoTable;

    @FXML
    private MenuItem inArgEnva;

    @FXML
    private TextField inCantEnva;

    @FXML
    private TextField inCantPere;

    @FXML
    private TextField inCantRefri;

    @FXML
    private MenuItem inChiEnva;

    @FXML
    private TextField inCodAproRefri;

    @FXML
    private TextField inCodEnva;

    @FXML
    private TextField inCodPere;

    @FXML
    private TextField inCodRefri;

    @FXML
    private MenuItem inColEnva;

    @FXML
    private TextField inDesEnva;

    @FXML
    private TextField inDesPere;

    @FXML
    private TextField inDesRefri;

    @FXML
    private TextField inDireccion;

    @FXML
    private TextField inDocumento;

    @FXML
    private MenuItem inEcuEnva;

    @FXML
    private TextField inEmail;

    @FXML
    private DatePicker inFechaEnva;

    @FXML
    private DatePicker inFechaNacimiento;

    @FXML
    private DatePicker inFechaVenPere;

    @FXML
    private MenuItem inJuridica;

    @FXML
    private MenuItem inNatural;

    @FXML
    private TextField inNomEnva;

    @FXML
    private TextField inNomPere;

    @FXML
    private TextField inNomRefri;

    @FXML
    private TextField inNombre;

    @FXML
    private TableColumn<Cliente, String> inNombreTable;

    @FXML
    private MenuButton inPaisEnva;

    @FXML
    private TextField inPesoEnva;

    @FXML
    private TextField inTelefono;

    @FXML
    private TextField inTempRefri;

    @FXML
    private MenuButton inTipoDoc;

    @FXML
    private TableColumn<Cliente, String> inTipoPersonaTable;

    @FXML
    private TextField inValEnva;

    @FXML
    private TextField inValPere;

    @FXML
    private TextField inValRefri;

    @FXML
    private TableView<Cliente> tableCliente;

    @FXML
    void asignarArgentina(ActionEvent event) {

    }

    @FXML
    void asignarCedula(ActionEvent event) {
        if (inNatural.getText().equals("Natural")) {
            inTipoDoc.setText("Natural");
            inEmail.setDisable(false);
            inFechaNacimiento.setDisable(false);
        }
    }

    @FXML
    void asignarChile(ActionEvent event) {

    }

    @FXML
    void asignarColombia(ActionEvent event) {

    }

    @FXML
    void asignarEcuador(ActionEvent event) {

    }

    @FXML
    void asignarNit(ActionEvent event) {
        //desabilitar infenacimiento, inemail
        System.out.println(inJuridica.getText());

        if ( inJuridica.getText().equals("Juridica")){
            inTipoDoc.setText("Juridica");
            inEmail.setDisable(true);
            inFechaNacimiento.setDisable(true);
        }


    }


    @FXML
    void asignarPeru(ActionEvent event) {

    }

    @FXML
    void agregarCliente(ActionEvent event) {

        Cliente cliente = new Cliente(inNombre.getText() , inApellido.getText(), inDocumento.getText(), inDireccion.getText(), inTelefono.getText(), "wdawd", LocalDate.of(24,01,21), "43432", inTipoDoc.getText());
        inNombreTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombre"));
        inApellidoTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellido"));
        inTipoPersonaTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("tipoCliente"));
        tableCliente.getItems().addAll(cliente);




    }


}
