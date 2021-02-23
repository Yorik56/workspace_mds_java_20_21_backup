package fr.mds.conceptionobjet.anthill.model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AntHill {
	private int nbrOfQueens = 0;
	private int nbrOfMales = 0;
	private int nbrOfWorkers = 0;
	private int nbrOfLarvas = 0;
	private int ageOfHill = 0;
	private int nbrOfAnt = 0;
	private int nbrOfBirth = 0;
	private int nbrOfDeath = 0;
	private int lastId = 0;
	private ArrayList<Ant> arrAnt = new ArrayList<Ant>();

	public AntHill(int nbrOfQueens, int nbrOfMales, int nbrOfWorkers, int nbrOfLarvas) {

		for (int i = 0; i < nbrOfQueens; i++) {
			Queen queen = new Queen(lastId, 50, "queen");
			this.arrAnt.add(queen);
			this.setNbrOfAnt(1);
			this.lastId++;
		}
		this.setNbrOfQueens(nbrOfQueens);

		for (int i = 0; i < nbrOfMales; i++) {
			Male male = new Male(lastId, 20, "male");
			this.arrAnt.add(male);
			this.setNbrOfAnt(1);
			this.lastId++;
		}
		this.setNbrOfMales(nbrOfMales);

		for (int i = 0; i < nbrOfWorkers; i++) {
			Worker worker = new Worker(lastId, 50, "worker");
			this.arrAnt.add(worker);
			this.setNbrOfAnt(1);
			this.lastId++;
		}
		this.setNbrOfWorkers(nbrOfWorkers);

		for (int i = 0; i < nbrOfLarvas; i++) {
			Larva larva = new Larva(lastId, 10, "larva");
			this.arrAnt.add(larva);
			this.setNbrOfAnt(1);
			this.lastId++;
		}
		this.setNbrOfLarvas(nbrOfLarvas);

	}

	public void nextDay(int response) {
		ListIterator<Ant> iterANTor = this.getArrAnt().listIterator();

		while (iterANTor.hasNext()) {

			Ant currentAnt = iterANTor.next();
			
			if(currentAnt.getCast() == "queen") {
				int joursDePonte;
				if(response > (currentAnt.getAgeMax() - currentAnt.getAge())) {
					joursDePonte = currentAnt.getAgeMax() - currentAnt.getAge();
				}
				else {
					joursDePonte = response;
				}
				for (int i = 0; i < (10 * joursDePonte); i++) {
					Larva larva = new Larva(lastId, 10, "larva");
					iterANTor.add(larva);
					this.setNbrOfAnt(1);
					this.setNbrOfBirth(1);
					this.lastId++;
				}
				this.setNbrOfLarvas(10 * joursDePonte);
				if(joursDePonte == 1) {
					System.out.println("Lors du dernier jour, une reine à pondu: " + 10 + " oeufs");
				}
				else {
					System.out.println("Lors des "+ response + " derniers jours, une reine à pondu: " + 10 * joursDePonte + " oeufs");
				}
			}
			
			currentAnt.setAge(response);
			if (currentAnt.getAge() >= currentAnt.getAgeMax()) {
				if (currentAnt.getCast() == "larva") {
					this.setNbrOfLarvas(-1);
					System.out.println("nouvel adulte");
					if (((Larva) currentAnt).getAdultCast() == "queen") {

						Queen queen = new Queen(currentAnt.getIdentifier(), 50, "queen");
						queen.setAge(currentAnt.getAge());
						iterANTor.remove();
						iterANTor.add(queen);
						this.setNbrOfQueens(1);
					} else if (((Larva) currentAnt).getAdultCast() == "male") {

						Male male = new Male(currentAnt.getIdentifier(), 20, "male");
						male.setAge(currentAnt.getAge());
						iterANTor.remove();
						iterANTor.add(male);
						this.setNbrOfMales(1);
					} else if (((Larva) currentAnt).getAdultCast() == "worker") {

						Worker worker = new Worker(currentAnt.getIdentifier(), 50, "worker");
						worker.setAge(currentAnt.getAge());
						iterANTor.remove();
						iterANTor.add(worker);
						this.setNbrOfWorkers(1);
					}
					System.out.println("Fourmis n° " + currentAnt.getIdentifier() + " caste: " + currentAnt.getCast()
							+ " age: " + currentAnt.getAge() + " évolue en :" + ((Larva) currentAnt).getAdultCast());
				} else {
					System.out.println("Une fourmis " + currentAnt.getCast() + " est morte");
					iterANTor.remove();
					this.setNbrOfAnt(-1);
					this.setNbrOfDeath(1);
					switch (currentAnt.getCast()) {
					case "queen":
						this.setNbrOfQueens(-1);
						break;
					case "male":
						this.setNbrOfMales(-1);
						break;
					case "worker":
						this.setNbrOfWorkers(-1);
						break;
					}
				}
			} else {
				System.out.println("Fourmis n° " + currentAnt.getIdentifier() + " caste: " + currentAnt.getCast()
						+ " age: " + currentAnt.getAge());
				
			}

		}
	}

	public int getNbrOfAnt() {
		return nbrOfAnt;
	}

	public void setNbrOfAnt(int nbrOfAntAdd) {
		this.nbrOfAnt = this.nbrOfAnt + nbrOfAntAdd;
	}

	public int getNbrOfQueens() {
		return nbrOfQueens;
	}

	public void setNbrOfQueens(int nbrOfQueens) {
		this.nbrOfQueens += nbrOfQueens;
	}

	public int getNbrOfMales() {
		return nbrOfMales;
	}

	public void setNbrOfMales(int nbrOfMales) {
		this.nbrOfMales += nbrOfMales;
	}

	public int getNbrOfWorkers() {
		return nbrOfWorkers;
	}

	public void setNbrOfWorkers(int nbrOfWorkers) {
		this.nbrOfWorkers += nbrOfWorkers;
	}

	public int getNbrOfLarvas() {
		return nbrOfLarvas;
	}

	public void setNbrOfLarvas(int nbrOfLarvas) {
		this.nbrOfLarvas += nbrOfLarvas;
	}

	public int getAgeOfHill() {
		return ageOfHill;
	}

	public void setAgeOfHill(int ageOfHill) {
		this.ageOfHill += ageOfHill;
	}

	public int getNbrOfBirth() {
		return nbrOfBirth;
	}

	public void setNbrOfBirth(int nbrOfBirth) {
		this.nbrOfBirth += nbrOfBirth;
	}

	public int getNbrOfDeath() {
		return nbrOfDeath;
	}

	public void setNbrOfDeath(int nbrOfDeath) {
		this.nbrOfDeath += nbrOfDeath;
	}

	public int getLastId() {
		return lastId;
	}

	public void setLastId(int lastId) {
		this.lastId = this.lastId + lastId;
	}

	public List<Ant> getArrAnt() {
		return arrAnt;
	}
}
