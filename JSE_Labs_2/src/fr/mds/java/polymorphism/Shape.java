package fr.mds.java.polymorphism;

public abstract class Shape {
	private String color;
	
	public Shape() {
		
	}
	
	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract int getArea();

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	
}
