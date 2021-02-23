package packageTP3;

import java.util.Scanner;

public class ClassTp3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tapez deux chiffres");
		int test = 0;
		int test2 = 0;
		test = sc.nextInt();
		System.out.println(test);
		test2 = sc.nextInt();
		System.out.println(test2);

		if (test == test2) {
			System.out.println(test + test2);
		}

		if (test < 0 && test2 >= 0) {
			System.out.println(test * test2);
		}

		if (((test < 0 && test2 < 0) || (test >= 0 && test2 > 0)) 
				&& (test > 10 || test2 > 10) || (test < -10 || test2 < -10)) {
			System.out.println("Division: " + test / test2);
		}
		
		sc.close();

	}
}
