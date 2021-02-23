package fr.mds.conceptionobjet.anthill.model;

public class Male extends Ant {
	public Male(int identifier, int ageMax, String cast) {
		super(identifier, ageMax, cast);
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

	@Override
	public String getCast() {
		return this.cast;
	}

}
