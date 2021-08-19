package com.cognixia.jump.sort.driver;

import java.util.Scanner;

import com.cognixia.jump.quadratic.BubbleSort;
import com.cognixia.jump.quadratic.InsertionSort;
import com.cognixia.jump.quadratic.SelectionSort;

public class Driver {

	static int arr[] = {3,60,35,2,45,320,5};
	static int result[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Array Before Sorting");  		// Before array
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println("\n"); 
        
        System.out.println("1: Bubble Sort");
        System.out.println("2: Insertion Sort");
        System.out.println("3: Selection Sort");
        
        System.out.println("What sorting algorithm would you like to use: ");
        int choice = scan.nextInt();
        scan.close();
        
        
        
        if(choice == 1) {
        	System.out.println("Utilizing Bubblesort");
        	result = BubbleSort.bubble(arr);
        }
        else if(choice == 2) {
        	System.out.println("Utilizing Insertionsort");
        	result = InsertionSort.insertion(arr);
        }
        else if(choice == 3) {
        	System.out.println("Utilizing Selectionsort");
        	result = SelectionSort.selection(arr);
        }
        
		System.out.println("Array After Sorting");  		// After sort array
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }
	}

}
