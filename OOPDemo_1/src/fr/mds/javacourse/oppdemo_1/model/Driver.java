package fr.mds.javacourse.oppdemo_1.model;
//class following encapsulation
public class Driver {
	private String name;
	private int age;
	
	//aggregation
	//relation of a type "has-a"
	private Car car;
	
	//Default constructor
	public Driver() {
		
	}
	
	public Driver(String name, int age, Car car) {
		this.car = car;
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
