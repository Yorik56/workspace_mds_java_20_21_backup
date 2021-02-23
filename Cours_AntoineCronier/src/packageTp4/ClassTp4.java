package packageTp4;
import java.util.Random;

public class ClassTp4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int cuisson = 0;
		cuisson = rand.nextInt(4)+1;
		
		switch (cuisson) {
			case 1: {
				System.out.println("cuisson bleue, on continue la cuisson");
				break;
			}
			case 2: {
				System.out.println("cuisson saignant, on continue la cuisson");
				break;
			}
			case 3: {
				System.out.println("cuisson cuit, on continue la cuisson");
				break;
			}
			case 4: {
				System.out.println("cuisson à point, etudiant content");
				break;
			}
			case 5: {
				System.out.println("cuisson brulé, étudiant déçus");
				break;
			}
			default: {
				System.out.println("Le random n'as pas bien fonctionné");
			}
			
		}
		
		
	}
}
