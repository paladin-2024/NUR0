package org.example.nuro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Login.xml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("NURO Banking System");
        stage.setScene(scene);
        stage.show();
    }
}
