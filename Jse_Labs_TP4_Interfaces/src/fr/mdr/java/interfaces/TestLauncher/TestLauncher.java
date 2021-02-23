package fr.mdr.java.interfaces.TestLauncher;

import fr.mdr.java.interfaces.Movable;
import fr.mdr.java.interfaces.MovableCircle;
import fr.mdr.java.interfaces.MovablePoint;
import fr.mdr.java.interfaces.MovableRectangle;

public class TestLauncher {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5,6,10,4);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		
		Movable m2 = new MovableCircle(2,1,2,4,20);
		System.out.println(m2);
		m2.moveUp();
		System.out.println(m2);
		
		Movable m3 = new MovableRectangle(5,7,8,6,3,5);
		System.out.println(m3);
		m3.moveDown();
		System.out.println(m3);
	}
}
