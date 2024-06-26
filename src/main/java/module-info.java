module com.uniquindio.restaurante.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.uniquindio.restaurante.demo to javafx.fxml;
    exports com.uniquindio.restaurante.demo;
    exports Controller;
    opens Controller to javafx.fxml;
    exports model;
    opens model to javafx.fxml;
}