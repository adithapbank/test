package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.service.FXRouter;

import java.io.IOException;

public class RefrigeratorSlotSelector {
    @FXML
    public void switchToFridge() throws IOException {
        FXRouter.goTo("fridge");
    }

    @FXML
    public void switchToSlot1() throws IOException {
        FXRouter.goTo("refrigeratorslot1");
    }
    @FXML
    public void switchToSlot2() throws IOException{
        FXRouter.goTo("refrigeratorslot2");
    }
    @FXML
    public void switchToSlot3() throws IOException{
        FXRouter.goTo("refrigeratorslot3");
    }
    @FXML
    public void switchToSlot4() throws IOException{
        FXRouter.goTo("refrigeratorslot4");
    }
    @FXML
    public void switchToSlot5() throws IOException{
        FXRouter.goTo("refrigeratorslot5");
    }
    @FXML
    public void switchToSlot6() throws IOException{
        FXRouter.goTo("refrigeratorslot6");
    }
}
