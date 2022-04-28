module com.mobita.aether {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mobita.aether to javafx.fxml;
    opens com.mobita.aether.form to javafx.fxml;
    exports com.mobita.aether;
    exports com.mobita.aether.form;
    exports com.mobita.aether.enums;
    opens com.mobita.aether.enums to javafx.fxml;
}