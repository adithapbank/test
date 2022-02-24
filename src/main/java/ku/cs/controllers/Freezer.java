package ku.cs.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import ku.cs.App;
import ku.cs.service.FXRouter;

public class Freezer {

    @FXML
    public void switchToFreezerSelection()throws IOException{
        try {
            FXRouter.goTo("freezerselection");
        }
        catch (IOException e) {
            System.err.println("ไปที่หน้า freezerselection ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }
    
}
