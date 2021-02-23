public class Launcher {
	public static void main(String[] args) {
		String newLine = System.getProperty("line.separator");

		System.out.println("ligne: " + newLine);
		line(8);

		System.out.println("carré: " + newLine);
		square(8);

		System.out.println("carré vide: " + newLine);
		emptySquare(8);

		System.out.println("triangle: " + newLine);
		triangle(8);

		System.out.println("fullTriangle: " + newLine);
		fullTriangle(9);
	}

	/**
	 * affiche une ligne de n *
	 *
	 * @param n
	 */
	private static void line(int n) {
		String line = "";
		for (int i = 0; i < n; i++) {
			line += "*";
		}
		System.out.println(line);
	}

	/**
	 * affiche n lignes de n *
	 *
	 * @param n
	 */
	private static void square(int n) {
		String newLine = System.getProperty("line.separator");
		String square = "";
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				square += "*";
			}
			square += newLine;
		}
		System.out.println(square);
	}

	/**
	 * affiche affiche un carré vide
	 *
	 * @param n
	 */
	private static void emptySquare(int n) {
		String newLine = System.getProperty("line.separator");
		String emptySquare = "";
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				for (int j = 0; j < n; j++) {
					emptySquare += "*";
				}
			} else {
				for (int k = 0; k < n; k++) {
					if (k == 0 || k == n - 1) {
						emptySquare += "*";
					} else {
						emptySquare += " ";
					}

				}
			}
			emptySquare += newLine;
		}
		System.out.println(emptySquare);
	}

	/**
	 * affiche un triangle
	 *
	 * @param n
	 */
	private static void triangle(int n) {
		String newLine = System.getProperty("line.separator");
		String triangle = "";
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < j; i++) {
				triangle += "*";
			}
			triangle += newLine;
		}
		System.out.println(triangle);

	}

	/**
	 * affiche un triangle centré
	 *
	 * @param n
	 */
	private static void fullTriangle(int n) {

		String newLine = System.getProperty("line.separator");
		String fullTriangle = "";
		for (int j = 0; j <= n; j++) {
			if (j % 2 != 0) {
				for(int i = 0; i < ((n-j)/2);i++ ) {
					fullTriangle += " ";
				}
				for(int i = 0; i < j;i++ ) {
					fullTriangle += "*";
				}
			}
			fullTriangle += newLine;
		}
		System.out.println(fullTriangle);

	}
}
