package ku.cs.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.service.FXRouter;

public class Fridge {

    @FXML
    public void switchToPrimary()throws IOException{
        FXRouter.goTo("primary");
    }

    @FXML
    public void switchToRefrigeratorSelection() throws IOException {
        FXRouter.goTo("refrigeratorselectslot");
    }

    @FXML
    public void switchToFreezerSelection()throws IOException{
        FXRouter.goTo("freezerselectslot");
    }

}

