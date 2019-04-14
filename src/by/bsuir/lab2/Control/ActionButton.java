package by.bsuir.lab2.Control;


import by.bsuir.lab2.Elements.ButtonClass;
import by.bsuir.lab2.Elements.Constancts;
import by.bsuir.lab2.Elements.LabelClass;
import by.bsuir.lab2.Elements.TextFieldClass;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import by.bsuir.lab2.Classes.Student;
import by.bsuir.lab2.Classes.Sugar;
import by.bsuir.lab2.Classes.Teapot;
import by.bsuir.lab2.Classes.Coffee;
import by.bsuir.lab2.Classes.Tea;
import by.bsuir.lab2.Classes.LooseItem;
import by.bsuir.lab2.Classes.Milk;
import by.bsuir.lab2.Classes.Cup;

public class ActionButton{
	private Constancts con;
	private MyGridPane grid;
	
	private LabelClass lab;
	private ButtonClass btn;
	private TextFieldClass tf;
	public StringBuffer tempStringBuffer;
	public String tempString;
	private Integer tempInteger;
   	private int mas[];
	
	public ActionButton() {
		grid=new MyGridPane();
		tempStringBuffer=new StringBuffer();
		tempString=new String();
		tempInteger=0;
		lab=new LabelClass();
		btn=new ButtonClass();
		tf=new TextFieldClass();
		mas=new int[2];
	}
	
	public void btnEnter(BorderPane root, StringBuffer name) {	
		GridPane.setMargin(lab.nameStudent, new Insets(25));
    	grid.getRoot().add(lab.nameStudent, 0, 0);
    	grid.getRoot().add(tf.nameStudent, 1, 0);
    	grid.getRoot().add(btn.next, 1, 1);
    	root.setCenter(grid.getRoot());
  
    	btn.next.setOnAction(new EventHandler<ActionEvent>() {
    	    public void  handle(ActionEvent event) {  
    	    	name.append(tf.nameStudent.getText());
    	    	lab.nameStudent.setText("Привет, " + name + "!!!");
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.nameStudent, new Insets(10));
    	    	GridPane.setMargin(lab.function, new Insets(10));
    	    	GridPane.setMargin(btn.makeCoffee, new Insets(10));
    	    	GridPane.setMargin(btn.makeTea, new Insets(10));    	    	
    	    	grid.getRoot().add(lab.nameStudent, 0, 0);   	    	
    	    	grid.getRoot().add(lab.function, 0, 1);
    	    	grid.getRoot().add(btn.makeCoffee, 0, 2);   	    	
    	    	grid.getRoot().add(btn.makeTea, 0, 3);
    	    	grid.getRoot().add(btn.makeCoffeeMilk, 1, 2);   	    	
    	    	grid.getRoot().add(btn.selectFunction, 1, 3);
    	    	root.setCenter(grid.getRoot());  
    		}		
    	});
	}
	
	public void btnSelectFunction(BorderPane root, Student s) {
		btn.selectFunction.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {   	    	 
    	    	RadioButton selection=(RadioButton) btn.groupFunction.getSelectedToggle();
    	    	tempStringBuffer.append(selection.getText());
    	    	s.setFunction(tempStringBuffer);
    	    	tempStringBuffer.delete(0,30);
                grid.getRoot().getChildren().clear();
        	    GridPane.setMargin(lab.sugarRequest, new Insets(10));
        	    grid.getRoot().add(lab.sugarRequest, 0, 0); 
        	    grid.getRoot().add(tf.weightSugar, 1, 0); 
        	    grid.getRoot().add(btn.spreadOnIntoCup, 1, 1); 
        	    root.setCenter(grid.getRoot()); 	
    		}		
    	});
	}
	

	public Integer spreadOnIntoCup(BorderPane root,  LooseItem s) {
		btn.spreadOnIntoCup.setOnAction(new EventHandler<ActionEvent>() {		
    	    public void handle(ActionEvent event) {
    	    	tempInteger=Integer.parseInt(tf.weightSugar.getText());
    	    	s.setWeight(tempInteger);
    	    	double temp=tempInteger*con.DENCITY_SUGAR;
    	    	lab.volume.setText(con.VOLUME + " - " +  temp + "мл");   	    	
    	    	lab.content.setText(con.CONTENT + " - " + con.SUGAR);
    	    	GridPane.setMargin(lab.stillSugar, new Insets(10));
    	    	GridPane.setMargin(btn.select1, new Insets(10));
    	    	grid.getRoot().add(lab.stillSugar, 0, 2);
    	    	grid.getRoot().add(btn.yes1, 1, 2);
    	    	grid.getRoot().add(btn.no1, 1, 3);
    	    	grid.getRoot().add(btn.select1, 0, 3); 
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
		return tempInteger;
	}
	
	public void btnToFillSugar(BorderPane root) {
		btn.toFillSugar.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {    	    	
    	    	grid.getRoot().add(btn.toAccept1, 1, 2); 
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
	}
	
	public void btnToAcceptSugar(BorderPane root,StringBuffer tempFunction,Cup c) {
		btn.toAccept1.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {    	    	
    	    	grid.getRoot().getChildren().clear();
    	    	switch(tempFunction.toString()) {    	    	
    	    	case "Сделать чай":
    	    		lab.questionTea.setText(con.QUESTION_TEA);
        	    	GridPane.setMargin(lab.questionTea, new Insets(10));
        	    	grid.getRoot().add(lab.questionTea, 0, 0);
        	    	grid.getRoot().add(btn.red, 1, 0);
        	    	grid.getRoot().add(btn.green, 1, 1);
        	    	grid.getRoot().add(btn.black, 1, 2);
        	    	grid.getRoot().add(btn.selectTea, 1, 3);
    	    		break;
    	    	case "Сделать кофе с молоком": 
    	    		c.setFlag(1);
    	    	case "Сделать кофе":   	    	
    	    		lab.questionCoffee.setText(con.QUESTION_COFFEE);
        	    	GridPane.setMargin(lab.questionCoffee, new Insets(10));
        	    	grid.getRoot().add(lab.questionCoffee, 0, 0);
        	    	grid.getRoot().add(btn.cappuccino, 1, 0);
        	    	grid.getRoot().add(btn.americano, 1, 1);
        	    	grid.getRoot().add(btn.latte, 1, 2);
        	    	grid.getRoot().add(btn.selectCoffee, 1, 3); 
        	    	break;
    	    	}
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
	}
	
	public StringBuffer btnSelectCoffee(BorderPane root, Coffee c) {
		btn.selectCoffee.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {
    	    	RadioButton selection=(RadioButton) btn.groupCoffee.getSelectedToggle();
    	    	tempStringBuffer.append(selection.getText());
    	    	c.setCoffee(tempStringBuffer);
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.coffeeRequest, new Insets(10));
    	    	grid.getRoot().add(lab.coffeeRequest, 0, 0);
    	    	grid.getRoot().add(tf.weightCoffee, 1, 0);
    	    	grid.getRoot().add(btn.spreadOnCoffee, 1, 1);
    	    	root.setCenter(grid.getRoot());
    	    	tempStringBuffer.delete(0,10);
    		}		
    	});	
		return tempStringBuffer;
	}
	
	public StringBuffer btnSelectTea(BorderPane root, Tea t) {
		btn.selectTea.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {
    	    	RadioButton selection=(RadioButton) btn.groupTea.getSelectedToggle();
    	    	tempStringBuffer.append(selection.getText());
    	    	t.setTea(tempStringBuffer);
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.teaRequest, new Insets(10));
    	    	grid.getRoot().add(lab.teaRequest, 0, 0);
    	    	grid.getRoot().add(tf.weightTea, 1, 0);
    	    	grid.getRoot().add(btn.spreadOnTea, 1, 1);
    	    	root.setCenter(grid.getRoot());
    	    	tempStringBuffer.delete(0,10);
    		}		
    	});	
		return tempStringBuffer;
	}
	
	public Integer btnSpreadOnCoffee(BorderPane root, LooseItem coffee,  StringBuffer coffeeTest) {
		btn.spreadOnCoffee.setOnAction(new EventHandler<ActionEvent>() {	
    	    public void handle(ActionEvent event) {
    	    	tempInteger=Integer.parseInt(tf.weightCoffee.getText());
    	    	coffee.setWeight(tempInteger);
    	    	double temp=tempInteger*con.DENCITY_COFFEE;
    	    	lab.volume.setText(con.VOLUME + " - " +  temp + "мл");
    	    	lab.content.setText(con.CONTENT + " - " + con.COFFEE + ' ' + coffeeTest);
    	    	GridPane.setMargin(lab.stillCoffee, new Insets(10));
    	    	GridPane.setMargin(btn.select2, new Insets(10));
    	    	grid.getRoot().add(lab.stillCoffee, 0, 2);
    	    	grid.getRoot().add(btn.yes2, 1, 2);
    	    	grid.getRoot().add(btn.no2, 1, 3);
    	    	grid.getRoot().add(btn.select2, 0, 3); 
    	    	root.setCenter(grid.getRoot());
    		}		
    	});	
		return tempInteger;
	}
	
	public Integer btnSpreadOnTea(BorderPane root, LooseItem tea,  StringBuffer sort) {
		btn.spreadOnTea.setOnAction(new EventHandler<ActionEvent>() {	
    	    public void handle(ActionEvent event) {
    	    	tempInteger=Integer.parseInt(tf.weightTea.getText());
    	    	tea.setWeight(tempInteger);
    	    	double temp=tempInteger*con.DENCITY_TEA;
    	    	lab.volume.setText(con.VOLUME + " - " +  temp + "мл");
    	    	lab.content.setText(con.CONTENT + " - " + con.TEA + ' ' + sort);
    	    	GridPane.setMargin(lab.stillTea, new Insets(10));
    	    	GridPane.setMargin(btn.select3, new Insets(10));
    	    	grid.getRoot().add(lab.stillTea, 0, 2);
    	    	grid.getRoot().add(btn.yes3, 1, 2);
    	    	grid.getRoot().add(btn.no3, 1, 3);
    	    	grid.getRoot().add(btn.select3, 0, 3); 
    	    	root.setCenter(grid.getRoot());
    		}		
    	});	
		return tempInteger;
	}
	
	public Integer btnSpreadOnMilk(BorderPane root, Milk milk) {
		btn.spreadOnMilk.setOnAction(new EventHandler<ActionEvent>() {	
    	    public void handle(ActionEvent event) {
    	    	tempInteger=Integer.parseInt(tf.weightMilk.getText());
    	    	milk.setWeight(tempInteger);
    	    	double temp=tempInteger*con.DENCITY_MILK;
    	    	lab.volume.setText(con.VOLUME + " - " +  temp + "мл");
    	    	lab.content.setText(con.CONTENT + " - " + con.MILK );
    	    	GridPane.setMargin(lab.stillMilk, new Insets(10));
    	    	GridPane.setMargin(btn.select4, new Insets(10));
    	    	grid.getRoot().add(lab.stillMilk, 0, 2);
    	    	grid.getRoot().add(btn.yes4, 1, 2);
    	    	grid.getRoot().add(btn.no4, 1, 3);
    	    	grid.getRoot().add(btn.select4, 0, 3); 
    	    	root.setCenter(grid.getRoot());
    		}		
    	});	
		return tempInteger;
	}
	
	public void btnToFill(BorderPane root) {
		btn.toFill.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {   	    	
    	    	grid.getRoot().add(btn.toAccept2, 1, 2);
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
	}
	
	public void btnToFillMilk(BorderPane root) {
		btn.toFillMilk.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {   	    	
    	    	grid.getRoot().add(btn.toAccept3, 1, 2);
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
	}
	
	public void btnToAccept(BorderPane root, Cup c) {
		btn.toAccept2.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {   	    	    
    	    	    if(c.getFlag()==1) {
    	    	    	btnToAcceptMilk(root);
    	    	    	grid.getRoot().getChildren().clear();
    	       	    	GridPane.setMargin(lab.milkRequest, new Insets(10));
    	       	    	grid.getRoot().add(lab.milkRequest, 0, 0);
    	       	    	grid.getRoot().add(tf.weightMilk, 1, 0);
    	       	    	grid.getRoot().add(btn.spreadOnMilk, 1, 1);
    	       	    	root.setCenter(grid.getRoot());
    	    	    }
    	    	    else {
    				grid.getRoot().getChildren().clear();
        	    	GridPane.setMargin(lab.waterRequest, new Insets(10));
        	    	grid.getRoot().add(lab.waterRequest, 0, 0);
        	    	GridPane.setMargin(lab.temperatureRequest, new Insets(10));
        	    	grid.getRoot().add(lab.temperatureRequest, 0, 1);
        	    	grid.getRoot().add(tf.enterWater, 1, 0);
        	    	grid.getRoot().add(tf.enterTemperature, 1, 1);
        	    	GridPane.setMargin(btn.toFillWater1, new Insets(10));
        	    	grid.getRoot().add(btn.toFillWater1, 0, 2);
        	    	root.setCenter(grid.getRoot()); 
    	    	    }
    		}		
    	});
	}
	
	public void btnToAcceptMilk(BorderPane root) {
		btn.toAccept3.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) { 
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.waterRequest, new Insets(10));
    	    	grid.getRoot().add(lab.waterRequest, 0, 0);
    	    	GridPane.setMargin(lab.temperatureRequest, new Insets(10));
    	    	grid.getRoot().add(lab.temperatureRequest, 0, 1);
    	    	grid.getRoot().add(tf.enterWater, 1, 0);
    	    	grid.getRoot().add(tf.enterTemperature, 1, 1);
    	    	GridPane.setMargin(btn.toFillWater1, new Insets(10));
    	    	grid.getRoot().add(btn.toFillWater1, 0, 2);
    	    	root.setCenter(grid.getRoot()); 
    		}		
    	});
	}
	
    public int[] btnToFillWater1(BorderPane root, Teapot t) {
    	btn.toFillWater1.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	t.setVolume(Integer.parseInt(tf.enterWater.getText()));
    	    	t.setTemperature(Integer.parseInt(tf.enterTemperature.getText()));
    	    	grid.getRoot().add(btn.hateUp ,1, 2);
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
        return mas;
    }
    
    public void btnHateUp(BorderPane root) {
    	btn.hateUp.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	GridPane.setMargin(btn.toPour, new Insets(10));
    	    	grid.getRoot().add(btn.toPour, 0, 3); 
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
    }
    
    public void btnToPour(BorderPane root, Integer volume) {
    	btn.toPour.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	lab.volume.setText(con.VOLUME + " - " +  volume + "мл");
    	    	lab.content.setText(con.CONTENT + " - " + con.WATER);
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.volume, new Insets(10));
    	    	GridPane.setMargin(lab.content, new Insets(10));
    	    	GridPane.setMargin(btn.toFillWater2, new Insets(10));
    	    	grid.getRoot().add(lab.content, 0, 0); 
    	    	grid.getRoot().add(lab.volume, 0, 1); 
    	    	grid.getRoot().add(btn.toFillWater2, 0, 2);
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
    }
    
    public void btnToFillWater2(BorderPane root) {
    	btn.toFillWater2.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	grid.getRoot().add(lab.end, 1, 2); 
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
    }
    
    public void btnSelect1(BorderPane root, Student s,Sugar sugar) {
    	btn.select1.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {  	    	
    	    	RadioButton selection=(RadioButton) btn.group11.getSelectedToggle();
    	    	tempStringBuffer.append(selection.getText());   	    	
    	    	s.setCondition(tempStringBuffer);
    	    	tempString=selection.getText();
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.content, new Insets(10));
    	    	GridPane.setMargin(lab.volume, new Insets(10));
    	    	GridPane.setMargin(btn.toFillSugar, new Insets(10));
    	    	grid.getRoot().add(lab.content, 0, 0);
    	    	grid.getRoot().add(lab.volume, 0, 1); 
    	    	grid.getRoot().add(btn.toFillSugar, 0, 2);
    	    	root.setCenter(grid.getRoot());       	    
    	    	if(tempString==con.YES) {
    				btnyes1(root,sugar);
    			}
    	    	tempStringBuffer.delete(0, 10);
    		}		
    	});
    }
    
    public void btnyes1(BorderPane root, Sugar s) {
    	grid.getRoot().getChildren().clear();
    	GridPane.setMargin(lab.sugarRequest, new Insets(10));
    	grid.getRoot().add(lab.sugarRequest, 0, 0); 
    	grid.getRoot().add(tf.weightSugar, 1, 0); 
    	grid.getRoot().add(btn.spreadOnIntoCup, 1, 1); 
    	root.setCenter(grid.getRoot());   	
    	spreadOnIntoCup(root,s);
    }
    
    public void btnSelect2(BorderPane root, Student s,LooseItem coffee,StringBuffer coffeeTest) {
    	btn.select2.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {  	    	
    	    	RadioButton selection=(RadioButton) btn.group12.getSelectedToggle();
    	    	tempStringBuffer.append(selection.getText());   	    	
    	    	s.setCondition(tempStringBuffer);
    	    	tempString=selection.getText();
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.content, new Insets(10));
    	    	GridPane.setMargin(lab.volume, new Insets(10));
    	    	GridPane.setMargin(btn.toFill, new Insets(10));
    	    	grid.getRoot().add(lab.content, 0, 0); 
    	    	grid.getRoot().add(lab.volume, 0, 1); 
    	    	grid.getRoot().add(btn.toFill, 0, 2);
    	    	root.setCenter(grid.getRoot());       	    
    	    	if(tempString==con.YES) {
    				btnyes2(root,coffee,coffeeTest);
    			}
    	    	tempStringBuffer.delete(0, 10);
    		}		
    	});
    }
    
    public void btnSelect3(BorderPane root, Student s,LooseItem tea,StringBuffer sort) {
    	btn.select3.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {  	    	
    	    	RadioButton selection=(RadioButton) btn.group13.getSelectedToggle();
    	    	tempStringBuffer.append(selection.getText());   	    	
    	    	s.setCondition(tempStringBuffer);
    	    	tempString=selection.getText();
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.content, new Insets(10));
    	    	GridPane.setMargin(lab.volume, new Insets(10));
    	    	GridPane.setMargin(btn.toFill, new Insets(10));
    	    	grid.getRoot().add(lab.content, 0, 0); 
    	    	grid.getRoot().add(lab.volume, 0, 1); 
    	    	grid.getRoot().add(btn.toFill, 0, 2);
    	    	root.setCenter(grid.getRoot());       	    
    	    	if(tempString==con.YES) {
    				btnyes3(root,tea,sort);
    			}
    	    	tempStringBuffer.delete(0, 10);
    		}		
    	});
    }
    
    public void btnSelect4(BorderPane root, Student s,Milk milk) {
    	btn.select4.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {  	    	
    	    	RadioButton selection=(RadioButton) btn.group14.getSelectedToggle();
    	    	tempStringBuffer.append(selection.getText());   	    	
    	    	s.setCondition(tempStringBuffer);
    	    	tempString=selection.getText();
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.content, new Insets(10));
    	    	GridPane.setMargin(lab.volume, new Insets(10));
    	    	GridPane.setMargin(btn.toFillMilk, new Insets(10));
    	    	grid.getRoot().add(lab.content, 0, 0); 
    	    	grid.getRoot().add(lab.volume, 0, 1); 
    	    	grid.getRoot().add(btn.toFillMilk, 0, 2);
    	    	root.setCenter(grid.getRoot());       	    
    	    	if(tempString==con.YES) {
    				btnyes4(root,milk);
    			}
    	    	tempStringBuffer.delete(0, 10);
    		}		
    	});
    }
    
    public void btnyes2(BorderPane root,LooseItem coffee,StringBuffer coffeeTest) {
    	grid.getRoot().getChildren().clear();
    	GridPane.setMargin(lab.coffeeRequest, new Insets(10));
    	grid.getRoot().add(lab.coffeeRequest, 0, 0); 
    	grid.getRoot().add(tf.weightCoffee, 1, 0); 
    	grid.getRoot().add(btn.spreadOnCoffee, 1, 1); 
    	root.setCenter(grid.getRoot());   	
    	btnSpreadOnCoffee(root,coffee,coffeeTest);
    }

    public void btnyes3(BorderPane root,LooseItem tea,StringBuffer sort) {
    	grid.getRoot().getChildren().clear();
    	GridPane.setMargin(lab.teaRequest, new Insets(10));
    	grid.getRoot().add(lab.teaRequest, 0, 0); 
    	grid.getRoot().add(tf.weightTea, 1, 0); 
    	grid.getRoot().add(btn.spreadOnTea, 1, 1); 
    	root.setCenter(grid.getRoot());   	
    	btnSpreadOnTea(root,tea,sort);
    }
    
    public void btnyes4(BorderPane root,Milk milk) {
    	grid.getRoot().getChildren().clear();
    	GridPane.setMargin(lab.milkRequest, new Insets(10));
    	grid.getRoot().add(lab.milkRequest, 0, 0); 
    	grid.getRoot().add(tf.weightMilk, 1, 0); 
    	grid.getRoot().add(btn.spreadOnMilk, 1, 1); 
    	root.setCenter(grid.getRoot());   	
    	btnSpreadOnMilk(root,milk);
    }
}

