import java.util.Scanner;

//OverLoad Deux m�thodes on le m�me nom, mais ne demande pas le m�me nombre d'arguments,
//Au moment de l'appel, en fonction du nombre d'argument donn�s c'est la fonction 
public class Launcher {
	public static void main(String[] args) {
		int randomNumber = (int) Math.round(Math.random() * 100);
		System.out.println(randomNumber);
		System.out.println("Please type a number");
		Scanner question = new Scanner(System.in);
		int a = question.nextInt();
		while (a != randomNumber) {
			if (a < randomNumber) {
				System.out.println("Lower");
				a = question.nextInt();
			}
			else if (a > randomNumber) {
				System.out.println("Higher");
				a = question.nextInt();
			}
		}
		System.out.println("hello, you typed: " + a);
	}

}