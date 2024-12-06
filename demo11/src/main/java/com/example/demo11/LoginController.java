package com.example.demo11;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label messageLabel;

    public void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();
        UserDatabase db = new UserDatabase();
        String hashedPassword = com.example.frontend.Hashing.hashPassword(password);

        if (db.authenticate(email, hashedPassword) != null) {
            messageLabel.setText("Login Successful!");
        } else {
            messageLabel.setText("Invalid email or password.");
        }
    }
}


