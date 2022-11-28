package com.lemon.array_assignment;

import java.util.Arrays;
import java.util.Scanner;	

public class Array_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayTest();
		middleArray();
		stringArray();
		exceptionArray();
		loopArray();
		multiLoopArray();
		skipLoopArray();
		swapLoopArray();
		sortArray();
		mismatchArray();
		inputArray();
		
	}
		public static void arrayTest() {
	int[] testArray = {1,2,3}; 
	System.out.println("Using for loop:");
	
	for (int x = 0; x < testArray.length; x++) {
		System.out.println(testArray[x]); 
	}
}
		public static void middleArray() {
			int[] testArray = {13,5,7,68,2}; 
			int endOfIndex = testArray.length -1; 
			int mid= endOfIndex /2; 
			
			System.out.println("This is the middle of the array:" + " " + testArray[mid]);
			
			
		}
		public static void stringArray() {
			String[] testArray = {"red", "green", "blue", "yellow"};
			System.out.println("This is the length of the array:" + " " + testArray.length);
			
			String[] cloneArray = testArray.clone();
			System.out.println("This is the cloned array:" + " " + Arrays.toString(cloneArray));
			
		
		}
		
		public static void exceptionArray() {
			int[] testArray = {13,5,7,68,2};
			System.out.println("This is the first index of the array:" + " " + testArray[0] + " " + "And this is the last index of the array:" + " " + testArray[(testArray.length -1)]);
			
			//Output with Exception Error
			//System.out.println("This is the first index of the array:" + " " + testArray[0] + " " + "And this is the last index of the array:" + " " + testArray[(testArray.length)]);
			
			//Attempt to assign a value to testArray[5]
			//testArray[5] = 72; 
		}
		
		public static void loopArray() {
			int[] testArray = {13,5,7,68,2};
			
			for (int x = 0; x < testArray.length; x++) {
				testArray[x] = x; 
				System.out.println(testArray[x]); 
			}	
			System.out.println(Arrays.toString(testArray));
		}
		
		public static void multiLoopArray() {
			int[] testArray = {13,5,7,68,2};
			
			for (int x = 0; x < testArray.length; x++) {
				testArray[x] = x *2; 
				System.out.println(testArray[x]); 
			}	
			System.out.println(Arrays.toString(testArray));
		}
		
		public static void skipLoopArray() {
			int[] testArray = {13,5,7,68,2};
			
			for (int x = 0; x < testArray.length; x++) {
				if (x!= 2) {
				System.out.println("This is not the middle index" + " " + testArray[x]); 
			}else {
				System.out.println("This is the middle index, we're skipping it.");
			}
			
		}
		
		}
		
		public static void swapLoopArray() {
			int[] testArray = {13,5,7,68,2};
			System.out.println("This is the array before the swap" + " " + Arrays.toString(testArray));
			int temp = testArray[0];
			testArray[0] = testArray[2];
			testArray[2] = temp; 
			System.out.println("This is the array after the swap" + " " + Arrays.toString(testArray));
			
			
		}
		public static void sortArray() {
			int[] testArray = {4,2,9,13,1};
			int x = testArray.length -1; 
			Arrays.sort(testArray);
			System.out.println("This is the array in ascending order:" + " " + Arrays.toString(testArray) );
			System.out.println("The smallest number is:" + " " + testArray[0]);
			System.out.println("The biggest number is:" + " " + testArray[x]);
		}
		
		public static void mismatchArray() {
			Object[] mismatch = new Object[5];
			mismatch[0] = Integer.valueOf(42);
			mismatch[1] = "First String";
			mismatch[2] = "Second String";
			mismatch[3] = "Third String";
			mismatch[4] = Double.valueOf(39.9);
			System.out.println("This is a mismatched string:" + " " + Arrays.toString(mismatch) );
		}
		
		public static void inputArray() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter how many favorite things you have: ");
			
		   String sizeOfArrayString =(input.nextLine()); 
		   int arraySize = Integer.parseInt(sizeOfArrayString);
		   
		   String[] favoriteThings; 
		   favoriteThings = new String[arraySize]; 
		   
		   for (int x = 0; x < favoriteThings.length; x++) {
			   System.out.println("Plesase input one of your favorite things:");
			   favoriteThings[x] = (input.nextLine());
		   } 
			   System.out.println(Arrays.toString(favoriteThings)); 
		   }
			  
				
			
		}
		
		
