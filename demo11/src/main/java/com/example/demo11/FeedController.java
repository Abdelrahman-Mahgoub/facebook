package com.example.demo11;

import Backend.Content;
import Backend.SaveContent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FeedController implements Initializable {

    @FXML
    private VBox contentsContainer;
private ScrollPane scroll;
    private SaveContent save= new SaveContent();
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

            save.loadContent();
save.removeExpired();
            ArrayList<Content> contents= save.returnall();
            for(int i=0; i<contents.size();i++){
             VBox vbox = new VBox();





                if(contents.get(i).getImage()==null){
                    Text text = new Text(contents.get(i).getAuthorID() + "\n" + contents.get(i).getTime() +"\n");
                    vbox.getChildren().add(text);

                    Text write= new Text("\n" + contents.get(i).getContent() +"\n");
                    vbox.getChildren().add(write);
                }
                else {
                    Text text = new Text(contents.get(i).getAuthorID() + "\n" + contents.get(i).getTime() +"\n");
                    vbox.getChildren().add(text);
                    Image img = new Image(contents.get(i).getImage());
                    ImageView  image= new ImageView(img);
                    vbox.getChildren().add(image);
                    Text write= new Text("\n" + contents.get(i).getContent()+ "\n");
                    vbox.getChildren().add(write);

                }
contentsContainer.getChildren().add(vbox);
            }

        }
        @FXML
    private Label Name;
    @FXML
    private Label Date;
    @FXML
    private Label type;
    @FXML
    private ImageView img;
    private Label content;
    private Stage stage;
    private Scene scene;
    private Parent parent;

    @FXML
    protected void NewPost(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(PostApplication.class.getResource("hello-view.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void NewStory(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(StoryApp.class.getResource("Story.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



}
