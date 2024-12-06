package com.example.demo11;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class SignupController {
    @FXML
    private TextField emailField;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private DatePicker dobPicker;

    @FXML
    private void handleSignUp() {
        String email = emailField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        LocalDate dob = dobPicker.getValue();

        if (email.isEmpty() || username.isEmpty() || password.isEmpty() || dob == null) {
            System.out.println("All fields are required.");
            return;
        }

        UserDatabase database = new UserDatabase();
        String hashedPassword = com.example.frontend.Hashing.hashPassword(password);

        boolean success = database.addUser(email, username, hashedPassword, dob);
        if (success) {
            System.out.println("Signup successful.");
        } else {
            System.out.println("Email already exists.");
        }
    }
}










