package by.bsuir.lab2.Control;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.geometry.HPos;

public class MyGridPane {
	private GridPane root;
	
	public MyGridPane() {
    	root = new GridPane();    		
    	root.getColumnConstraints().add(new ColumnConstraints(200));
		root.getColumnConstraints().add(new ColumnConstraints(150));
		root.getRowConstraints().add(new RowConstraints(35));
    	root.getRowConstraints().add(new RowConstraints(35));
    	root.getRowConstraints().add(new RowConstraints(35));
    	root.getRowConstraints().add(new RowConstraints(35));
	}
	
	
	public GridPane getRoot() {
		return root;
	}

}
