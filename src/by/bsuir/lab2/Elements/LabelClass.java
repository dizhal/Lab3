package by.bsuir.lab2.Elements;

import javafx.scene.control.Label;

public class LabelClass {
	private Constancts con;
	public Label nameStudent;
	
	public Label sugarRequest;
	
	public Label questionCoffee;
	public Label waterRequest;
	public Label temperatureRequest;
	public Label content;
	public Label volume;
	public Label end;
	
	public Label coffeeRequest;
	
	public Label stillSugar;
	public Label stillCoffee;
	
	public LabelClass() {
		nameStudent=new Label(con.QUESTION_NAME);
		sugarRequest=new Label(con.REQUEST_FOR_SUGAR_WEIGHT);
		content=new Label(con.CONTENT);
		volume=new Label(con.VOLUME);
		questionCoffee=new Label(con.QUESTION_COFFEE);
		waterRequest=new Label(con.REQUEST_FOR_WATER);
		temperatureRequest=new Label(con.REQUEST_FOR_TEMPERATURE);
		end=new Label(con.END);
		coffeeRequest=new Label(con.REQUEST_FOR_COFFEE_WEIGHT);
		stillSugar=new Label(con.REQUEST_FOR_SUGAR);
		stillCoffee=new Label(con.REQUEST_FOR_COFFEE);
	}
}
