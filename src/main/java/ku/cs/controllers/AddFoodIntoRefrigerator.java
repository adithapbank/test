package ku.cs.controllers;

import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;

import ku.cs.App;
import ku.cs.models.Food;
import ku.cs.service.FXRouter;

public class AddFoodIntoRefrigerator {
    private Food food;
    @FXML
    private ListView<Food> foodListView;
    @FXML
    private TextField foodAmount;
    @FXML
    private TextField foodCategory;
    @FXML
    private DatePicker foodExpiredDate;
    @FXML
    private TextField foodMeasure;
    @FXML
    private TextField foodName;
    @FXML
    private Label amountMessage;
    @FXML
    private Label categoryMessage;
    @FXML
    private Label expMessage;
    @FXML
    private Label measureMessage;
    @FXML
    private Label nameMessage;

    @FXML
    public void initialize() {
        amountMessage.setText("");
        categoryMessage.setText("");
        expMessage.setText("");
        measureMessage.setText("");
        nameMessage.setText("");
    }

    @FXML
    public void switchToRefrigeratorSlot1() throws IOException {
        try {
            FXRouter.goTo("refrigeratorslot1");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า fridge ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

    @FXML
    public void switchToRefrigeratorList() throws IOException {
        try {
            FXRouter.goTo("refrigeratorlist");
        }
        catch (IOException e) {
            System.err.println("ไปที่หน้า refrigeratorlist ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

    @FXML
    void addFood(ActionEvent actionEvent) {
        try {
            food.setFoodName(foodName.getText());
            food.setFoodAmount(Integer.parseInt(foodAmount.getText()));
            food.setFoodCategory(foodCategory.getText());
            food.setFoodMeasure(foodMeasure.getText());
            food.setFoodExpiredDate(foodExpiredDate.getValue());
            FXRouter.goTo("fridge");

        } catch (NumberFormatException e) {
            amountMessage.setText("Only Number!");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า fridge ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }

    }
}