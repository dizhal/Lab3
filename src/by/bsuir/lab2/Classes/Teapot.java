package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.scene.layout.BorderPane;

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
		ab.btnToFillWater1(root,this);
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
	
	public void setVolume(Integer temp) {
		volume=temp;
	}

	public void setTemperature(Integer temp) {
		temperature=temp;
	}

}
