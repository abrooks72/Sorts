package com.cognixia.jump.sort.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.cognixia.jump.nlog.HeapSort;
import com.cognixia.jump.nlog.MergeSort;
import com.cognixia.jump.quadratic.BubbleSort;
import com.cognixia.jump.quadratic.BucketSort;
import com.cognixia.jump.quadratic.InsertionSort;
import com.cognixia.jump.quadratic.QuickSort;
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
        System.out.println("4: Quick Sort");
        System.out.println("5: Bucket Sort");
        System.out.println("6: Heap Sort");
        System.out.println("7: Merge Sort");
        
        System.out.println("What sorting algorithm would you like to use: ");
        int choice = scan.nextInt();
        scan.close();
        
        
        System.out.println("\n");
        long startTime;
        long endTime;
        
        if(choice == 1) {
        	System.out.println("Utilizing Bubble sort");
        	startTime = System.currentTimeMillis();
        	result = BubbleSort.bubble(arr);
        	endTime = System.currentTimeMillis();
        	System.out.println("Time: " + (endTime - startTime) + " milliseconds");
        }
        else if(choice == 2) {
        	System.out.println("Utilizing Insertion sort");
        	startTime = System.currentTimeMillis();
        	result = InsertionSort.insertion(arr);
        	endTime = System.currentTimeMillis();
        	System.out.println("Time: " + (endTime - startTime) + " milliseconds");
        }
        else if(choice == 3) {
        	System.out.println("Utilizing Selection sort");
        	startTime = System.currentTimeMillis();
        	result = SelectionSort.selection(arr);
        	endTime = System.currentTimeMillis();
        	System.out.println("Time: " + (endTime - startTime) + " milliseconds");
        }
        else if(choice == 4) {
        	System.out.println("Utilizing Quick sort");
        	startTime = System.currentTimeMillis();
        	QuickSort.quickSort(arr, 0, arr.length-1);
        	endTime = System.currentTimeMillis();
        	System.out.println("Time: " + (endTime - startTime) + " milliseconds");
        }
        else if(choice == 5) {
        	System.out.println("Utilizing Bucket sort");
        	startTime = System.currentTimeMillis();
        	result = BucketSort.bucketsort(arr);
        	endTime = System.currentTimeMillis();
        	System.out.println("Time: " + (endTime - startTime) + " milliseconds");
        }
        else if(choice == 6) {
        	System.out.println("Utilizing Heap sort");
        	startTime = System.currentTimeMillis();
        	HeapSort.sort(arr);
        	endTime = System.currentTimeMillis();
        	System.out.println("Time: " + (endTime - startTime) + " milliseconds");
        }
        else if(choice == 7) {
        	System.out.println("Utilizing Merge sort");
        	startTime = System.currentTimeMillis();
        	MergeSort.Sort(arr,0,arr.length-1);
        	endTime = System.currentTimeMillis();
        	System.out.println("Time: " + (endTime - startTime) + " milliseconds");
        }
        
        
		System.out.println("Array After Sorting");  		// After sort array
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }
        
        
	}

}
