module com.example.connect_four {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.connect_four to javafx.fxml;
    exports com.example.connect_four;
}