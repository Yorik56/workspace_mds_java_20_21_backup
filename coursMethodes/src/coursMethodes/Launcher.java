package coursMethodes;
//OverLoad Deux m�thodes on le m�me nom, mais ne demande pas le m�me nombre d'arguments,
//Au moment de l'appel, en fonction du nombre d'argument donn�s c'est la fonction 
public class Launcher {
	public static void main(String[] args) {
		sayHello("William");
		int a =10;
		int b = 20;
		
		int result = add(a,b);
		System.out.println("result " + result);
	}
	
	static int add(int first, int second) {
		return  first + second;
	}
	
	static void sayHello(String name) {
		System.out.println("Hello" + name);
	}
	
	static void sayHello(String name, int times) {
		for (int i = 0; i< times; i++) {
			sayHello(name);
		}
	}
}