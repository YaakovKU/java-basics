package a;

// abstract class - no objects of this class can be created
// used for inheritance
public abstract class Shape {
	
	private String color;
	
	// abstract method - with NO implementation (no block of code)
	public abstract double getArea();

	// concrete methods - with implementation (block of code)
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
