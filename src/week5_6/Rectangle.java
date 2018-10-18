package week5_6;

public class Rectangle extends Shape {
	double width = 1.0;
	double length = 1.0;

	// Constructor
	public Rectangle() {}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, boolean canMove, boolean filled) {
		this.width = width;
		this.length = length;
		this.canMove = canMove;
		this.filled = filled;
	}

	// Setter, getter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public String toString() {
		return "Name: Rectangle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nWidth: " + width + "\nLength: " + length +  "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}