package ku.cs.controllers;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import javafx.scene.paint.Material;

import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.service.FXRouter;

public class Refrigeratorlist {
    @FXML
    private TextField material;
    @FXML
    public void switchToRefrigertor()throws IOException{
        FXRouter.goTo("refrigerator");
    }
    @FXML
    public void addMaterial() throws IOException{
        material.getText();
        ObservableList<Material> items = FXCollections.observableArrayList();
    }
}
