package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.service.FXRouter;

import java.io.IOException;

public class RefrigeratorSlot3 {
    @FXML
    public void switchToRefrigerator() throws IOException {
        FXRouter.goTo("refrigerator");
    }

    @FXML
    public void switchToSlotSelection() throws IOException {
        FXRouter.goTo("refrigeratorselectslot");
    }
}