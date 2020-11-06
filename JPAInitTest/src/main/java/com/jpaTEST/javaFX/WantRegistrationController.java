package com.jpaTEST.javaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class WantRegistrationController {

    @FXML
    private Button OKButton;

    @FXML
    public  void okOnAction(ActionEvent event)
    {
        closeDialog();
    }

    public void closeDialog(){
        Stage stage = (Stage) OKButton.getScene().getWindow();
        stage.close();
    }
}
