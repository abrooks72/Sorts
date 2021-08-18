package com.cognixia.jump.quadratic;

public class BubbleSort {
	
	public int[] bubble(int[] myArray) {
		
		int temp = 0;
		
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 1; j < myArray.length-i; j++) {
				if(myArray[j-1] > myArray[j]) {			// Check if element is bigger and swap
					temp = myArray[j-1];
					myArray[j-1] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		
		
		return myArray;
	}
}
