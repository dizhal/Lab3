package by.bsuir.lab2.Elements;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ButtonClass {
	private Constancts con;
	public Button makeCoffee;
	public Button next;
	
	public Button select;
	public Button spreadOnSugar;
	public Button spreadOnCoffee;
	
	public Button toFillSugar;
	public Button toFillCoffee;
	public Button toFillWater1;
	public Button toFillWater2;
	
	public RadioButton cappuccino;
	public RadioButton americano;
	public RadioButton latte;
	public ToggleGroup group;
	
	public Button toPour;
	public Button hateUp;
	
	public RadioButton yes1;
	public RadioButton no1;
	public ToggleGroup group11;
	public Button select1;
	public RadioButton yes2;
	public RadioButton no2;
	public ToggleGroup group12;
	public Button select2;
	public Button vvod;
	public ButtonClass() {
		makeCoffee= new Button(con.MAKE_COFFEE);
		next = new Button(con.FURTHET);
		toFillSugar=new Button(con.TO_FILL);
		toFillCoffee=new Button(con.TO_FILL);
		toFillWater1=new Button(con.TO_FILL_WITH_WATER);
		toFillWater2=new Button(con.TO_FILL);
		cappuccino=new RadioButton(con.CAPPUCCINO);
		americano=new RadioButton(con.AMERICANO);
		latte=new RadioButton(con.LATTE);
		group=new ToggleGroup();
		cappuccino.setToggleGroup(group);
		americano.setToggleGroup(group);
		latte.setToggleGroup(group);
		select=new Button(con.SELECT);
		spreadOnSugar=new Button(con.SPREAD_ON);
		spreadOnCoffee=new Button(con.SPREAD_ON);
		toPour=new Button(con.TO_POUR);
		hateUp=new Button(con.HEAT_UP);
		yes1=new RadioButton(con.YES);
		no1=new RadioButton(con.NO);
		group11=new ToggleGroup();
		yes1.setToggleGroup(group11);
		no1.setToggleGroup(group11);
		select1=new Button(con.SELECT);
		yes2=new RadioButton(con.YES);
		no2=new RadioButton(con.NO);
		group12=new ToggleGroup();
		yes2.setToggleGroup(group12);
		no2.setToggleGroup(group12);
		select2=new Button(con.SELECT);
		vvod=new Button("¬вод");
	}
	
}
