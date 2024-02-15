module co.ignore.crudrepaso {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.ignore.crudrepaso to javafx.fxml;
    exports co.ignore.crudrepaso;
}