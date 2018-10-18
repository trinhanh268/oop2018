package week5_6;

public class Circle extends Shape {
	private final double PI = 3.14159;
	double radius;

	// Constructor
	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// Setter, getter 
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*PI*radius;
	}
	
	public String toString() {
		return "Name: Circle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
	
}
