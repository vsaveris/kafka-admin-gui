package com.vsaveris.kag;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class KafkaAdminGui extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KafkaAdminGui.class.getResource("kafka-admin-gui-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320*3, 240*3);
        stage.setTitle("KAG - Kafka Administration GUI");
        stage.getIcons().add(new Image(KafkaAdminGui.class.getResource("apache-kafka-icon.png").toString()));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}