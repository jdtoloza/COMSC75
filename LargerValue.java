/*
 * Joshua Toloza
 * 
 * November 9th, 2022
 * 
 * Description: This program asks the user for a number of items, reads in two arrays of integers
 * and returns a new array with the bigger value of each of the corresponding elements. 
 */
 
 import java.util.Scanner;
 import java.util.Arrays;
 


public class LargerValue{
	
	public static int getNItems(Scanner input) {
		/* Prompts the user to enter how many items
		 * they want in their array. Return number of items */
		
		String prompt = "Please enter the number of items you want: ";
		int nItems = 0;
		
		while (nItems <= 0) {
			System.out.printf( "%s", prompt);
			nItems = input.nextInt();
		}
		return nItems;
	}
	
	public static int[] getArray(Scanner input, int items) {
		/* Prompts user for integer values for their array.
		 * Creates and returns the array*/
		int[] array = new int[items];
		
		System.out.printf("Enter %d integers seperated by spaces: ", items);
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		return array;
	}
	
	public static int[] makeResultArray(int[] arr1, int[] arr2) {
		/* compares 2 arrays and creates a new array containing 
		 * the highest value of each index*/
		int[] primeArr = new int[arr1.length];
		
		for (int i = 0; i < primeArr.length; i++) {
			if (arr1[i] >= arr2[i]) {
				primeArr[i] = arr1[i];
			} else {
				primeArr[i] = arr2[i];
			}
		}
		return primeArr;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		// get number of items user wants in array
		int nItems = getNItems(input);
		
		// Create user arrays
		System.out.println("First array - ");
		int[] array1 = getArray(input, nItems);
		System.out.println("Second Array - ");
		int[] array2 = getArray(input, nItems);
		
		/* Compare the 2 arrays to create an array containing the 
		 highest values at each index*/
		int[] result = makeResultArray(array1, array2);
		
		System.out.println("The larger values are " + Arrays.toString(result));
	}
}

