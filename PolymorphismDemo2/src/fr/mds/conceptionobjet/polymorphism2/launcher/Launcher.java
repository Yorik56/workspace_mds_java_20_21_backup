package fr.mds.conceptionobjet.polymorphism2.launcher;

import fr.mds.conceptionobjet.polymorphism2.model.Cat;
import fr.mds.conceptionobjet.polymorphism2.model.Coupon;
import fr.mds.conceptionobjet.polymorphism2.model.Game;
import fr.mds.conceptionobjet.polymorphism2.model.Prize;
import fr.mds.conceptionobjet.polymorphism2.model.Trip;
import fr.mds.polymorphism2.data.PrizeHandler;

public class Launcher {
	public static void main(String[] args) {
		Prize myPrize = PrizeHandler.getRandomPrize();
		
		int prizeValue = myPrize.getPrizeValue();
		System.out.println("wahou, the value of my prize is " + prizeValue);
		
		if(myPrize instanceof Cat) {
			System.out.println("Bring sombrero to vet");
			((Cat) myPrize).miaou();
		}
		else if (myPrize instanceof Coupon) {	
			System.out.println("Let's go to the mall!!");
		}
		else if (myPrize instanceof Trip) {	
			System.out.println("I need to pack my things");
		}
		else if (myPrize instanceof Game) {
			System.out.println("Install the game on my PC");
		}
	}
}
