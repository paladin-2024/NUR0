package org.example.nuro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL fxmlLocation = App.class.getResource("/fxml/Login.xml");
        if (fxmlLocation == null) {
            throw new IllegalStateException("Cannot find FXML file at /fxml/Login.xml. Check resource path and build configuration.");
        }
        FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("NURO Banking System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}