package it.polito.tdp.esempioGit;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
    	for(int i = 30; i > 0; i--)
    		this.time(i);
        label.setText("Hello World!");
    }
    
    private void time(int i) {
    	String st = String.valueOf(i);
		
    	try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		label.setText(st);
		
	}

	@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
