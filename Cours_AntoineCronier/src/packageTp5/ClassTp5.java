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
			System.out.println("Donner des pommes à Jasmine");
			pommesJasmine = sc.nextInt();
		}while(pommesJasmine < 0);
		System.out.println("Jasmine possède : " + pommesJasmine + " pommes.");
		
		do {
			System.out.println("Donner des pommes à Aladin");
			pommesAladin = sc.nextInt();
		}while(pommesAladin < 0);
		System.out.println("Aladin possède : " + pommesAladin + " pommes.");
		


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
						+ " pommes.Jasmine à " + pommesJasmine + "pommes et Aladin à " + pommesAladin + "pommes");
			} else if (pommesJasmine > 0) {
				pommesJasmine--;
				panierCommun++;
				System.out.println("une pomme de Jasmine. Le panier commun contient: " + panierCommun
						+ " pommes.Jasmine à " + pommesJasmine + "pommes et Aladin à " + pommesAladin + "pommes");

			}

			else if (pommesAladin > 0) {
				pommesJasmine--;
				panierCommun++;
				System.out.println("une pomme de Aladin. Le panier commun contient: " + panierCommun
						+ " pommes.Jasmine à " + pommesJasmine + "pommes et Aladin à " + pommesAladin + "pommes");
			}

		}

		sc.close();
	}
}
