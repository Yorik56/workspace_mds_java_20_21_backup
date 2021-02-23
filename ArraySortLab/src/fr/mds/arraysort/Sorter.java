package fr.mds.arraysort;
import java.util.Arrays;

public class Sorter {
	private static int[] myIntArray = new int[10];	
	
	public static void main(String[] args) {
		
		for(int i = 0; i < myIntArray.length; i++) {
			int randomNumber = (int) Math.round(Math.random() * 100);
			myIntArray[i] = randomNumber;
		}
		System.out.println("Initial content: ");
		displayArray(myIntArray);
		
		System.out.println("Result bubble: ");
		displayArray(bubbleSort(myIntArray));
		
		System.out.println("Result selection: ");
		displayArray(selectionSort(myIntArray));
		
		System.out.println("Result insertion: ");		
		displayArray(insertionSort(myIntArray));
	}
	
	public static int[] bubbleSort(int[] array) {
		int temp;
		for(int i = 0; i < array.length -1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;	
				}
			}
		}
		return array;
	}
	
	public static int[] selectionSort(int[] array) {
		for(int i = 0; i < array.length -1; i++) {
			int Smallsub = i;
			for (int j = i+1; j < array.length-1; j++) {
				if(array[j] < array[Smallsub]) {
					Smallsub = j;					
					System.out.println("s: " + Arrays.toString(array));
				}
			}
			
			int Temp = array[i];
			array[i] = array[Smallsub];
			array[Smallsub] = Temp;			
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array) {
		for(int i = 0; i < array.length -1; i++) {
			int j = i;
			while(j>=1 && (array[j] < array[j-1])) {
				int Temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = Temp;
				j = j-1;
			}			
		}
		return array;
	}
	
	public static void displayArray(int[] array) {
		for(int i = 0; i < array.length ; i++) {
			if (i == array.length-1) {
				System.out.println(array[i]+";");
			}
			else {
				System.out.print(array[i]+",");
			}
		}
	}
}
