package sample;

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
import java.net.PasswordAuthentication;
import java.util.ResourceBundle;

import  java.net.URL;


public class LoginController implements Initializable {

    @FXML
    private Button forgotButton;
    @FXML
    private  Button registerButton;
    @FXML
    private  Label wrongLabel;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField PasswordField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("Props/828ea1bd-3b83-488f-bcd6-52d5c760c90f_200x200.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);
    }


    //login buton
    public  void loginButtonOnAction(ActionEvent event){

        if (emailTextField.getText().isBlank() == false && PasswordField.getText().isBlank() == false)
        {
            //има въведена параола и e-mail, проверка в базата данни
        }
        else {
            wrongLabel.setText("Please enter email and password!");      //не е въведено нещо
        }
    }

    //бутон забравена параола
    public  void forgotButtonOnAction(ActionEvent event)
    {
        passwordRecovery();
    }
    //buton za registraciq
    public  void registerButtonOnAction(ActionEvent event)
    {
        wantRegistration();
    }
    //izvikvane zabravena paraola
    public void passwordRecovery(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Password Recovery Form.fxml"));
            Stage passRecoveryStage = new Stage();
            passRecoveryStage.initStyle(StageStyle.UNDECORATED);
            passRecoveryStage.setScene(new Scene(root, 600, 400 ));
            passRecoveryStage.show();

        }catch (Exception e){

        }
    }
    //izvikvane forma za registraciq
    public  void wantRegistration(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("WantRegistration.fxml"));
            Stage wantRegisterStage = new Stage();
            wantRegisterStage.initStyle(StageStyle.UNDECORATED);
            wantRegisterStage.setScene(new Scene(root, 300, 400 ));
            wantRegisterStage.show();

        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

}
