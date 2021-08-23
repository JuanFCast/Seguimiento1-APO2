package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SafeBoxControllerGUI {

    @FXML
    private Label labTitle;

    @FXML
    private Button btnChange;
    
    
	private Stage mainStage;
	
	
	public Stage getMainStage() {
		return mainStage;
	}
    
	
    public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}

	
    @FXML
    public void switchWindow(ActionEvent event) throws IOException {
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox2.fxml"));
    	fxmlLoader.setController(this);
    	Parent root = fxmlLoader.load();
    	Scene scene = new Scene(root);
    	
    	mainStage.setScene(scene);
    	mainStage.setTitle("Window 2");
    	mainStage.show();
    }
    
    
    

}

