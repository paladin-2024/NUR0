module org.example.nuro {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires com.almasb.fxgl.scene;

    opens org.example.nuro to javafx.fxml;
    exports org.example.nuro;
    exports org.example.nuro.Controllers;
    exports org.example.nuro.Models;
    exports org.example.nuro.Views;
}