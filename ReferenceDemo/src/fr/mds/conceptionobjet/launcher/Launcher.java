package fr.mds.conceptionobjet.launcher;

import fr.mds.conceptionobjet.model.Cat;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("hello world");
		
//		primitif -> int, double, long, short, char, byte, float, boolean
//		object -> any type of object: Cat, Car, Boat
		

//		Demo Privitive
		int myFirstInt = 10;
		System.out.println(myFirstInt);
		changeMyInt(myFirstInt);
		System.out.println(myFirstInt);
//		Demo Object
		Cat myFirstCat = new Cat("boby");
		System.out.println(myFirstCat);
		changeMyCat(myFirstCat);
		System.out.println(myFirstCat);
//		Demo Object
		Cat secondMyCat = new Cat();
		secondMyCat.color = "Pink";
		System.out.println(secondMyCat);
		changeMyCatColor(secondMyCat);
		System.out.println(secondMyCat);
		
	}	
	
	
	static void changeMyInt(int myInt) {
		myInt = 0;
	}
	
	static void changeMyCat(Cat myCat) {
		myCat.setName("George");
	}
	
	static void changeMyCatColor(Cat myCat) {
		myCat.color = "Purple";
	}
}
