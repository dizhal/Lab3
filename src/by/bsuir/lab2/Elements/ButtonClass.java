package by.bsuir.lab2.Elements;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ButtonClass {
	private Constancts con;
	public Button next;
	
	public Button selectCoffee;
	public Button selectTea;
	public Button spreadOnIntoCup;
	public Button spreadOnSugar;
	public Button spreadOnCoffee;
	public Button spreadOnTea;
	public Button spreadOnMilk;
	
	public Button toFillSugar;
	public Button toFill;
	public Button toFillMilk;
	public Button toFillWater1;
	public Button toFillWater2;
	
	public RadioButton cappuccino;
	public RadioButton americano;
	public RadioButton latte;
	public ToggleGroup groupCoffee;
	
	public RadioButton red;
	public RadioButton green;
	public RadioButton black;
	public ToggleGroup groupTea;
	
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
	public RadioButton yes3;
	public RadioButton no3;
	public ToggleGroup group13;
	public Button select3;
	public RadioButton yes4;
	public RadioButton no4;
	public ToggleGroup group14;
	public Button select4;
	public Button toAccept1;
	public Button toAccept2;
	public Button toAccept3;
	public Button selectFunction;
	public RadioButton makeCoffee;
	public RadioButton makeTea;
	public RadioButton makeCoffeeMilk;
	public ToggleGroup groupFunction;
	public ButtonClass() {
		makeCoffee=new RadioButton(con.MAKE_COFFEE);
		makeTea=new RadioButton(con.MAKE_TEA);
		makeCoffeeMilk=new RadioButton(con.MAKE_COFFEE_MILK);
		groupFunction=new ToggleGroup();
		makeCoffee.setToggleGroup(groupFunction);
		makeTea.setToggleGroup(groupFunction);
		makeCoffeeMilk.setToggleGroup(groupFunction);
		selectFunction=new Button(con.SELECT);
		next = new Button(con.FURTHET);
		toFillSugar=new Button(con.TO_FILL);
		toFill=new Button(con.TO_FILL);
		toFillMilk=new Button(con.TO_FILL);
		toFillWater1=new Button(con.TO_FILL_WITH_WATER);
		toFillWater2=new Button(con.TO_FILL);
		cappuccino=new RadioButton(con.CAPPUCCINO);
		americano=new RadioButton(con.AMERICANO);
		latte=new RadioButton(con.LATTE);
		groupCoffee=new ToggleGroup();
		cappuccino.setToggleGroup(groupCoffee);
		americano.setToggleGroup(groupCoffee);
		latte.setToggleGroup(groupCoffee);
		red=new RadioButton(con.RED);
		green=new RadioButton(con.GREEN);
		black=new RadioButton(con.BLACK);
		groupTea=new ToggleGroup();
		red.setToggleGroup(groupTea);
		green.setToggleGroup(groupTea);
		black.setToggleGroup(groupTea);
		selectCoffee=new Button(con.SELECT);
		selectTea=new Button(con.SELECT);
		spreadOnSugar=new Button(con.SPREAD_ON);
		spreadOnCoffee=new Button(con.SPREAD_ON);
		spreadOnTea=new Button(con.SPREAD_ON);
		spreadOnMilk=new Button(con.TO_POUR);
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
		yes3=new RadioButton(con.YES);
		no3=new RadioButton(con.NO);
		group13=new ToggleGroup();
		yes3.setToggleGroup(group13);
		no3.setToggleGroup(group13);
		select3=new Button(con.SELECT);
		yes4=new RadioButton(con.YES);
		no4=new RadioButton(con.NO);
		group14=new ToggleGroup();
		yes4.setToggleGroup(group14);
		no4.setToggleGroup(group14);
		select4=new Button(con.SELECT);
		spreadOnIntoCup=new Button(con.SPREAD_ON_INTO_CUP);
		toAccept1=new Button(con.TO_ACCEPT);
		toAccept2=new Button(con.TO_ACCEPT);
		toAccept3=new Button(con.TO_ACCEPT);
	}
	
}
