package fr.mds.polymorphism2.data;

import java.util.Random;

import fr.mds.conceptionobjet.polymorphism2.model.Cat;
import fr.mds.conceptionobjet.polymorphism2.model.Coupon;
import fr.mds.conceptionobjet.polymorphism2.model.Game;
import fr.mds.conceptionobjet.polymorphism2.model.Prize;
import fr.mds.conceptionobjet.polymorphism2.model.Trip;

public class PrizeHandler {
	public static Prize getRandomPrize() {

		Random random = new Random();
		// randomNumber va renvoyer une valeur entre 0 et 3 de manière aléatoire
		int randomNumber = random.nextInt(4);

		Prize prize = null;

		switch (randomNumber) {
		case 0:
			prize = new Cat();
			break;
		case 1:
			prize = new Coupon();
			break;
		case 2:
			prize = new Game();
			break;
		case 3:
			prize = new Trip();
			break;

		}
		return prize;
	}
}
