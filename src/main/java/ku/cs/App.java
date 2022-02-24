package ku.cs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ku.cs.service.FXRouter;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static String APP_NAME = "Hello World";
    private static Double WINDOW_WIDTH = 1024.0D;
    private static Double WINDOW_HEIGHT = 768.0D;

    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, APP_NAME, WINDOW_WIDTH, WINDOW_HEIGHT);
        configRoute();
        FXRouter.goTo("login");

    }
    private static void configRoute() {
        FXRouter.when("login", "ku/cs/login.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("fridge", "ku/cs/fridge.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("primary", "ku/cs/primary.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("secondary", "ku/cs/secondary.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("freezerselectslot", "ku/cs/freezerselectslot.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("freezer", "ku/cs/freezer.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("freezerslot1", "ku/cs/freezerslot2.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigerator", "ku/cs/refrigerator.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigeratorlist", "ku/cs/refrigeratorlist.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigeratorselectslot", "ku/cs/refrigeratorselectslot.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigeratorslot1", "ku/cs/refrigeratorslot1.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigeratorslot2", "ku/cs/refrigeratorslot2.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigeratorslot3", "ku/cs/refrigeratorslot3.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigeratorslot4", "ku/cs/refrigeratorslot4.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigeratorslot5", "ku/cs/refrigeratorslot5.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);
        FXRouter.when("refrigeratorslot6", "ku/cs/refrigeratorslot6.fxml", WINDOW_WIDTH, WINDOW_HEIGHT);

    }
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}