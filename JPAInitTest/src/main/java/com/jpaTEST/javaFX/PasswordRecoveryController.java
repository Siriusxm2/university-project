package com.jpaTEST.javaFX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PasswordRecoveryController implements Initializable {

    @FXML
    private Button submitButton = new Button();
    @FXML
    private Button closeButton = new Button();
    @FXML
    private ImageView closeButtonImg = new ImageView();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File closeFile = new File("src/main/java/com/jpaTEST/javaFX/imgIcons/x-button-icon-13.jpg");
        Image closeImg = new Image(closeFile.toURI().toString());
        closeButtonImg.setImage(closeImg);
    }

    @FXML
    public void xOnAction(ActionEvent event){
        closeDialog();
    }

    @FXML
    public  void submitOnAction(ActionEvent event) {
        checkCredentials();
    }

    public void checkCredentials(){
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
        // da se izprashta zaqvka do administrator-a ako dannite suvpadat ako ne da izkarva suobshtenie za greshka
    }

    public void closeDialog(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
