package co.ignore.crudrepaso.controller;

import co.ignore.crudrepaso.clases.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

import java.time.LocalDate;

public class ClienteView {

    @FXML
    private MenuItem inCholosEnva;

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
    private TableColumn<Cliente, String> inIdentificacionTable;

    @FXML
    private TableColumn<Cliente, String> inDireccionTable;

    @FXML
    private TableColumn<Cliente, String> inTelefonoTable;

    @FXML
    private TableColumn<Cliente, LocalDate> inFechaNaTable;
    @FXML
    private TableColumn<Cliente, String> inEmailTable;
    @FXML
    private TableView<TableProducto> tableProductoView;
    @FXML
    private TableColumn<TableProducto, String> inCodTable;
    @FXML
    private TableColumn<TableProducto, LocalDate> inFeVenPereTable;
    @FXML
    private TableColumn<TableProducto, String> inTipoProTable;
    @FXML
    private TableColumn<TableProducto, String> inNomProTable;
    @FXML
    private TableColumn<TableProducto, String> inDesProTable;
    @FXML
    private TableColumn<TableProducto, Integer> inValProTable;
    @FXML
    private TableColumn<TableProducto, Integer> inCantProTable;
    @FXML
    private TableColumn<TableProducto, String> inCodAprovProTable;
    @FXML
    private TableColumn<TableProducto, String> inTempRefriProTable;
    @FXML
    private TableColumn<TableProducto, LocalDate> inFeEnvaTable;
    @FXML
    private TableColumn<TableProducto, Integer> inPesoEnvaTable;
    @FXML
    private TableColumn<TableProducto, String> inPaisEnvaTable;
    @FXML
    private TextField inIdenSeleCliente;
    @FXML
    private TextField inCodSeleProducto;
    @FXML
    private TextField inNomSeleCliente;
    @FXML
    private TextField inNomSeleProducto;
    private String identificacion;
    private String codigo = "";

    Cliente clienteSeleccionado = new Cliente();
    TableProducto productoSeleccionado = new TableProducto();

    @FXML
    void asignarArgentina(ActionEvent event) {
        if (inArgEnva.getText().equals("Argentina")){
            inPaisEnva.setText("Argentina");



        }
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
        if (inChiEnva.getText().equals("Chile")){
            inPaisEnva.setText("Chile");
        }

    }

    @FXML
    void asignarColombia(ActionEvent event) {
        if (inColEnva.getText().equals("Colombia")){
            inPaisEnva.setText("Colombia");
        }

    }

    @FXML
    void asignarEcuador(ActionEvent event) {
        if (inEcuEnva.getText().equals("Ecuador")){
            inPaisEnva.setText("Ecuador");

        }

    }

    @FXML
    void asignarNit(ActionEvent event) {
        //desabilitar infenacimiento, inemail


        if ( inJuridica.getText().equals("Juridica")){
            inTipoDoc.setText("Juridica");
            inEmail.setDisable(true);
            inFechaNacimiento.setDisable(true);
        }


    }


    @FXML
    void asigPeru(ActionEvent event) {
        if (inCholosEnva.getText().equals("Peru")){
            inPaisEnva.setText("Peru");

        }


    }

    @FXML
    void agregarCliente(ActionEvent event) {

        Cliente cliente = new Cliente(inNombre.getText() , inApellido.getText(), inDocumento.getText(), inDireccion.getText(), inTelefono.getText(), inEmail.getText(), inFechaNacimiento.getValue(),  inTipoDoc.getText());
        inNombreTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombre"));
        inApellidoTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellido"));
        inTipoPersonaTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("tipoCliente"));
        inIdentificacionTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("identificacion"));
        inDireccionTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("direccion"));
        inTelefonoTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("telefono"));
        inFechaNaTable.setCellValueFactory(new PropertyValueFactory<Cliente, LocalDate>("fechaNacimiento"));
        inEmailTable.setCellValueFactory(new PropertyValueFactory<Cliente, String>("email"));
        tableCliente.getItems().addAll(cliente);
        inNombre.clear();
        inApellido.clear();
        inDocumento.clear();
        inDireccion.clear();
        inTelefono.clear();
        inFechaNacimiento.setValue(null);
        inEmail.clear();
        inTipoDoc.setText("Seleccione");

    }
    @FXML
    void agregarPere(ActionEvent event) {


        TableProducto tableProducto = new TableProducto(inCodPere.getText(), inNomPere.getText(), inDesPere.getText(), Integer.parseInt(inValPere.getText()), Integer.parseInt(inCantPere.getText()), "Perecedero", LocalDate.of(2024,12,1), 2, "", inFechaVenPere.getValue(), "", "");
        inCodTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("codigo"));
        inNomProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("nombre"));
        inDesProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("descripcion"));
        inValProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, Integer>( "valorUnitario"));
        inCantProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, Integer>( "cantExistente"));
        inFeVenPereTable.setCellValueFactory(new PropertyValueFactory<TableProducto, LocalDate>("fechaVencimiento"));
        inTipoProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("tipoProducto"));
        tableProductoView.getItems().addAll(tableProducto);
        inCodPere.clear();
        inNomPere.clear();
        inDesPere.clear();
        inValPere.clear();
        inCantPere.clear();
        inFechaVenPere.setValue(null);
    }

    @FXML
    void agregarRefrigerado(ActionEvent event) {
        TableProducto tableProducto = new TableProducto(inCodRefri.getText(), inNomRefri.getText(), inDesRefri.getText(), Integer.parseInt(inValRefri.getText()), Integer.parseInt(inCantRefri.getText()), "Refrigerados", LocalDate.of(2024,12,1), 2, "", inFechaVenPere.getValue(), inCodAproRefri.getText(), inTempRefri.getText());
        inCodTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("codigo"));
        inNomProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("nombre"));
        inDesProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("descripcion"));
        inValProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, Integer>( "valorUnitario"));
        inCantProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, Integer>( "cantExistente"));
        inTipoProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("tipoProducto"));
        inCodAprovProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("codigoAprovacion"));
        inTempRefriProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("temperaturaRefrigeracion"));
        tableProductoView.getItems().addAll(tableProducto);
        inCodRefri.clear();
        inNomRefri.clear();
        inDesRefri.clear();
        inValRefri.clear();
        inCantRefri.clear();
        inCodAproRefri.clear();
        inTempRefri.clear();

    }

    @FXML
    void agregarEnvasados(ActionEvent event) {
        TableProducto tableProducto = new TableProducto(inCodEnva.getText(), inNomEnva.getText(), inDesEnva.getText(), Integer.parseInt(inValEnva.getText()), Integer.parseInt(inCantEnva.getText()), "Envasados", inFechaEnva.getValue(), Integer.parseInt(inPesoEnva.getText()), inPaisEnva.getText(), inFechaVenPere.getValue(), inCodAproRefri.getText(), inTempRefri.getText());
        inCodTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("codigo"));
        inNomProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("nombre"));
        inDesProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("descripcion"));
        inValProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, Integer>( "valorUnitario"));
        inCantProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, Integer>( "cantExistente"));
        inTipoProTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("tipoProducto"));
        inPesoEnvaTable.setCellValueFactory(new PropertyValueFactory<TableProducto, Integer>("peso"));
        inFeEnvaTable.setCellValueFactory(new PropertyValueFactory<TableProducto, LocalDate>("fechaEnvasado"));
        inPaisEnvaTable.setCellValueFactory(new PropertyValueFactory<TableProducto, String>("pais"));
        tableProductoView.getItems().addAll(tableProducto);
        inCodEnva.clear();
        inNomEnva.clear();
        inDesEnva.clear();
        inValEnva.clear();
        inCantEnva.clear();
        inPesoEnva.clear();
        inFechaEnva.setValue(null);
        inPaisEnva.setText("Seleccione");

    }

   @FXML
   private void initialize(){
        listenerPosicionCliente();
        listenerPosicionProducto();

   }

    private void listenerPosicionCliente(){
        tableCliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            clienteSeleccionado = newSelection;
            if(clienteSeleccionado!=null) {
                identificacion = clienteSeleccionado.getIdentificacion();
                codigo = "";
            }
        });
    }

    private void listenerPosicionProducto(){

        tableProductoView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            productoSeleccionado = newSelection;
            if(productoSeleccionado!=null) {
                identificacion = "";
                codigo = productoSeleccionado.getCodigo();
            }
        });

    }


    @FXML
    void eliminarEvento(ActionEvent event) {

        if(identificacion != ""){
            ObservableList<Cliente> nombre= FXCollections.observableArrayList();
            nombre.addAll(tableCliente.getItems());
            Cliente cliente = nombre.stream().filter(cliente1 -> cliente1.getIdentificacion().equals(identificacion)).findAny().get();
            nombre.remove(cliente);
            tableCliente.setItems(nombre);
            tableCliente.refresh();
        } else if (codigo != "") {
            ObservableList<TableProducto> codigo1= FXCollections.observableArrayList();
            codigo1.addAll(tableProductoView.getItems());
            TableProducto tableProducto = codigo1.stream().filter(tableProducto1 -> tableProducto1.getCodigo().equals(codigo)).findAny().get();
            codigo1.remove(tableProducto);
            tableProductoView.setItems(codigo1);
            tableProductoView.refresh();
        }else {
            JOptionPane.showConfirmDialog(null, "Seleccione un elemento de cualquier lista");

        }


    }
}
