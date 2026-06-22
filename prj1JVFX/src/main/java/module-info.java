module com.mycompany.prj1jvfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.prj1jvfx to javafx.fxml;
    exports com.mycompany.prj1jvfx;
}
