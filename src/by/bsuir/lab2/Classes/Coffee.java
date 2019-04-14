package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import javafx.scene.layout.BorderPane;

public class Coffee extends LooseItem{
	private StringBuffer coffeeTaste;
	
	public Coffee() {
		coffeeTaste=new StringBuffer();
	}
	
	public void select(BorderPane root, ActionButton ab) {	
		ab.btnSelectCoffee(root,this);
	}
	
	public void setCoffee(StringBuffer temp) {
		coffeeTaste.delete(0,10);
		coffeeTaste.append(temp);
	}

	public StringBuffer getCoffee() {
		return coffeeTaste;
	}
	
}
