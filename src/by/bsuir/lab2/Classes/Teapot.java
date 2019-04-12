package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Teapot extends Thing{
	private Integer volume;
	private Integer temperature;
	private Cup cup;
	private Constancts con;
	
	public Teapot() {
		volume=0;
		temperature=0;
		cup=new Cup();
	}

	public void toFillWater(BorderPane root, ActionButton ab) {
		int mas[]=new int[2];
		mas=ab.btnToFillWater1(root);
		volume=mas[0];
		temperature=mas[1];
	}
	
	public void hateUp(BorderPane root, ActionButton ab) {
		ab.btnHateUp(root);
	}
	
	public void toPour(BorderPane root, ActionButton ab) {
		double temp=(double)volume;
		ab.btnToPour(root,volume);
		cup.setVolume(temp);
		cup.toFill(root, ab,con.WATER);
	}
	

}
