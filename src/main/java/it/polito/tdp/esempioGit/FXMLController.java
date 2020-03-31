package it.polito.tdp.esempioGit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
	private int mTempo;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
    	for(int i = this.mTempo; i > 0; i--) {
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		label.setText(""+i);
    	}
        
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    	this.mTempo = 30;
    }    
}
