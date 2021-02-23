package fr.mds.conceptionobjet.anthill.model;

public abstract class Ant {
	protected int identifier;
	protected int age;
	protected int ageMax;
	protected String cast;

	public Ant(int identifier, int ageMax, String cast) {
		this.identifier = identifier;
		this.ageMax = ageMax;
		this.cast = cast;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public abstract int getAge();

	public abstract void setAge(int age);

	public abstract int getAgeMax();

	public abstract String getCast();

}
