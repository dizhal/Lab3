package by.bsuir.lab2.Control;


import by.bsuir.lab2.Elements.ButtonClass;
import by.bsuir.lab2.Elements.Constancts;
import by.bsuir.lab2.Elements.LabelClass;
import by.bsuir.lab2.Elements.TextFieldClass;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import by.bsuir.lab2.Classes.Student;
import by.bsuir.lab2.Classes.Coffee;
import javafx.stage.Stage;

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
    	grid.getRoot().setHalignment(lab.nameStudent,HPos.RIGHT);
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
    	    	GridPane.setMargin(btn.makeCoffee, new Insets(10));
    	    	grid.getRoot().setHalignment(btn.makeCoffee,HPos.RIGHT);
    	    	grid.getRoot().add(lab.nameStudent, 0, 0);   	    	
    	    	grid.getRoot().add(btn.makeCoffee, 0, 1);
    	    	root.setCenter(grid.getRoot());  
    		}		
    	});
	}
	
	public void btnMakeCoffee(BorderPane root) {
		btn.makeCoffee.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.sugarRequest, new Insets(10));
    	    	grid.getRoot().add(lab.sugarRequest, 0, 0); 
    	    	grid.getRoot().add(tf.weightSugar, 1, 0); 
    	    	grid.getRoot().add(btn.spreadOnSugar, 1, 1); 
    	    	root.setCenter(grid.getRoot());   	    	
    		}		
    	});
	}

	public Integer btnSpreadOnSugar(BorderPane root) {
		btn.spreadOnSugar.setOnAction(new EventHandler<ActionEvent>() {		
    	    public void handle(ActionEvent event) {
    	    	tempInteger=Integer.parseInt(tf.weightSugar.getText());
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
    	    	grid.getRoot().getChildren().clear();
    	    	lab.questionCoffee.setText(con.QUESTION_COFFEE);
    	    	GridPane.setMargin(lab.questionCoffee, new Insets(10));
    	    	grid.getRoot().add(lab.questionCoffee, 0, 0);
    	    	grid.getRoot().add(btn.cappuccino, 1, 0);
    	    	grid.getRoot().add(btn.americano, 1, 1);
    	    	grid.getRoot().add(btn.latte, 1, 2);
    	    	grid.getRoot().add(btn.select, 1, 3); 
    	    	root.setCenter(grid.getRoot());
    		}		
    	});
	}
	
	public StringBuffer btnSelect(BorderPane root, Coffee c) {
		btn.select.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {
    	    	RadioButton selection=(RadioButton) btn.group.getSelectedToggle();
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
	
	public Integer btnSpreadOnCoffee(BorderPane root, StringBuffer coffeeTest) {
		btn.spreadOnCoffee.setOnAction(new EventHandler<ActionEvent>() {	
    	    public void handle(ActionEvent event) {
    	    	tempInteger=Integer.parseInt(tf.weightCoffee.getText());
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
	
	public void btnToFillCoffee(BorderPane root) {
		btn.toFillCoffee.setOnAction(new EventHandler<ActionEvent>() {				
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
	
    public int[] btnToFillWater1(BorderPane root) {
    	btn.toFillWater1.setOnAction(new EventHandler<ActionEvent>() {				
    	    public void handle(ActionEvent event) {
    	    	mas[0]=Integer.parseInt(tf.enterWater.getText());
    	    	mas[1]=Integer.parseInt(tf.enterTemperature.getText());
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
    	    	GridPane.setMargin(btn.toPour, new Insets(10));
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
    
    public void btnSelect1(BorderPane root, Student s) {
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
    				btnyes1(root);
    			}
    	    	tempStringBuffer.delete(0, 10);
    		}		
    	});
    }
    
    public void btnyes1(BorderPane root) {
    	grid.getRoot().getChildren().clear();
    	GridPane.setMargin(lab.sugarRequest, new Insets(10));
    	grid.getRoot().add(lab.sugarRequest, 0, 0); 
    	grid.getRoot().add(tf.weightSugar, 1, 0); 
    	grid.getRoot().add(btn.spreadOnSugar, 1, 1); 
    	root.setCenter(grid.getRoot());   	
    	btnSpreadOnSugar(root);
    }
    
    public void btnSelect2(BorderPane root, Student s,StringBuffer coffeeTest) {
    	btn.select2.setOnAction(new EventHandler<ActionEvent>() {			
    	    public void handle(ActionEvent event) {  	    	
    	    	RadioButton selection=(RadioButton) btn.group12.getSelectedToggle();
    	    	tempStringBuffer.append(selection.getText());   	    	
    	    	s.setCondition(tempStringBuffer);
    	    	tempString=selection.getText();
    	    	grid.getRoot().getChildren().clear();
    	    	GridPane.setMargin(lab.content, new Insets(10));
    	    	GridPane.setMargin(lab.volume, new Insets(10));
    	    	GridPane.setMargin(btn.toFillCoffee, new Insets(10));
    	    	grid.getRoot().add(lab.content, 0, 0); 
    	    	grid.getRoot().add(lab.volume, 0, 1); 
    	    	grid.getRoot().add(btn.toFillCoffee, 0, 2);
    	    	root.setCenter(grid.getRoot());       	    
    	    	if(tempString==con.YES) {
    				btnyes2(root,coffeeTest);
    			}
    	    	tempStringBuffer.delete(0, 10);
    		}		
    	});
    }
    
    public void btnyes2(BorderPane root,StringBuffer coffeeTest) {
    	grid.getRoot().getChildren().clear();
    	GridPane.setMargin(lab.coffeeRequest, new Insets(10));
    	grid.getRoot().add(lab.coffeeRequest, 0, 0); 
    	grid.getRoot().add(tf.weightCoffee, 1, 0); 
    	grid.getRoot().add(btn.spreadOnCoffee, 1, 1); 
    	root.setCenter(grid.getRoot());   	
    	btnSpreadOnCoffee(root,coffeeTest);
    }

}

