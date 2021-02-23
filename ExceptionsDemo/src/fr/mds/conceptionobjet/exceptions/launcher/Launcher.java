package fr.mds.conceptionobjet.exceptions.launcher;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		doSomething();
		
		System.out.println("end");
	}
	
	static void exempleCheckedException() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Sleeping had an exception");
		}
		
	}
	
	static void doSomething() {
		doSomething2();
	}
	
	static void doSomething2() {
		System.out.println("start do something");
		
		try {
			System.out.println("start inside try");
			int myInt = 10/0;
			System.out.println("end inside try");
		}catch (Exception e) {
			System.out.println("Ho ho, I caught exception");
			e.printStackTrace();
		}
		
		System.out.println("end do something");
	}
}
