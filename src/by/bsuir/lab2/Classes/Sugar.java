package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Sugar extends Thing {
	private Constancts con;
	private Cup cup;
		
	public Sugar() {
		super();  
		cup=new Cup();
	}
	
	public void spreadOn(BorderPane root, ActionButton ab) {
		weight=ab.btnSpreadOnSugar(root);
		double temp=weight*con.DENCITY_SUGAR;
		cup.setVolume(temp);		
	}
	
	public void next(BorderPane root, ActionButton ab) {
		cup.toFill(root, ab,con.SUGAR);
	}
}
