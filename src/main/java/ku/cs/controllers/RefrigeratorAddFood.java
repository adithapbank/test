//==========================================================================================================
//  Add food into Refrigerator Controller
//==========================================================================================================

package ku.cs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import ku.cs.App;
import ku.cs.models.Food;
import ku.cs.models.FoodList;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;

public class RefrigeratorAddFood {

    private Food food;

    @FXML private DatePicker expireDateDatePicker;
    @FXML private ImageView foodImageView;
    @FXML private TextField foodCategoryTextField;
    @FXML private TextField foodNameTextField;
    @FXML private TextField foodMeasureTextField;
    @FXML private TextField foodSlotTextField;
    @FXML private TextField foodAmountTextField;
    @FXML private Text warningLabel;

    @FXML
    public void initialize(){
        warningLabel.setText("");
    }

    @FXML
    public void pressOk(ActionEvent actionEvent) throws IOException{
        try {
            int foodAmount = Integer.parseInt(foodAmountTextField.getText());
            int slot = Integer.parseInt(foodSlotTextField.getText());
            LocalDate localDate = expireDateDatePicker.getValue();

            if (foodNameTextField.toString().isEmpty() && foodCategoryTextField.toString().isEmpty()
                    &&foodMeasureTextField.toString().isEmpty() && foodAmount == 0){
                warningLabel.setText("กรุณาใส่ข้อมูลให้ถูกต้อง");
            }else{
                if (foodAmount > 0) {
                    FoodList foodList = new FoodList();
                    localDate.toString();
                    food.setFoodName(foodNameTextField.getText());
                    food.setFoodCategory(foodCategoryTextField.getText());
                    food.setFoodAmount(foodAmount);
                    food.setFoodMeasure(foodMeasureTextField.getText());
                    food.setFoodSlot(slot);
                    foodList.addFood(food);
                    App.setRoot("fridge");
                }else{
                    warningLabel.setText("กรุณากรอกข้อมูลให้ถูกต้อง");
                }
            }
        } catch (IOException e) {
            System.err.println("ERR");
        }
    }

    @FXML
    public void uploadPicture(ActionEvent event){
        FileChooser chooser = new FileChooser();
        chooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("images PNG JPG", "*.png", "*.jpg", "*.jpeg"));
        Node source = (Node) event.getSource();
        File file = chooser.showOpenDialog(source.getScene().getWindow());
        if (file != null) {
            try {
                File destDir = new File("images/Items");
                if (!destDir.exists()) destDir.mkdirs();
                String[] fileSplit = file.getName().split("\\.");
                String filename = LocalDate.now() + "_" + System.currentTimeMillis() + "."
                        + fileSplit[fileSplit.length - 1];
                Path target = FileSystems.getDefault().getPath(
                        destDir.getAbsolutePath() + System.getProperty("file.separator") + filename
                );
                Files.copy(file.toPath(), target, StandardCopyOption.REPLACE_EXISTING);
                foodImageView.setImage(new Image(target.toUri().toString()));
                food.setFoodImagePath("images" + "/" + "Items" + "/" +filename);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void switchToFridge() throws IOException {
        App.setRoot("fridge");
    }
}

//========================================================================================================== 