package fr.mds.conceptionobjet.anthill.launcher;


import java.util.ListIterator;
import java.util.Scanner;

import fr.mds.conceptionobjet.anthill.model.Ant;
import fr.mds.conceptionobjet.anthill.model.AntHill;
import fr.mds.conceptionobjet.anthill.model.Larva;
import fr.mds.conceptionobjet.anthill.model.Male;
import fr.mds.conceptionobjet.anthill.model.Queen;
import fr.mds.conceptionobjet.anthill.model.Worker;


public class Launcher {
	public static void main(String[] args) {
		// Array who contains the initiation Values for the g
		String[] arrayInitGame;
		Scanner question = new Scanner(System.in);
		// Check the Validity of the Answer
		boolean checkValidResponse;
		do {
			checkValidResponse = true;
			// Display the initiation rules
			System.out.println("Let's initialize the AntHill:");
			System.out.println("nbrOfQueen,nbrOfMales,nbrOfWorkers,nbrOfLarva");
			// initiation of the question
			String a = question.nextLine();
			// Get the answer
			arrayInitGame = a.split(",");
			for (String item : arrayInitGame) {
				char[] tab = item.toCharArray();
				for (char carac : tab) {
					if (!Character.isDigit(carac) && checkValidResponse) {
						checkValidResponse = false;
					}
				}
			}
		} while (arrayInitGame.length != 4 || checkValidResponse == false);

		// Retrieves the parameters that will be used to instantiate of  the AntHill
		int queenInit = Integer.parseInt(arrayInitGame[0]);
		int maleInit = Integer.parseInt(arrayInitGame[1]);
		int workerInit = Integer.parseInt(arrayInitGame[2]);
		int larvaInit = Integer.parseInt(arrayInitGame[3]);
		// instantiation of the AntHill
		AntHill myAntHill = new AntHill(queenInit, maleInit, workerInit, larvaInit);

		// Display the beginning statistics
		System.out.println("<< Day " + myAntHill.getAgeOfHill() + " >>");
		System.out.println("Total number of ants: " + myAntHill.getNbrOfAnt());
		System.out.println("Number of queen: " + myAntHill.getNbrOfQueens());
		System.out.println("Number of worker: " + myAntHill.getNbrOfWorkers());
		System.out.println("Number of male: " + myAntHill.getNbrOfMales());
		System.out.println("Number of larva: " + myAntHill.getNbrOfLarvas());
		System.out.println("Number of birth: " + myAntHill.getNbrOfBirth());
		System.out.println("Number of death: " + myAntHill.getNbrOfDeath());

		// Check if the game must continue
		boolean live = true;

		// As long as there are ants or "live" is true, the game must go on
		while (myAntHill.getNbrOfAnt() > 0 || live) {
			System.out.println("To continue, press enter to go next day or choose a number of days");
			String b = question.nextLine();
			boolean checkInt = true;
			String[] arrayResp = b.split("");
			for (String item : arrayResp) {
				char[] tab = item.toCharArray();
				for (char carac : tab) {
					if (!Character.isDigit(carac) && checkInt) {
						checkInt = false;
					}
				}
			}

			if (!checkInt) {
				System.out.println("Please enter a numeric value.");
			} else {
				int response;
				if (b.equals("")) {
					response = 1;
				} else {
					response = Integer.parseInt(b);
				}
				myAntHill.nextDay(response);
				System.out.println("+ " + response + " jours");
				myAntHill.setAgeOfHill(response);
				
				System.out.println("<< Day " + myAntHill.getAgeOfHill() + " >>");
				System.out.println("Total number of ants: " + myAntHill.getNbrOfAnt());
				System.out.println("Number of queen: " + myAntHill.getNbrOfQueens());
				System.out.println("Number of worker: " + myAntHill.getNbrOfWorkers());
				System.out.println("Number of male: " + myAntHill.getNbrOfMales());
				System.out.println("Number of larva: " + myAntHill.getNbrOfLarvas());
				System.out.println("Number of birth: " + myAntHill.getNbrOfBirth());
				System.out.println("Number of death: " + myAntHill.getNbrOfDeath());

				

			}
		}
		question.close();
	}
}
