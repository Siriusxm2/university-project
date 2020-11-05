package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class WantRegistrationController {

    @FXML
    private Button OKButton;


    public  void OKButtonOnAction(ActionEvent event)
    {
        Stage stage = (Stage) OKButton.getScene().getWindow();
        stage.close();
    }
}
