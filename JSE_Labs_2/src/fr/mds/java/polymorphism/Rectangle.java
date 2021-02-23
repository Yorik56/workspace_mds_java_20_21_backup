package fr.mds.java.polymorphism;

public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(int length, int width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public int getArea() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + " color: " +  super.toString() + "]";
	}
	
	
}
