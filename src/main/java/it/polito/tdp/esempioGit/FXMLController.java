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
		label.setText("Hello World!");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}
}
