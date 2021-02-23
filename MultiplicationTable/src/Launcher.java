import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("Please type a number");
		Scanner question = new Scanner(System.in);
		int a = question.nextInt();
		System.out.print("*| ");
		for (int f = 1; f <= a; f++) {
			System.out.print(f + " ");
		}
		System.out.println();

		for (int l = 0; l < a * 2; l++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "| ");
			for (int j = 1; j <= a; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();

		}
	}
}
