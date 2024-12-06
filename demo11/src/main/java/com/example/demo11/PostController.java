package com.example.demo11;

import Backend.Posts;
import Backend.SaveContent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PostController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField text;
    @FXML
    //these variables so i can change from one screen to another
    private ImageView img;
    private Stage stage;
    private Scene scene;
    private Parent parent;
private int id= 1000;
private Posts p = new Posts(String.valueOf(id),"1000","x");
// to get the last content id
    public PostController() {
        JSONParser parser = new JSONParser();
        try {
            FileReader read = new FileReader("content.json");
            JSONArray load = (JSONArray) parser.parse(read);
            JSONObject object =(JSONObject) load.get(0);
            String contentID = (String) object.get("Content id");
            id=Integer.parseInt(contentID);
            id++;
        }    catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
    @FXML

    protected void onHelloButtonClick(ActionEvent event) {
  try{
   String s = text.getText();
   if(s==""){
       welcomeText.setText("error");
   }
   else{
       p.setContent(text.getText());
       p.setAuthorID("1000");
       p.setContentID(String.valueOf(id));
       id++;
       SaveContent save = new SaveContent();
       save.save(p);
       Parent root = FXMLLoader.load(FeedApplication.class.getResource("feed.fxml"));
       stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
       scene= new Scene(root);
       stage.setScene(scene);
       stage.show();
        }
    }
    catch (Exception e){
      e.printStackTrace();
    }}
    @FXML
    protected void addpic(){
        try {
            FileChooser f = new FileChooser();
            Window stage =img.getScene().getWindow();
            File tmp= f.showOpenDialog(stage);
            Image image = new Image(tmp.getAbsolutePath());
            img.setImage(image);
            p.setImage(tmp.getAbsolutePath());
        }
        catch (Exception e){
            welcomeText.setText("error");
        }
    }
}