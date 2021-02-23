package packageTp6;

import java.util.Scanner;

public class ClassTp6 {
	public static void main(String[] args) {
		int l = 0;
		int L = 0;
		String rectangle = "";
		Scanner sc = new Scanner(System.in);
		String newLine = System.getProperty("line.separator");

		System.out.println("Combien largeur ?");
		l = sc.nextInt();
		
		System.out.println("Combien longueur ?");
		L = sc.nextInt();
		
		System.out.println("L: " + L + " l: " + l);
		
		for(int i = 0; i< l; i++) {
			for(int j = 0; j<L; j++) {
				rectangle += "*";
			}
			System.out.println(rectangle);
			rectangle = "";
		}
		sc.close();
	}
}
