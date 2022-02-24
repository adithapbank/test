package ku.cs.controllers;

import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.App;
import ku.cs.service.FXRouter;

public class SecondaryController {

    @FXML private ImageView devImage01;
    @FXML private ImageView devImage02;
    @FXML private ImageView devImage03;

    @FXML
    private void initialize() {
        showImageDev01("images/developers/D01.jpg");
        showImageDev02("images/developers/D02.jpg");
        showImageDev03("images/developers/D03.jpg");
    }

    private void showImageDev01(String imagePath) {
        File imageFile = new File(imagePath);
        Image image = new Image(imageFile.toURI().toString());
        devImage01.setImage(image);
    }

    private void showImageDev02(String imagePath) {
        File imageFile = new File(imagePath);
        Image image = new Image(imageFile.toURI().toString());
        devImage02.setImage(image);
    }

    private void showImageDev03(String imagePath) {
        File imageFile = new File(imagePath);
        Image image = new Image(imageFile.toURI().toString());
        devImage03.setImage(image);
    }

    @FXML
    private void switchToPrimary() throws IOException {
        FXRouter.goTo("primary");
    }
}