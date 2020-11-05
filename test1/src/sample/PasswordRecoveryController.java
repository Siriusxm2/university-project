package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PasswordRecoveryController {

    @FXML
    private Button submitButton;

    public  void OKButtonOnAction(ActionEvent event)
    {
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
        // da se izprashta zaqvka do administrator-a ako dannite suvpadat ako ne da izkarva suobshtenie za greshka
    }

}
