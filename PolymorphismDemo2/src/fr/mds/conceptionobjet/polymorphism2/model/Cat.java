package fr.mds.conceptionobjet.polymorphism2.model;

public class Cat extends Prize {
	@Override
	public int getPrizeValue() {
		return 1000;
	}
	
	public void miaou() {
		System.out.println("Miaou");
	}
}
