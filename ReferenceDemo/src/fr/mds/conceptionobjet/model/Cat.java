package fr.mds.conceptionobjet.model;

public class Cat {
	private String name;
	public String color;

	public Cat() {
		// TODO Auto-generated constructor stub
	}	

	public Cat(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", "+ color+ "]";
	}

}
