package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.scene.layout.BorderPane;

public class Milk extends Thing{
	private Constancts con;
	private Cup cup;
	
	public Milk() {
		super();
		cup=new Cup();
	}
	
	public void spreadOn(BorderPane root, ActionButton ab, String content) {
		ab.btnSpreadOnMilk(root,this);
	    double temp=weight*con.DENCITY_MILK;
	    cup.setVolume(temp);
		cup.toFill(root, ab,content);
		cup.toAccept(root, ab,content,null);
	}
}
