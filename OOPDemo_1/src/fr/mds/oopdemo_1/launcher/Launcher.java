package fr.mds.oopdemo_1.launcher;
import fr.mds.javacourse.oppdemo_1.model.Car;

public class Launcher {
	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		myCar1.color = "Black";
		myCar1.brand = "Nick";
		myCar1.currentSpeed = 92.5f;
		
		Car myCar2 = new Car();
		
		myCar1.color = "Pink";
		myCar1.brand = "Peugeot";
		myCar1.currentSpeed = 97.5f;
		
		Car myCar3 = new Car("yellow", 150.f, "BMW");
		
		System.out.println(myCar3.color + " " + myCar3.currentSpeed + " " + myCar3.brand);
		
		myCar1.start();
		myCar2.start();
		myCar3.start();
		
		
	}
}
