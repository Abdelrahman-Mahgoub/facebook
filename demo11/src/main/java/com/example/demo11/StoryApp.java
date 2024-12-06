package com.example.demo11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StoryApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Story.fxml"));
            primaryStage.setTitle("Story");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }catch (Exception e){
e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }


}
