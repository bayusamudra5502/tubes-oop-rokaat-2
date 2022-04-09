module com.mobita.aether {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mobita.aether to javafx.fxml;
    exports com.mobita.aether;
}