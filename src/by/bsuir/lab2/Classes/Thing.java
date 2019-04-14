package by.bsuir.lab2.Classes;

public abstract class Thing {
	
	protected Integer weight;
	
	public Thing() {
		weight=0;
	}
	
	public void setWeight(Integer temp) {
		weight=temp;
	}
	
	public Integer getWeight() {
		return weight;
	}
}

