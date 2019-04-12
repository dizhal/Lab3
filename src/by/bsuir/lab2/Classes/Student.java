package by.bsuir.lab2.Classes;

import javafx.scene.control.TextField;
import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import java.util.ArrayList;

public class Student {
	private StringBuffer nameStudent;
	private StringBuffer condition;
	private Teapot teapot;
	private ArrayList<Sugar> listSugar;
	private ArrayList<Coffee> listCoffee;
	private Constancts con;
	
	public Student(StringBuffer name) {
		System.out.println(name.toString());
		nameStudent=new StringBuffer(name);
		condition=new StringBuffer(con.YES);
		teapot=new Teapot();
		listSugar=new ArrayList<Sugar>();
		listCoffee=new  ArrayList<Coffee>();
	}

	
	public void makeCoffee(BorderPane root,ActionButton ab) {
		ab.btnMakeCoffee(root);
        Sugar sugar=new Sugar();
        listSugar.add(sugar);
    	sugar.spreadOn(root,ab);
		ab.btnSelect1(root,this);	
	
	    sugar.next(root,ab);
	    Coffee coffee=new Coffee();
	    listCoffee.add(coffee);
		coffee.select(root,ab);
		coffee.spreadOn(root,ab);
		ab.btnSelect2(root,this,coffee.getCoffee());	
		coffee.next(root,ab);
		teapot.toFillWater(root,ab);
		teapot.hateUp(root,ab);
		teapot.toPour(root,ab);
	}
	
	public void setCondition(StringBuffer temp) {
		condition.delete(0,2);
		condition.append(temp);
	}
}


