module se.iths.java21.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens se.iths.java21.javafx to javafx.fxml;
    exports se.iths.java21.javafx;
}