package fr.mds.javacourse.oppdemo_1.model;

//Plain Old Java Object( une classe)
public class Car {
	
	//attributes/properties/field/instances variable

	public String color;
	public float currentSpeed;
	public String brand;
	public static int numberOfWheels = 4;
	
	//class variable
	//static variable (on peut y accéder sans instancier la classe) 	
	public static boolean hasARadio = true;
	
	//default constructor
	public Car() {
		System.out.println("Instanciation of a new car");
	}
	//constructor overload 1
	public Car(String color) {
		this.color = color;
		System.out.println("Instanciation of a new car with color: " + this.color);		
	}
	//constructor overload 1
	public Car(String color, float currentSpeed, String brand) {
		this.color = color;
		this.currentSpeed = currentSpeed;
		this.brand = brand;
		
	}
	
	//methods/instances methods
	public void start()
	{
		//this references the current instance
		System.out.println("vroum vroum" + this.color);
	}
	public void stop()
	{
		System.out.println("stop" + this.currentSpeed);
	}
    //static method
	public static void destroyAllCarsifExists() {
		
	}
	
	
}
