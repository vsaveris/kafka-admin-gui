module com.vsaveris.kag {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.vsaveris.kag to javafx.fxml;
    exports com.vsaveris.kag;
    exports com.vsaveris.KafkaAPI;
    opens com.vsaveris.KafkaAPI to javafx.fxml;
}