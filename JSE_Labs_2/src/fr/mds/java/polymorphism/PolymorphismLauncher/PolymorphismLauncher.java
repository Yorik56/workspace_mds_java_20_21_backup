package fr.mds.java.polymorphism.PolymorphismLauncher;

import fr.mds.java.polymorphism.Shape;
import fr.mds.java.polymorphism.Triangle;
import fr.mds.java.polymorphism.Rectangle;

public class PolymorphismLauncher {
	public static void main(String[] args) {
		Shape s1 = new Triangle(46,82,"Red");
		
		Shape s2 = new Rectangle(30,44,"yellow");
		
		
		
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s2);
		System.out.println(s2.getArea());

	}
}
