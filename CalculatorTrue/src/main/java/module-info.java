module com.example.calculatortrue {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatortrue to javafx.fxml;
    exports com.example.calculatortrue;
}