package packageTp2;

public class ClassTp2 {
	
	
	public static void main(String[] args) {
		squareSides();
	}
	
	public static void squareSides(){
		 int side1;
		 int side2;
		 int side3;
		 int side4;
		 
		 side1 = 5;
		 side2 = side1;
		 side3 = side1;
		 side4 = side1;
		 System.out.println(side2);
		 int perimetre = side1 + side2 + side3 + side4;
		 System.out.println("perimètre: " + perimetre);
		 
		 int air = side1 * side2;
		 System.out.println("aire :" + air);
		 
		 side2 = 10;
		 side3 = side2;
		 int perimetreRectangle = side1 + side2 + side3 + side4;
		 System.out.println("perimetreRectangle: " + perimetreRectangle);
		 
		 int airRectangle = side1 * side2;
		 System.out.println("air du rectangle: " + airRectangle);
	}
	
	
	
}
