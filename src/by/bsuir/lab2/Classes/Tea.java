package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import javafx.scene.layout.BorderPane;

public class Tea extends LooseItem{
	private StringBuffer sort;
	private Cup cup;
	
	public Tea() {
		sort=new StringBuffer();
		cup=new Cup();
	}
	
	public void select(BorderPane root, ActionButton ab) {	
		ab.btnSelectTea(root,this);
	}
	
	public void setTea(StringBuffer temp) {
		sort.delete(0,10);
		sort.append(temp);
	}

	public StringBuffer getTea() {
		return sort;
	}

}
