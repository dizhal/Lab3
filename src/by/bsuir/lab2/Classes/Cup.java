package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import javafx.scene.layout.BorderPane;

public class Cup extends Thing{
	private double volume;
	private String content;
	private static int flag=0;
	
	public Cup() {
		volume=0;
		content="";
	}	
	
	
	public void toFill(BorderPane root, ActionButton ab, String contentTemp) {	
		content=contentTemp;
		switch(content) {
		case "сахар": ab.btnToFillSugar(root); break;
		case "вода": ab.btnToFillWater2(root); break;	
		case "молоко": ab.btnToFillMilk(root); break;
		default: ab.btnToFill(root); break;
		}		
	}
	
	public void toAccept(BorderPane root, ActionButton ab,String content,StringBuffer tempFunction) {
		
		switch(content) {
		case "сахар": ab.btnToAcceptSugar(root,tempFunction,this); break;
		case "молоко": ab.btnToAcceptMilk(root); break;
		default:ab.btnToAccept(root,this);
		}
	}
	
	public void setVolume(double temp) {
		volume=temp;
	}
	
	public void setFlag(int temp) {
		flag=temp;
	}
	
	public int getFlag() {
		return flag;
	}

}
