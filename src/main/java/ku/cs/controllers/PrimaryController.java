package ku.cs.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import ku.cs.App;
import ku.cs.service.FXRouter;

public class PrimaryController {


    public Button primaryButton;

    @FXML
    private void switchToSecondary() throws IOException {
        FXRouter.goTo("secondary");
    }

    @FXML
    private void logout() throws IOException {
        FXRouter.goTo("login");
    }

    @FXML
    public void switchToFridge()throws  IOException{
        FXRouter.goTo("fridge");
    }



}
