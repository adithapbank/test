package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.models.Food;
import ku.cs.service.FXRouter;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class RefrigeratorSlot1 {
    @FXML
    private Label fCategoryLabel;
    @FXML
    private Label fExpLabel;
    @FXML
    private ListView<Food> fListView;
    @FXML
    private Label fNameLabel;
    @FXML
    private Label fQuantityLabel;
    @FXML
    private Label fUnitLabel;

    @FXML
    public void switchToRefrigerator() throws IOException {
        FXRouter.goTo("refrigerator");
    }

    @FXML
    public void switchToSlotSelection() throws IOException {
        FXRouter.goTo("refrigeratorselectslot");
    }
}
