package packageTP9;

import java.util.Arrays;

//import java.util.Scanner;


public class ClassTp9 {
	public static void main(String[] args) {
		int[] temperature = {-2000,654,5221,665,-808,-2,4};
		int temperatureLength = temperature.length;		
		int[] zeroClosest = new int[temperatureLength];
		
		
		if(temperatureLength == 0) {
			System.out.println("0 (tableau vide)");
		}
		else {
			System.out.println("debug");
			int insertion = 0;
			for (int i = 0; i < temperature.length; i++) {
				if((temperature[i] > -273) && (temperature[i] < 5526 )) {
					if(temperature[i] < 0) {
						System.out.println("negatif: " + (0 - temperature[i]));
						zeroClosest[insertion] = Math.abs(temperature[i]);
						insertion ++;
					}
					else{
						System.out.println("positif: " + temperature[i]);
						zeroClosest[insertion] = temperature[i];
						insertion ++;
					}
				}
			}
			
			int[] zeroClosestTroncated = new int[insertion];			
			for (int i=0; i<zeroClosestTroncated.length;i++) {
				zeroClosestTroncated[i] = zeroClosest[i];
			}
			
			
			int temp;
			System.out.println(Arrays.toString(zeroClosestTroncated));
			for(int i = 0; i < zeroClosestTroncated.length -1; i++) {
				for (int j = 0; j < zeroClosestTroncated.length-1; j++) {
					if(zeroClosestTroncated[j] > zeroClosestTroncated[j+1]) {
						temp = zeroClosestTroncated[j];
						zeroClosestTroncated[j] = zeroClosestTroncated[j+1];
						zeroClosestTroncated[j+1] = temp;	
					}
				}
			}			
			System.out.println(Arrays.toString(zeroClosestTroncated));			
		}
	}
}
