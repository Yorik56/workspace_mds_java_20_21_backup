package packageTP8;

import java.util.Scanner;

public class ClassTp8 {
	public static void main(String[] args) {
		int[] Suite = {5,6,7,6,8};
		int SuiteLength = Suite.length;
		int numCourant = 1;
		char choix;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Suite de " + SuiteLength + "chiffres");
		for(int i = 0; i < SuiteLength; i++) {
			
			while(Suite[i] != numCourant) {
				System.out.println("Num�ro courant: "+ numCourant + ". Tapez + ou -");
				choix = sc.nextLine().charAt(0);
				if(choix != '+' && choix != '-')  {
					System.out.println("J'ai demand� '+' ou '-' !!  ");
					choix = sc.nextLine().charAt(0);
				}
				if(choix == '+' ) {
					numCourant ++;
				}
				else if (choix == '-') {
					numCourant--;
				}
			}
			if(Suite[i] == numCourant && (SuiteLength - (i+1)) > 0 ) {
				System.out.println("Trouv� !! plus que " + (SuiteLength - (i+1)) +" chiffres � trouver" );
			}
			if((SuiteLength - (i+1)) == 0 && Suite[i] == numCourant) {
				System.out.println("Cadenas Ouvert =)");
			}
		}
		sc.close();
	}
}
