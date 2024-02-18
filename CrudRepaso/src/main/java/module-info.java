module co.ignore.crudrepaso {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.ignore.crudrepaso to javafx.fxml;
    exports co.ignore.crudrepaso;
    exports co.ignore.crudrepaso.controller;
    opens co.ignore.crudrepaso.controller to javafx.fxml;
    exports co.ignore.crudrepaso.clases;
    opens co.ignore.crudrepaso.clases to javafx.fxml;
}