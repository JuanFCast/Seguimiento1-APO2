package ui;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.SafeBox;

public class SafeBoxControllerGUI {
	
	//SafeBox1
	@FXML
    private Label labSafe;

    @FXML
    private Label labInfo1;

    @FXML
    private TextField txtBox1;

    @FXML
    private TextField txtBox2;

    @FXML
    private TextField txtBox3;

    @FXML
    private TextField txtBox4;

    @FXML
    private TextField txtBox5;

    @FXML
    private TextField txtBox6;

    @FXML
    private Button btOpen1;

    @FXML
    private Label labelWarning;
    
    
    //SafeBox2
    @FXML
    private Label labSafe2;

    @FXML
    private Label labInfo2;

    @FXML
    private TextArea textArea;

    @FXML
    private Label warning;

    @FXML
    private Button btOpen2;

    @FXML
    private Button btOpen3;
    
    
    //SafeBox3
    @FXML
    private Label labSafe3;

    @FXML
    private Label labInfo3;

    @FXML
    private TextField txtBox7;

    @FXML
    private TextField txtBox8;
    
    @FXML
    private TextField txtBox9;

    @FXML
    private TextField txtBox10;

    @FXML
    private TextField txtBox11;

    @FXML
    private TextField txtBox12;

    @FXML
    private Label labInfo4;

    @FXML
    private TextField txtBox13;

    @FXML
    private TextField txtBox14;

    @FXML
    private TextField txtBox15;

    @FXML
    private TextField txtBox16;

    @FXML
    private TextField txtBox17;

    @FXML
    private TextField txtBox18;

    @FXML
    private Button btOpen4;

    @FXML
    private Button btOpen5;

    @FXML
    private Label warning3;
    
    private SafeBox box;
    
    public SafeBoxControllerGUI() {
    	box = new SafeBox();
    }

    //General
    private Stage mainStage;


    public Stage getMainStage() {
        return mainStage;
    }


    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }


    @FXML
    public void switchWindow(ActionEvent event) throws IOException {
    	String password = txtBox1.getText() + txtBox2.getText() + txtBox3.getText() + txtBox4.getText() + txtBox5.getText() + txtBox6.getText();
    	try {
    		double passwordS = Double.parseDouble(password);
        	
        	if(SafeBox.unlocker(passwordS)==true) {
        		
        		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox2.fxml"));
                fxmlLoader.setController(this);
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);

                mainStage.setScene(scene);
                mainStage.setTitle("Window 2");
                mainStage.show();
                
                textArea.setText(box.getSave());
        		
        		
        	}else {
        		JOptionPane.showMessageDialog(null, "La contraseña es INCORRECTA, intentalo de nuevo");
        	}
    		
    	}catch(NumberFormatException ex) {
    		JOptionPane.showMessageDialog(null, "Ingrese por favor valores numericos");
    	}
 	      
    }
    
    
    
    public void backWindow(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox1.fxml"));
        fxmlLoader.setController(this);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        mainStage.setScene(scene);
        mainStage.setTitle("Window 2");
        mainStage.show();
        
        String info = textArea.getText();
        box.setSave(info);
    	
    }
    
    
    
    
    
    
    public void switchPassword(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox3.fxml"));
        fxmlLoader.setController(this);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        mainStage.setScene(scene);
        mainStage.setTitle("Window 3");
        mainStage.show();
        
     
    	
    }
    
    public void changePassword(ActionEvent event) throws IOException {
    	String password1 = txtBox7.getText() + txtBox8.getText() + txtBox9.getText() + txtBox10.getText() + txtBox11.getText() + txtBox12.getText();
    	String password2 = txtBox13.getText() + txtBox14.getText() + txtBox15.getText() + txtBox16.getText() + txtBox17.getText() + txtBox18.getText();
    	
    	try {
    		double passwordS = Double.parseDouble(password1);
    		double passwordN = Double.parseDouble(password2);
    		
    		if(passwordS!=passwordN) {
    			if(SafeBox.unlocker(passwordS)==true) {
            		SafeBox.setPassword(passwordN);
            		JOptionPane.showMessageDialog(null, "Se ha cambiado correctamente la contraseña");
      
            	
            	}else {
            		JOptionPane.showMessageDialog(null, "La contraseña es INCORRECTA, intentalo de nuevo");
            	}
    		}else {
    			JOptionPane.showMessageDialog(null, "Ingresa una contraseña diferente a la anterior");
    		}
    		
    	}catch(NumberFormatException ex) {
    		JOptionPane.showMessageDialog(null, "Ingrese por favor valores numericos");
    	}
        
     
    	
    }
    
    
    
    public void backMenu(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox1.fxml"));
        fxmlLoader.setController(this);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        mainStage.setScene(scene);
        mainStage.setTitle("Safe Box");
        mainStage.show();
        
        String info = textArea.getText();
        box.setSave(info);
    	
    }
    
    
    
    




}

