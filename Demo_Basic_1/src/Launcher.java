
public class Launcher {
	public static void main(String[] args) {
		int toto = 10;
		//	Does toto is accessible ?
		//	Does bob is accessible ?
		if (toto >= 10 ) {
			int bob = 0;
			//	Does toto is accessible ?
			System.out.println("toto: "+toto);
			//	Does bob is accessible ?
			System.out.println("bob: "+bob);
			if (bob < 0) {
				//	Does toto is accessible ?
				//	Does bob is accessible ?
				System.out.println("bob is negative");
			}
			else {
				System.out.println("bob is not negative");
			}
		}
	}
}
