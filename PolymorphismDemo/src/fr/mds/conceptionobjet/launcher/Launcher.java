package fr.mds.conceptionobjet.launcher;

import fr.mds.conceptionobjet.model.Flower;
import fr.mds.conceptionobjet.model.Tree;
import fr.mds.conceptionobjet.model.Vegetal;

public class Launcher {
	public static void main(String[] args) {
		//Polymorphism => Variable of type mother can reference a child "type"
		//Polymorphism => Declared type and true type not the same
		
		//DeclaredType = TrueType
		Flower flower1 = new Flower();
		flower1.wither();
		
		//Polymorphysm
		Vegetal vegetal1 = new Flower();
		vegetal1.grow();
		
		
//		Tree treeCasted = (Tree) vegetal1;
//		treeCasted.loseleaf();
		
		if(vegetal1 instanceof Flower) {
			System.out.println("hey, We got a flower");
			Flower flowerCasted = (Flower) vegetal1;
			flowerCasted.wither();
		}
		else if (vegetal1 instanceof Tree) {
			System.out.println("hey, we got a tree here");
			Tree treeCasted = (Tree) vegetal1;
			treeCasted.loseleaf();
		}

		
		// L'ArrayList ne pourra pas contenir des classe qui ne sont pas 
		// du type vegetal, ou de types hérités de vegetal
		
//		ArrayList<Vegetal> vegetals = new ArrayList<>();//		
//		vegetals.add(new Flower());
//		vegetals.add(new Tree());
	}
}
