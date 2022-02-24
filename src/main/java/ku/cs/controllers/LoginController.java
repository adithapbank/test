package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.App;
import ku.cs.service.FXRouter;

import java.io.File;
import java.io.IOException;


public class LoginController {

    @FXML private Label status;
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private ImageView userImage;
    @FXML private ImageView passwordImage;
    @FXML private ImageView bgImage;

    @FXML
    private void initialize() {
        showImageBackground("images/backgrounds/bluevtr.png");
        showImageUser("images/icons/contacts_50px.png");
        showImagePassword("images/icons/key_50px.png");
    }

    @FXML
    private void showImageBackground(String imagePath) {
        File imageFile = new File(imagePath);
        Image image = new Image(imageFile.toURI().toString());
        bgImage.setImage(image);
    }

    @FXML
    private void showImageUser(String imagePath) {
        File imageFile = new File(imagePath);
        Image image = new Image(imageFile.toURI().toString());
        userImage.setImage(image);
    }

    @FXML
    private void showImagePassword(String imagePath) {
        File imageFile = new File(imagePath);
        Image image = new Image(imageFile.toURI().toString());
        passwordImage.setImage(image);
    }

    @FXML
    private void checkLogin() throws IOException{
        if (username.getText().toString().equals("123456") && password.getText().toString().equals("123456")) {
            FXRouter.goTo("primary");
        }else if (username.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
            status.setText("Please enter your username and password !");
        }else{
            status.setText("Wrong username and password, please try again !");
        }
    }
}