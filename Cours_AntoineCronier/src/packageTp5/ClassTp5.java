package packageTp5;

import java.util.Scanner;

public class ClassTp5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pommesJasmine = 0;
		int pommesAladin = 0;
		int donAladin = 0;
		int panierCommun = 0;
		
		
		
		do {
			System.out.println("Donner des pommes � Jasmine");
			pommesJasmine = sc.nextInt();
		}while(pommesJasmine < 0);
		System.out.println("Jasmine poss�de : " + pommesJasmine + " pommes.");
		
		do {
			System.out.println("Donner des pommes � Aladin");
			pommesAladin = sc.nextInt();
		}while(pommesAladin < 0);
		System.out.println("Aladin poss�de : " + pommesAladin + " pommes.");
		


		for (int i = 0; i < pommesAladin / 2; i++) {
			donAladin++;
			System.out.println("une pomme");
		}
		pommesAladin -= donAladin;
		pommesJasmine += donAladin;

		while (pommesJasmine > 0 || pommesAladin > 0) {
			if (pommesJasmine > 0 && pommesAladin > 0) {
				pommesJasmine--;
				pommesAladin--;
				panierCommun++;
				System.out.println("une pomme de Jasmine|Aladin. Le panier commun contient: " + panierCommun
						+ " pommes.Jasmine � " + pommesJasmine + "pommes et Aladin � " + pommesAladin + "pommes");
			} else if (pommesJasmine > 0) {
				pommesJasmine--;
				panierCommun++;
				System.out.println("une pomme de Jasmine. Le panier commun contient: " + panierCommun
						+ " pommes.Jasmine � " + pommesJasmine + "pommes et Aladin � " + pommesAladin + "pommes");

			}

			else if (pommesAladin > 0) {
				pommesJasmine--;
				panierCommun++;
				System.out.println("une pomme de Aladin. Le panier commun contient: " + panierCommun
						+ " pommes.Jasmine � " + pommesJasmine + "pommes et Aladin � " + pommesAladin + "pommes");
			}

		}

		sc.close();
	}
}
