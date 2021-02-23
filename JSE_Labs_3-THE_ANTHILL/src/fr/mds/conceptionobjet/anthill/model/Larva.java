package fr.mds.conceptionobjet.anthill.model;

import java.util.Random;

public class Larva extends Ant {
	private String adultCast;

	public Larva(int identifier, int ageMax, String cast) {
		super(identifier, ageMax, cast);
		Random random = new Random();
		// randomNumber va renvoyer une valeur entre 0 et 3 de manière aléatoire
		int randomNumber = random.nextInt(19);
		if (randomNumber == 0) {
			this.setAdultCast("queen");
			this.adultCast = "queen";
		} else if (randomNumber > 0 && randomNumber < 3) {
			this.setAdultCast("male");
		} else {
			this.setAdultCast("worker");
		}
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge(int age) {
		this.age = this.age + age;
	}

	@Override
	public int getAgeMax() {
		return this.ageMax;
	}

	public String getCast() {
		return cast;
	}	

	public String getAdultCast() {
		return adultCast;
	}

	public void setAdultCast(String adultCast) {
		this.adultCast = adultCast;
	}

}
