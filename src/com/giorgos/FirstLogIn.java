package com.giorgos;
	
import javafx.application.Application;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

public class FirstLogIn extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		// Δημιουργία Πεδίων Κειμένου,Ετικετών,κουμπιου
		TextField usernameFld = new TextField();
		PasswordField passwordFld = new PasswordField();
		Label usernameLbl = new Label("_Username:");
		Label passwordLbl = new Label("_Password:");
		Button btn1= new Button("OK");
		
		// Binding μεταξύ Label και TextField
		usernameLbl.setLabelFor(usernameFld);
		passwordLbl.setLabelFor(passwordFld);
		
		// Ενεργοποίηση mnemonic
		usernameLbl.setMnemonicParsing(true);
		passwordLbl.setMnemonicParsing(true);
		
		// Δημιουργία ρυθμίσεις και προσθήκες στο GridPane 
		GridPane root = new GridPane();
		root.setMinSize(300,150);
		root.setAlignment(Pos.CENTER);
		root.addRow(0, usernameLbl, usernameFld);
		root.addRow(1, passwordLbl, passwordFld);
		root.addRow(2,btn1);
		
		//init and set stage and scene
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("telo1");
		stage.show();
	}
	
}




