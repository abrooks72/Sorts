package com.cognixia.jump.quadratic;

public class InsertionSort {
	
	public static int[] insertion(int[] arr) {
		int hole, valueToInsert;
		
		for(int i = 1; i < arr.length; i++) {
			valueToInsert = arr[i];
			hole = i;
			
			while(hole > 0 && arr[hole-1] > valueToInsert) {
				arr[hole] = arr[hole-1];
				hole = hole - 1;
			}
			
			arr[hole] = valueToInsert;
		}
		
		return arr;
	}
}
