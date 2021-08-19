package com.cognixia.jump.sort.driver;

import com.cognixia.jump.quadratic.BubbleSort;

public class Driver {

	static int arr[] = {3,60,35,2,45,320,5};
	static int result[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array Before Bubble Sort");  		// Before array
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println(); 
		result = BubbleSort.bubble(arr);
		
		System.out.println("Array After Bubble Sort");  		// After sort array
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }
	}

}
