
package com.mycompany.studentmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class UserRegistrationController implements Initializable {

    @FXML
    private Button nextButton;
    @FXML
    private Button cancelButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Alert alrt = new Alert(Alert.AlertType.WARNING);
        alrt.setTitle("Sample Only");
        alrt.setContentText("Sampleing Only");
        alrt.showAndWait();
    }

    @FXML
    private void cancelButtonAction(ActionEvent event) {
    }
    
}
