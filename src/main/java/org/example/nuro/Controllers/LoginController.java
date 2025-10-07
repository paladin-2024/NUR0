package org.example.nuro.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;

public class LoginController {
    @FXML public ChoiceBox<String> acc_selector;
    @FXML public Label payee_address_label;
    @FXML public TextField payee_address_field;
    @FXML public Label password_label;
    @FXML public TextField password_field;
    @FXML public Button login_btn;
    @FXML public Label error_label;

    @FXML
    public void initialize() {
        // Populate ChoiceBox with sample account options
        acc_selector.setItems(FXCollections.observableArrayList("Personal Account", "Business Account", "Savings Account"));
        acc_selector.setValue("Personal Account"); // Default selection

        // Set up login button action
        login_btn.setOnAction(event -> handleLogin());
    }

    private void handleLogin() {
        String account = acc_selector.getValue();
        String payeeAddress = payee_address_field.getText();
        String password = password_field.getText();

        if (payeeAddress.isEmpty() || password.isEmpty()) {
            error_label.setText("Error: All fields are required.");
        } else {
            // Add authentication logic here
            error_label.setText("Login attempt: " + account + ", " + payeeAddress);
        }
    }
}