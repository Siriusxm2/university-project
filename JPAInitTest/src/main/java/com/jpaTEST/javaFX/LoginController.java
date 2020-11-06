package com.jpaTEST.javaFX;

import com.jpaTEST.validator.emailValidator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.io.File;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import  java.net.URL;


public class LoginController extends emailValidator implements Initializable {

    @FXML
    private Button forgotButton = new Button();
    @FXML
    private Button registerButton = new Button();
    @FXML
    private Button closeButton = new Button();
    @FXML
    private Label wrongLabel = new Label();
    @FXML
    private ImageView brandingImageView = new ImageView();
    @FXML
    private ImageView closeButtonImg = new ImageView();
    @FXML
    private TextField emailTextField = new TextField();
    @FXML
    private PasswordField passwordField = new PasswordField();
    private boolean validEmail = false;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("src/main/java/com/jpaTEST/javaFX/imgIcons/828ea1bd-3b83-488f-bcd6-52d5c760c90f_200x200.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File closeFile = new File("src/main/java/com/jpaTEST/javaFX/imgIcons/x-button-icon-13.jpg");
        Image closeImg = new Image(closeFile.toURI().toString());
        closeButtonImg.setImage(closeImg);
    }


    //login buton
    @FXML
    public void onLoginAction(ActionEvent event){
        checkCredentials();
    }

    //бутон забравена параола
    @FXML
    public void forgotOnAction(ActionEvent event) {
        passwordRecovery();
    }

    //buton za registraciq
    @FXML
    public void wantRegisterOnAction(ActionEvent event) {
        wantRegistration();
    }

    //button za izhod
    @FXML
    public void xOnAction(ActionEvent event){
        exitProgram();
    }

    //izvikvane zabravena paraola
    public void passwordRecovery(){
        try{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("PasswordRecoveryForm.fxml"));
            Stage passRecoveryStage = new Stage();
            passRecoveryStage.initStyle(StageStyle.UNDECORATED);
            passRecoveryStage.setScene(new Scene(root, 600, 400 ));
            passRecoveryStage.show();
        }catch (Exception e){

        }
    }

    //izvikvane forma za registraciq
    public void wantRegistration(){
        try{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("WantRegistration.fxml"));
            Stage wantRegisterStage = new Stage();
            wantRegisterStage.initStyle(StageStyle.UNDECORATED);
            wantRegisterStage.setScene(new Scene(root, 300, 400 ));
            wantRegisterStage.show();
        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    public void checkCredentials(){

        if (!emailTextField.getText().isBlank() && !passwordField.getText().isBlank())
        {
            //Proverka za realen email
            if(validEmail)
                wrongLabel.setText("YES");
            else{
                validateEmail(emailTextField.getText(), validEmail, wrongLabel);
            }

        }
        else {
            //не е въведено нещо
            wrongLabel.setText("Please enter email and password!");
        }
    }
/*
    public void emailValidator(String email){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            validEmail = true;
        }
        else {
            validEmail = false;
            wrongLabel.setText("Email has invalid characters");
        }
    }*/

    public void exitProgram(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
