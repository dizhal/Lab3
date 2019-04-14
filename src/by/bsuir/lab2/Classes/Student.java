package by.bsuir.lab2.Classes;

import by.bsuir.lab2.Control.ActionButton;
import by.bsuir.lab2.Elements.Constancts;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;

public class Student {
	private StringBuffer nameStudent;
	private StringBuffer condition;
	private static StringBuffer function;
	private Teapot teapot;
	private ArrayList<Sugar> listSugar;
	private ArrayList<Coffee> listCoffee;
	private ArrayList<Tea> listTea;
	private ArrayList<Milk> listMilk;
	private Constancts con;
	
	public Student(StringBuffer name) {
		System.out.println(name.toString());
		nameStudent=new StringBuffer(name);
		condition=new StringBuffer(con.YES);
		function=new StringBuffer();
		teapot=new Teapot();
		listSugar=new ArrayList<Sugar>();
		listCoffee=new  ArrayList<Coffee>();
		listTea=new ArrayList<Tea>();
		listMilk=new ArrayList<Milk>();
	}

	public void selectFunction(BorderPane root,ActionButton ab) {
		ab.btnSelectFunction(root,this);
	}
	
	public void spreadOnIntoCup(BorderPane root,ActionButton ab, StringBuffer tempFunction) {
		Sugar sugar=new Sugar();
        listSugar.add(sugar);
    	sugar.spreadOn(root,ab,con.SUGAR,null,null,tempFunction);
		ab.btnSelect1(root,this,sugar);
		this.coffee(root,ab);
		this.tea(root,ab);
		this.milk(root,ab);
		teapot.toFillWater(root,ab);
		teapot.hateUp(root,ab);
		teapot.toPour(root,ab);
	}
	
	public void coffee(BorderPane root,ActionButton ab) {
		    Coffee coffee=new Coffee();
		    listCoffee.add(coffee);
			coffee.select(root,ab);
			coffee.spreadOn(root,ab,con.COFFEE,coffee.getCoffee(),null,null);
			ab.btnSelect2(root,this,coffee,coffee.getCoffee());		
	}
	
    public void tea(BorderPane root,ActionButton ab) {
    	Tea tea=new Tea();
	    listTea.add(tea);
	    tea.select(root,ab);
	    tea.spreadOn(root,ab,con.TEA,null,tea.getTea(),null );
	    ab.btnSelect3(root,this,tea,tea.getTea());	
	}

    public void milk(BorderPane root,ActionButton ab) {
    	Milk milk=new Milk();
		listMilk.add(milk);
		milk.spreadOn(root,ab,con.MILK);
		ab.btnSelect4(root,this,milk);
    }
    
    public void coffeeMilk() {
	
    }
	public void setCondition(StringBuffer temp) {
		condition.delete(0,2);
		condition.append(temp);
	}
	
	public void setFunction(StringBuffer temp) {
		function.delete(0,30);
		function.append(temp);
	}
	
	public StringBuffer getFunction() {
		return function;
	}
}


