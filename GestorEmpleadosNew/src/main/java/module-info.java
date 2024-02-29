module org.example.gestorempleadosnew {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gestorempleadosnew to javafx.fxml;
    exports org.example.gestorempleadosnew;
}