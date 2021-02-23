package fr.mds.java.polymorphism;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle() {
		
	}
	
	public Triangle(int base, int height, String color) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea() {
		return (this.base * this.height) * 1/2;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + " color: " + super.toString() + "]";
	}
	
	
}
