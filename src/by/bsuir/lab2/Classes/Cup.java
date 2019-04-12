package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;

public class Cup extends Thing{
	private double volume;
	private String content;
	private Constancts con;
	
	public Cup() {
		volume=0;
		content="";
	}	
	
	
	public void toFill(BorderPane root, ActionButton ab, String contentTemp) {	
		content=contentTemp;
		switch(content) {
		case "сахар": ab.btnToFillSugar(root); break;
		case "кофе": ab.btnToFillCoffee(root); break;
		case "вода": ab.btnToFillWater2(root); break;					
		}		
	}
	
	public void setVolume(double temp) {
		volume=temp;
	}

}
