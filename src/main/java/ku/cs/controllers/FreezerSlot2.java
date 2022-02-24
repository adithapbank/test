package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.service.FXRouter;

import java.io.IOException;

public class FreezerSlot2 {
    @FXML
    void switchToSlotSelection() throws IOException {
        FXRouter.goTo("freezerselectslot");
    }
    @FXML
    void switchToFreezer() throws IOException {
        FXRouter.goTo("freezer");
    }
}
