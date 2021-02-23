package fr.mds.conceptionobjet.exceptions.launcher;

import fr.mds.conceptionobjet.exeception.exception.WrongNumberException;

public class Launcher2 {
	public static void main(String[] args) {
		System.out.println("launcher2 - Start");
		try {
			methode1();
		} catch (WrongNumberException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Laucher2 - end");
	}

	static void methode1() throws WrongNumberException{
		System.out.println("methode1 - start");
		methode2();
		System.out.println("methode1 - end");
	}

	static void methode2() throws WrongNumberException{
		System.out.println("methode2 - start");
		methode3();
		System.out.println("methode2 - end");
	}

	static void methode3() throws WrongNumberException {
		System.out.println("methode3 - start");
		throw new WrongNumberException("404");
//		System.out.println("methode3 - end");

	}
}
