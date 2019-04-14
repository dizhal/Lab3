package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import javafx.scene.layout.BorderPane;
import by.bsuir.lab2.Elements.Constancts;

public class LooseItem extends Thing{
	private Constancts con;
	private Cup cup;
	
	public LooseItem(){
		cup=new Cup();
	}
	
	public void spreadOn(BorderPane root, ActionButton ab, String content, StringBuffer cofTaste,StringBuffer sortTea,StringBuffer tempFunction) {
		double temp=0;
		switch(content) {
		case "сахар": 
			ab.spreadOnIntoCup(root,this);
		    temp=weight*con.DENCITY_SUGAR;
			break;
		case "кофе": 
			ab.btnSpreadOnCoffee(root,this,cofTaste);
			temp=weight*con.DENCITY_COFFEE;
			break;
		case "чай": 
			ab.btnSpreadOnTea(root,this,sortTea);
			temp=weight*con.DENCITY_TEA;
			break;
		}
		cup.setVolume(temp);
		cup.toFill(root, ab,content);
		cup.toAccept(root, ab,content,tempFunction);
	}

}
