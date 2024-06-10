module com.project2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.project2 to javafx.fxml;
    exports com.project2;
}
