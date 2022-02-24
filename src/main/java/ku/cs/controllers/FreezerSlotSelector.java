package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.service.FXRouter;

import java.io.IOException;

public class FreezerSlotSelector {

    @FXML
    public void switchToFridge() throws IOException {
        FXRouter.goTo("fridge");
    }

    @FXML
    public void switchToSlot1() throws IOException {
        FXRouter.goTo("freezerslot1");
    }

    @FXML
    public void switchToSlot2() throws IOException{
        FXRouter.goTo("freezerslot2");
    }
}
