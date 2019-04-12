package by.bsuir.lab2.Classes;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class Coffee extends Thing{
	private StringBuffer coffeeTaste;
	private Cup cup;
	private Constancts con;
	
	public Coffee() {
		coffeeTaste=new StringBuffer();
		cup=new Cup();
	}
	
	public void select(BorderPane root, ActionButton ab) {	
		ab.btnSelect(root,this);
	}
	
	public void spreadOn(BorderPane root, ActionButton ab) {
		
		weight=ab.btnSpreadOnCoffee(root,coffeeTaste);
		double temp=weight*con.DENCITY_SUGAR;
		cup.setVolume(temp);
	}
	
	public void next(BorderPane root, ActionButton ab) {
		cup.toFill(root, ab,con.COFFEE);
	}
	
	public void setCoffee(StringBuffer temp) {
		coffeeTaste.delete(0,10);
		coffeeTaste.append(temp);
	}

	public StringBuffer getCoffee() {
		return coffeeTaste;
	}
}
